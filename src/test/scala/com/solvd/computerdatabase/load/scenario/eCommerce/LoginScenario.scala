package com.solvd.computerdatabase.load.scenario.eCommerce

import com.solvd.computerdatabase.load.BaseSimulation
import io.gatling.core.Predef.scenario
import io.gatling.http.Predef.{flushCookieJar, flushSessionCookies}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

case class LoginScenario() extends BaseSimulation{

  val feeder = csv(loginQueries).circular


  val scn =
    scenario(getClass.getSimpleName)
      .exec(flushSessionCookies)
      .exec(flushCookieJar)
      .feed(feeder)
      .exec(login)

  val populationBuilder = setInjectionProfile(scn, getClass.getSimpleName).protocols(httpProtocol)
  setUp(populationBuilder)
}
