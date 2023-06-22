package computerdatabase.simulations

import computerdatabase.requests.Headers.{headers_0, uri7}
import computerdatabase.requests.NumberRequestGenerator
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SignUpSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://bam.nr-data.net")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")


  object SignUp {
    val scn = exec(
      http("sign_up")
        .post(uri7)
        .headers(headers_0)
        .formParam("utf8", "✓")
        .formParam("authenticity_token", "OWmFl9ZIYJdbSHrZvhm4T8XfYJEapQpWOZy0byCXjECkvDLYxGd9NxjV5agshr0iFGcygS8D+AkbZwNI/zUwBg==")
        .formParam("surname", "")
        .formParam("product", "")
        .formParam("user[bio]", "")
        .formParam("user[location]", "")
        .formParam("user[name]", "Ilia")
        .formParam("user[login]", "latariaaa")
        .formParam("user[email]", "latariailia6@gmail.com")
        .formParam("user[password]", "Iliko2002")
        .formParam("user[agree_to_terms]", "on")
        .formParam("g-recaptcha-response", "03AL8dmw_lLgHs_f8El3CPk-jvalkTa8N5fWbFNDzTktfP5vR47ySN6lmcAxRm1ErpUiFa-9ztOfC6daVeUe8l-NCWSuC_TSNsBjsLemyTctcaS1w2i3bhZGSTeqF-MYiDqxDIQ0DVZo9pnqIgyIvL6L979HcRSOtRgxSsVUN7SdWppKl9bkJEmyrigejG6mEHWwuBp8PcYzaMpq3bvjr0iKqevdFO6xESGmM_Frd5QlLYojxDAZpPxjCHo6oPcB4gFtnNUCT4L5ubTeMD2WpvGY8HpjCdGnrkKtCLJBFayGORvRaqJI8qsgeHzzHs5Y86mV_bcq1TZXbaMn2Y-qovD8PgkGTBk3_g5BrK37geKszpAxe-Cz-5A0JYYbUWQDbuSyXSDUyvc23Px7UeI57KP0i_oshrXKoIKv69-uSbMPZZhiO2we5CRGTwNZSUw1gun30pySEPzGgwYJqWI4HUA2NlouE-6-kATroOn9i7bZrwMjtZ6tmUKqSJKrkBU0HbohYyMDhLJ8TeuA23K_N_BiDej6jkT7tCXjJUDfZ3bEt6u7IRrdunqIY")
        .resources(
          NumberRequestGenerator.generateRequest(1),
          NumberRequestGenerator.generateRequest(2),
          NumberRequestGenerator.generateRequest(3),
          NumberRequestGenerator.generateRequest(4),
          NumberRequestGenerator.generateRequest(5),
          NumberRequestGenerator.generateRequest(6),
          NumberRequestGenerator.generateRequest(7),
          NumberRequestGenerator.generateRequest(8),
          NumberRequestGenerator.generateRequest(9),
          NumberRequestGenerator.generateRequest(10),
          NumberRequestGenerator.generateRequest(11),
          NumberRequestGenerator.generateRequest(12),
          NumberRequestGenerator.generateRequest(13)
        )
    )
      .pause(1)
      .exec(
        NumberRequestGenerator.generateRequest(14)
      )
      .pause(2)
      .exec(
        NumberRequestGenerator.generateRequest(15)
      )
  }

  private val scn = scenario("SignUpSimulation").exec(SignUp.scn)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

