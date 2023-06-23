package com.solvd.computerdatabase.load.scenario

import com.solvd.computerdatabase.load.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._



case class SearchScenario() extends BaseSimulation {


  val feeder = csv(searchQueries).circular


  val scn =
    scenario(getClass.getSimpleName)
      .exec(flushSessionCookies)
      .exec(flushCookieJar)
      .feed(feeder)
      .exec(search)

  val populationBuilder = setInjectionProfile(scn, getClass.getSimpleName).protocols(httpProtocol)
  setUp(populationBuilder)
}
