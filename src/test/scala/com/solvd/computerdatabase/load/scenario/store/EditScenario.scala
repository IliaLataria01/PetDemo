package com.solvd.computerdatabase.load.scenario.store

import com.solvd.computerdatabase.load.BaseSimulation
import io.gatling.core.Predef.scenario
import io.gatling.http.Predef.{flushCookieJar, flushSessionCookies}

case class EditScenario() extends BaseSimulation {

  val scn =
    scenario(getClass.getSimpleName)
      .exec(flushSessionCookies)
      .exec(flushCookieJar)
      .exec(edit)


  val populationBuilder = setInjectionProfile(scn, getClass.getSimpleName).protocols(httpProtocol)
  setUp(populationBuilder)
}
