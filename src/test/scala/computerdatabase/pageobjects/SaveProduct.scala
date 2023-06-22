package computerdatabase.pageobjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._



object SaveProduct {
  private val headers_2 = Map("Origin" -> "http://computer-database.gatling.io")

  val saveProduct = {
    http("save_product")
      .post("/computers/313")
      .headers(headers_2)
      .formParam("name", "ASCI Blue Pacific")
      .formParam("introduced", "1998-01-01")
      .formParam("discontinued", "")
      .formParam("company", "13")
  }

}
