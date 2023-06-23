package com.solvd.computerdatabase.pageobjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
object SearchProduct {
  val searchScenario = exec(
    http("home_page")
      .get("/computers")
  )
    .pause(2)
    // select_product
    .exec(
      http("search_product")
        .get("/computers/313")
    )
    .pause(2)
}
