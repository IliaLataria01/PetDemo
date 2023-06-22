package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class RecordedSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://computer-database.gatling.io")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .upgradeInsecureRequestsHeader("1")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/114.0")

  private val headers_2 = Map("Origin" -> "http://computer-database.gatling.io")

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

  object ProcessProduct {
    val saveProduct = exec(
      http("save_product")
        .post("/computers/313")
        .headers(headers_2)
        .formParam("name", "ASCI Blue Pacific")
        .formParam("introduced", "1998-01-01")
        .formParam("discontinued", "")
        .formParam("company", "13")
    )
  }


  private val scn = scenario("Search&Save_product").exec(SearchProduct.searchScenario, ProcessProduct.saveProduct)


  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

