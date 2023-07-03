package com.solvd.computerdatabase.load.models.eCommerce


import io.gatling.core.Predef._
import io.gatling.http.Predef._

object ELoginPage extends AbstractPage {
  
  lazy val clickLogin =
    exec(
      http("click_login")
        .get("/login")
        check(css("#_csrf","content").saveAs("loginCsrfValue"))
    )
      .pause(10) // type_username_and_password
  .exec(
    http("Filling_fields")
      .post("/login")
      .formParam("_csrf", "${loginCsrfValue}")
      .formParam("username", "${username}")
      .formParam("password", "${password}")
  )
    .pause(10) // click_log_out_button
}
