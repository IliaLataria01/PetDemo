package com.solvd.computerdatabase.load.models

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import java.util.concurrent.ThreadLocalRandom

object HomePage extends AbstractPage {



  lazy val searchProduct =
    exec(
      http("Home")
        .get("/")
    )
      .pause(1)
      .exec(
        http("Search")
          .get("/computers?f=${searchCriterion}")
          .check(
            css("a:contains('${searchComputerName}')", "href").saveAs("computerUrl")
          )
      )
      .pause(1)
      .exec(session => {
        val computerUrl = session("computerUrl").as[String]
        println(s"computerUrl: $computerUrl")
        session
      })
      .exec(
        http("Select")
          .get("${computerUrl}")
          .check(status.is(200))
      )
      .pause(minThinkTime, maxThinkTime)


  lazy val browseProduct =
    repeat(4, "i") {
      exec(
        http("Page #{i}").get("/computers?p=#{i}")
      ).pause(minThinkTime, maxThinkTime)
    }


  lazy val editProduct =
    tryMax(2) {
      exec(
        http("Form")
          .get("/computers/new")
      )
        .pause(1)
        .exec(
          http("Post")
            .post("/computers")
            .formParam("name", "Beautiful Computer")
            .formParam("introduced", "2012-05-30")
            .formParam("discontinued", "")
            .formParam("company", "37")
            .check(
              status.is { session =>
                // we do a check on a condition that's been customized with
                // a lambda. It will be evaluated every time a user executes
                // the request
                200 + ThreadLocalRandom.current().nextInt(2)
              }
            )
        )
    }
      .pause(minThinkTime, maxThinkTime)

}
