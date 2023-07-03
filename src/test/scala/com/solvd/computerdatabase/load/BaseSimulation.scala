package com.solvd.computerdatabase.load

import com.solvd.computerdatabase.load.models.eCommerce.{EHomePage, ELoginPage, EProductPage}
import com.solvd.computerdatabase.load.models.store.HomePage
import com.solvd.computerdatabase.load.util.ConfigUtil
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef.http

import scala.concurrent.duration._

class BaseSimulation extends Simulation with ConfigUtil{

  before(println("Current locale -> " + locale + "\n"
    + "Current codebase ->" + codebase + "\n"
    + "Env variables set: simulationMode -> " + simulationMode + "\n"
    + ", simulationDuration -> " + simulationDuration + "\n"
    + ", durationMeasurements -> " + durationMeasurements + "\n"))

  def getSimulationDuration() = simulationDuration.toInt

  def getLoad(scnName: String) = getIntValueFromConfig(String.format("sf.%s.%s", simulationMode, scnName))

  val httpProtocol =
      http
        .baseUrl(baseUrl)
        .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
        .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
        .acceptEncodingHeader("gzip, deflate")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .upgradeInsecureRequestsHeader("1")
        .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/114.0")

  def setInjectionProfile(scenario: ScenarioBuilder, scnName: String) = {
    if (durationMeasurements.equals("hours")) {
      scenario.inject(rampUsers(getLoad(scnName) * getSimulationDuration()) during getSimulationDuration().hours)
    } else if (durationMeasurements.equals("minutes")) {
      scenario.inject(rampUsers(getLoad(scnName)) during getSimulationDuration().minutes)
    } else {
      scenario.inject(rampUsers(getLoad(scnName)) during getSimulationDuration().seconds)
    }
  }

  /***
   *
   * Computer's Demo site
   *
   *
   */

  lazy val search = exec(HomePage.searchProduct)

  lazy val edit = exec(HomePage.editProduct)

  lazy val browse = exec(HomePage.browseProduct)


  /***
   *
   *  eCommerce Demo site
   *
   *
   */

  lazy val visitHomePage = exec(EHomePage.visitHomePage)
  lazy val visitAboutUsPage = exec(EHomePage.visitAboutUsPage)
  lazy val visitContactPage = exec(EHomePage.visitContactPage)
  lazy val visitAPIPage = exec(EHomePage.visitAPIPage)

  lazy val selectAll = exec(EHomePage.selectAllProducts)
  lazy val selectOnlyForHim = exec(EHomePage.selectOnlyBoyProducts)
  lazy val selectOnlyForHer = exec(EHomePage.selectOnlyGirlProducts)
  lazy val selectUnisex = exec(EHomePage.selectUnisexProducts)

  lazy val login = exec(ELoginPage.clickLogin)

  lazy val addProduct = exec(EProductPage.addProduct)


}
