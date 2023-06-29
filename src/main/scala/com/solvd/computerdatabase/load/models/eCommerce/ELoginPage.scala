package com.solvd.computerdatabase.load.models.eCommerce


import io.gatling.core.Predef._
import io.gatling.http.Predef._

object ELoginPage extends AbstractPage {
  
  lazy val clickLogin =
    exec(
      http("request_0")
        .get("/login")
    )
      .pause(15) // type_username_and_password
  .exec(
    http("request_1")
      .post("/login")
      .formParam("_csrf", "f6208b7b-dc32-499c-bb49-0c78577a205f")
      .formParam("username", "john")
      .formParam("password", "pass")
  )
    .pause(55) // click_log_out_button
  .exec(
    http("request_2")
      .post("http://" + "demostore.gatling.io" + "/logout")
      .formParam("_csrf", "c4e72bb8-e5aa-4479-97ef-a6e3d0585bab")
  );



}
