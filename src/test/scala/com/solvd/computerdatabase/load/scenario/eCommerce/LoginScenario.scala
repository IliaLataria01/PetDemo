package com.solvd.computerdatabase.load.scenario.eCommerce

import com.solvd.computerdatabase.load.BaseSimulation
import io.gatling.core.Predef.scenario
import io.gatling.http.Predef.{flushCookieJar, flushSessionCookies}

case class LoginScenario() extends BaseSimulation{


  val scn =
    scenario(getClass.getSimpleName)
      .exec(flushSessionCookies)
      .exec(flushCookieJar)
      .exec(login)

  val populationBuilder = setInjectionProfile(scn, getClass.getSimpleName).protocols(httpProtocol)
  setUp(populationBuilder)
}
