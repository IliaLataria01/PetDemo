package com.solvd.computerdatabase.load.models.eCommerce

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object EProductPage extends AbstractPage {

  lazy val addProduct =
    exec(
      http(s"Load Product page - #{productName}")
        .get("/product/#{productName}")
        .check(css("#ProductDescription").is("#{productDescription}"))
    )
      .pause(10)
      .exec(
        http("Adding Product - #{productName} to cart")
          .get("/cart/add/#{productId}")
      )
}
