package com.solvd.computerdatabase.load.models.eCommerce

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object EHomePage extends AbstractPage{


  lazy val visitHomePage =
    exec(http("visit_home_page").get("/"))
      .pause(minThinkTime, maxThinkTime)

  lazy val visitAboutUsPage = exec(
      http("visit_aboutUs_page")
        .get("/about-us"))

  lazy val visitContactPage = exec(
      http("visit_contact_page")
        .get("/contact"))

  lazy val visitAPIPage = exec(
      http("visit_api_page")
        .get("/rest-api"))

  lazy val selectAllProducts = exec(
      http("select_all_products")
        .get("/category/all"))

  lazy val selectOnlyBoyProducts = exec(
      http("select_only_for_him")
        .get("/category/for-him"))

  lazy val selectOnlyGirlProducts = exec(
      http("select_only_for_her")
        .get("/category/for-her"))

  lazy val selectUnisexProducts = exec(
      http("select_unisex")
        .get("/category/unisex"))



}
