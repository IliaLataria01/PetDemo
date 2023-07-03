package com.solvd.computerdatabase.load.scenario.eCommerce

import com.solvd.computerdatabase.load.BaseSimulation
import io.gatling.core.Predef.scenario
import io.gatling.http.Predef.{flushCookieJar, flushSessionCookies}
import io.gatling.core.Predef._


case class AddProductScenario() extends BaseSimulation {
  val feeder = csv(productQueries).random

  val scn =
    scenario(getClass.getSimpleName)
      .exec(flushSessionCookies)
      .exec(flushCookieJar)
      .feed(feeder)
      .exec(addProduct)

  val populationBuilder = setInjectionProfile(scn, getClass.getSimpleName).protocols(httpProtocol)
  setUp(populationBuilder)
}
