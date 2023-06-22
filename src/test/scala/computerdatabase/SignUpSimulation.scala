package computerdatabase



import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SignUpSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://bam.nr-data.net")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")

  private val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "origin" -> "https://dribbble.com",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1"
  )

  private val headers_1 = Map(
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS"
  )

  private val headers_3 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site"
  )

  private val headers_5 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CJW2yQEIo7bJAQipncoBCMCHywEIkqHLAQijnM0BCIagzQEIi6fNAQjhqs0BCPurzQE="
  )

  private val headers_6 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "access-control-request-headers" -> "content-type",
    "access-control-request-method" -> "POST",
    "origin" -> "https://dribbble.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-site"
  )

  private val headers_7 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "access-control-request-headers" -> "cross-origin-resource-policy",
    "access-control-request-method" -> "POST",
    "origin" -> "https://dribbble.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site"
  )

  private val headers_8 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CJW2yQEIo7bJAQipncoBCMCHywEIkqHLAQijnM0BCIagzQEIi6fNAQjhqs0BCPurzQE="
  )

  private val headers_10 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "content-type" -> "application/json; charset=UTF-8",
    "origin" -> "https://dribbble.com",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-site"
  )

  private val headers_12 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "cross-origin-resource-policy" -> "cross-origin",
    "origin" -> "https://dribbble.com",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site"
  )

  private val headers_14 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Origin" -> "https://dribbble.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site",
    "content-type" -> "text/plain",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS"
  )

  private val headers_15 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "origin" -> "https://dribbble.com",
    "sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site"
  )

  private val uri1 = "https://www.google-analytics.com"

  private val uri2 = "https://www.google.ge/pagead/1p-user-list/787470371"

  private val uri3 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/787470371"

  private val uri4 = "https://www.googletagmanager.com/gtag/js"

  private val uri5 = "https://www.google.com/pagead/1p-user-list/787470371"

  private val uri6 = "https://t.dribbble.com/com.dribbble/t"

  private val uri7 = "https://dribbble.com/signup"

  private val uri9 = "https://api.amplitude.com"


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
          http("request_1")
            .get(uri4 + "?id=G-EV4S8HEMZG&l=dataLayer&cx=c")
            .headers(headers_1),
          http("request_2")
            .get(uri4 + "?id=AW-787470371&l=dataLayer&cx=c")
            .headers(headers_1),
          http("request_3")
            .get(uri1 + "/collect?v=1&_v=j101&a=191242176&t=pageview&_s=1&dl=https%3A%2F%2Fdribbble.com%2Fget-started&ul=en-gb&de=UTF-8&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&sd=30-bit&sr=1512x982&vp=935x792&je=0&_u=QACAAUABAAAAAAAAI~&jid=&gjid=&cid=72302696.1687356076&tid=UA-24041469-1&_gid=1409447530.1687356076&gtm=457e36e2&jsscut=1&z=1621824624")
            .headers(headers_3),
          http("request_4")
            .get(uri1 + "/collect?v=1&_v=j101&a=191242176&t=pageview&_s=2&dl=https%3A%2F%2Fdribbble.com%2Fget-started&ul=en-gb&de=UTF-8&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&sd=30-bit&sr=1512x982&vp=935x792&je=0&_u=QACAAUABAAAAAAAAI~&jid=&gjid=&cid=72302696.1687356076&tid=UA-24041469-1&_gid=1409447530.1687356076&gtm=457e36e2&jsscut=1&z=399292552")
            .headers(headers_3),
          http("request_5")
            .get(uri3 + "/?random=1687356517661&cv=11&fst=1687356517661&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&hn=www.googleadservices.com&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&auid=1965716784.1687356076&data=event%3Dgtag.config&rfmt=3&fmt=4")
            .headers(headers_5),
          http("request_6")
            .options(uri6)
            .headers(headers_6),
          http("request_7")
            .options(uri9 + "/")
            .headers(headers_7),
          http("request_8")
            .get(uri5 + "/?random=1687356517661&cv=11&fst=1687356000000&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=4031486304&rmt_tld=0&ipr=y")
            .headers(headers_8),
          http("request_9")
            .get(uri2 + "/?random=1687356517661&cv=11&fst=1687356000000&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=4031486304&rmt_tld=1&ipr=y")
            .headers(headers_8),
          http("request_10")
            .post(uri6)
            .headers(headers_10)
            .body(RawFileBody("computerdatabase/signupsimulation/0010_request.txt")),
          http("request_11")
            .post(uri6)
            .headers(headers_10)
            .body(RawFileBody("computerdatabase/signupsimulation/0011_request.txt")),
          http("request_12")
            .post(uri9 + "/")
            .headers(headers_12)
            .formParam("checksum", "a34b46fae159b1ff810cd4e3108c7c88")
            .formParam("client", "2cb22d7008b942885ae37c251bec6fb9")
            .formParam("e", """[{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517624,"event_id":2,"session_id":1687356076329,"event_type":"$identify","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{},"user_properties":{"$set":{"collections_count":0,"comments_count":0,"comments_received_count":0,"created_at":"2023-06-21T10:08:35.710-04:00","dribbble_user_id":16675361,"email_address":"latariailia6@gmail.com","email_validation_risk":"low","followers_count":0,"followings_count":0,"has_advanced_search":false,"has_avatar":false,"has_disabled_ads":false,"has_hiring":false,"has_intention_hire":false,"has_intention_inspiration":false,"has_intention_share":false,"has_pro_business":false,"has_pro_trial":false,"has_pro":false,"has_job":false,"hiring_has_hire_me_button":false,"hiring_is_available_for_work":false,"hiring_is_freelance":false,"hiring_is_fulltime":false,"hiring_is_willing_onsite":false,"hiring_is_willing_remote":false,"is_suspended":false,"is_team_member":false,"is_team_owner":false,"is_verified":false,"likes_count":0,"likes_received_count":0,"name":"Ilia","projects_count":0,"shots_count":0,"user_type":"Prospect","username":"latariaaa"}},"uuid":"492474e7-7504-4970-8295-76dc9dc1ed89","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":27,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}}]""")
            .formParam("upload_time", "1687356517625")
            .formParam("v", "2"),
          http("request_13")
            .post(uri9 + "/")
            .headers(headers_12)
            .formParam("checksum", "48d48469e63ce00f8997ec27454d0fce")
            .formParam("client", "2cb22d7008b942885ae37c251bec6fb9")
            .formParam("e", """[{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517626,"event_id":26,"session_id":1687356076329,"event_type":"SignedIn","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{"is_authenticated":true,"page_controller":"get_started","page_action":"show","page_title":"Dribbble - Discover the World’s Top Designers & Creative Professionals","page_url":"https://dribbble.com/get-started","page_path":"/get-started","page_search":"","page_referrer":"https://dribbble.com/signup","method":"email"},"user_properties":{},"uuid":"fb2fe1bc-5732-4256-86ee-ff87a405ac7d","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":28,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}},{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517628,"event_id":27,"session_id":1687356076329,"event_type":"PageViewed","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{"is_authenticated":true,"page_controller":"get_started","page_action":"show","page_title":"Dribbble - Discover the World’s Top Designers & Creative Professionals","page_url":"https://dribbble.com/get-started","page_path":"/get-started","page_search":"","page_referrer":"https://dribbble.com/signup"},"user_properties":{},"uuid":"9ce917e0-5666-4e42-b8c7-899fb35b4fd2","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":29,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}}]""")
            .formParam("upload_time", "1687356518132")
            .formParam("v", "2")
        )
    )
      .pause(1)
      .exec(
        http("request_14")
          .post("/1/7840d0c136?a=2909452&v=1.234.0&to=Jg1bREUOClsARUpTBhE9RkRWExJSARgWXAwS&rst=4382&ck=0&s=0f0f3d37ce821e13&ref=https://dribbble.com/get-started&af=err,xhr,stn,ins&qt=3&ap=498&be=1733&fe=2624&dc=528&perf=%7B%22timing%22:%7B%22of%22:1687356515381,%22n%22:0,%22u%22:1750,%22r%22:2,%22ue%22:1750,%22re%22:1048,%22f%22:1048,%22dn%22:1048,%22dne%22:1048,%22c%22:1048,%22s%22:1048,%22ce%22:1048,%22rq%22:1052,%22rp%22:1733,%22rpe%22:1739,%22di%22:2252,%22ds%22:2252,%22de%22:2261,%22dc%22:4352,%22l%22:4353,%22le%22:4357%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&fp=2056&fcp=2056")
          .headers(headers_14)
      )
      .pause(2)
      .exec(
        http("request_15")
          .post(uri1 + "/g/collect?v=2&tid=G-EV4S8HEMZG&gtm=45je36e2&_p=191242176&cid=72302696.1687356076&ul=en-gb&sr=1512x982&uaa=arm&uab=64&uafvl=Not.A%252FBrand%3B8.0.0.0%7CChromium%3B114.0.5735.133%7CGoogle%2520Chrome%3B114.0.5735.133&uamb=0&uam=&uap=macOS&uapv=13.2.0&uaw=0&ngs=1&_s=1&sid=1687356076&sct=1&seg=1&dl=https%3A%2F%2Fdribbble.com%2Fget-started&dr=https%3A%2F%2Fdribbble.com%2Fsignup&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&en=page_view")
          .headers(headers_15)
      )
  }

  private val scn = scenario("SignUpSimulation").exec(SignUp.scn)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

