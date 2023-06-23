package com.solvd.computerdatabase.requests

import com.solvd.computerdatabase.requests.Headers._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder


object NumberRequestGenerator {


  def generateRequest(number: Int): HttpRequestBuilder = {
    number match {
      case 1  =>
        http("request_1")
          .get(uri4 + "?id=G-EV4S8HEMZG&l=dataLayer&cx=c")
          .headers(headers_1)
      case 2  =>
        http("request_2")
          .get(uri4 + "?id=AW-787470371&l=dataLayer&cx=c")
          .headers(headers_1)
      case 3  =>
        http("request_3")
          .get(uri1 + "/collect?v=1&_v=j101&a=191242176&t=pageview&_s=1&dl=https%3A%2F%2Fdribbble.com%2Fget-started&ul=en-gb&de=UTF-8&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&sd=30-bit&sr=1512x982&vp=935x792&je=0&_u=QACAAUABAAAAAAAAI~&jid=&gjid=&cid=72302696.1687356076&tid=UA-24041469-1&_gid=1409447530.1687356076&gtm=457e36e2&jsscut=1&z=1621824624")
          .headers(headers_3)
      case 4  =>
        http("request_4")
          .get(uri1 + "/collect?v=1&_v=j101&a=191242176&t=pageview&_s=2&dl=https%3A%2F%2Fdribbble.com%2Fget-started&ul=en-gb&de=UTF-8&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&sd=30-bit&sr=1512x982&vp=935x792&je=0&_u=QACAAUABAAAAAAAAI~&jid=&gjid=&cid=72302696.1687356076&tid=UA-24041469-1&_gid=1409447530.1687356076&gtm=457e36e2&jsscut=1&z=399292552")
          .headers(headers_3)
      case 5  =>
        http("request_5")
          .get(uri3 + "/?random=1687356517661&cv=11&fst=1687356517661&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&hn=www.googleadservices.com&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&auid=1965716784.1687356076&data=event%3Dgtag.config&rfmt=3&fmt=4")
          .headers(headers_5)
      case 6  =>
        http("request_6")
          .options(uri6)
          .headers(headers_6)
      case 7  =>
        http("request_7")
          .options(uri9 + "/")
          .headers(headers_7)
      case 8  =>
        http("request_8")
          .get(uri5 + "/?random=1687356517661&cv=11&fst=1687356000000&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=4031486304&rmt_tld=0&ipr=y")
          .headers(headers_8)
      case 9  =>
        http("request_9")
          .get(uri2 + "/?random=1687356517661&cv=11&fst=1687356000000&bg=ffffff&guid=ON&async=1&gtm=45be36e2&u_w=1512&u_h=982&url=https%3A%2F%2Fdribbble.com%2Fget-started&ref=https%3A%2F%2Fdribbble.com%2Fsignup&frm=0&tiba=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&data=event%3Dgtag.config&fmt=3&is_vtc=1&random=4031486304&rmt_tld=1&ipr=y")
          .headers(headers_8)
      case 10 =>
        http("request_10")
          .post(uri6)
          .headers(headers_10)
          .body(RawFileBody("computerdatabase/signupsimulation/0010_request.txt"))
      case 11 =>
        http("request_11")
          .post(uri6)
          .headers(headers_10)
          .body(RawFileBody("computerdatabase/signupsimulation/0011_request.txt"))
      case 12 =>
        http("request_12")
          .post(uri9 + "/")
          .headers(headers_12)
          .formParam("checksum", "a34b46fae159b1ff810cd4e3108c7c88")
          .formParam("client", "2cb22d7008b942885ae37c251bec6fb9")
          .formParam("e", """[{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517624,"event_id":2,"session_id":1687356076329,"event_type":"$identify","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{},"user_properties":{"$set":{"collections_count":0,"comments_count":0,"comments_received_count":0,"created_at":"2023-06-21T10:08:35.710-04:00","dribbble_user_id":16675361,"email_address":"latariailia6@gmail.com","email_validation_risk":"low","followers_count":0,"followings_count":0,"has_advanced_search":false,"has_avatar":false,"has_disabled_ads":false,"has_hiring":false,"has_intention_hire":false,"has_intention_inspiration":false,"has_intention_share":false,"has_pro_business":false,"has_pro_trial":false,"has_pro":false,"has_job":false,"hiring_has_hire_me_button":false,"hiring_is_available_for_work":false,"hiring_is_freelance":false,"hiring_is_fulltime":false,"hiring_is_willing_onsite":false,"hiring_is_willing_remote":false,"is_suspended":false,"is_team_member":false,"is_team_owner":false,"is_verified":false,"likes_count":0,"likes_received_count":0,"name":"Ilia","projects_count":0,"shots_count":0,"user_type":"Prospect","username":"latariaaa"}},"uuid":"492474e7-7504-4970-8295-76dc9dc1ed89","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":27,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}}]""")
          .formParam("upload_time", "1687356517625")
          .formParam("v", "2")

      case 13 =>
        http("request_13")
          .post(uri9 + "/")
          .headers(headers_12)
          .formParam("checksum", "48d48469e63ce00f8997ec27454d0fce")
          .formParam("client", "2cb22d7008b942885ae37c251bec6fb9")
          .formParam("e", """[{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517626,"event_id":26,"session_id":1687356076329,"event_type":"SignedIn","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{"is_authenticated":true,"page_controller":"get_started","page_action":"show","page_title":"Dribbble - Discover the World’s Top Designers & Creative Professionals","page_url":"https://dribbble.com/get-started","page_path":"/get-started","page_search":"","page_referrer":"https://dribbble.com/signup","method":"email"},"user_properties":{},"uuid":"fb2fe1bc-5732-4256-86ee-ff87a405ac7d","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":28,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}},{"device_id":"yUYmgWHntljiv9U_LZbLnM","user_id":"16675361","timestamp":1687356517628,"event_id":27,"session_id":1687356076329,"event_type":"PageViewed","version_name":null,"platform":"Web","os_name":"Chrome","os_version":"114","device_model":"Mac OS","device_manufacturer":null,"language":"en-GB","api_properties":{},"event_properties":{"is_authenticated":true,"page_controller":"get_started","page_action":"show","page_title":"Dribbble - Discover the World’s Top Designers & Creative Professionals","page_url":"https://dribbble.com/get-started","page_path":"/get-started","page_search":"","page_referrer":"https://dribbble.com/signup"},"user_properties":{},"uuid":"9ce917e0-5666-4e42-b8c7-899fb35b4fd2","library":{"name":"amplitude-js","version":"8.8.0"},"sequence_number":29,"groups":{},"group_properties":{},"user_agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36","plan":{"branch":"main","source":"js","version":"158"}}]""")
          .formParam("upload_time", "1687356518132")
          .formParam("v", "2")

      case 14 =>
        http("request_14")
                    .post("/1/7840d0c136?a=2909452&v=1.234.0&to=Jg1bREUOClsARUpTBhE9RkRWExJSARgWXAwS&rst=4382&ck=0&s=0f0f3d37ce821e13&ref=https://dribbble.com/get-started&af=err,xhr,stn,ins&qt=3&ap=498&be=1733&fe=2624&dc=528&perf=%7B%22timing%22:%7B%22of%22:1687356515381,%22n%22:0,%22u%22:1750,%22r%22:2,%22ue%22:1750,%22re%22:1048,%22f%22:1048,%22dn%22:1048,%22dne%22:1048,%22c%22:1048,%22s%22:1048,%22ce%22:1048,%22rq%22:1052,%22rp%22:1733,%22rpe%22:1739,%22di%22:2252,%22ds%22:2252,%22de%22:2261,%22dc%22:4352,%22l%22:4353,%22le%22:4357%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&fp=2056&fcp=2056")
                    .headers(headers_14)
      case 15 =>
        http("request_15")
                    .post(uri1 + "/g/collect?v=2&tid=G-EV4S8HEMZG&gtm=45je36e2&_p=191242176&cid=72302696.1687356076&ul=en-gb&sr=1512x982&uaa=arm&uab=64&uafvl=Not.A%252FBrand%3B8.0.0.0%7CChromium%3B114.0.5735.133%7CGoogle%2520Chrome%3B114.0.5735.133&uamb=0&uam=&uap=macOS&uapv=13.2.0&uaw=0&ngs=1&_s=1&sid=1687356076&sct=1&seg=1&dl=https%3A%2F%2Fdribbble.com%2Fget-started&dr=https%3A%2F%2Fdribbble.com%2Fsignup&dt=Dribbble%20-%20Discover%20the%20World%E2%80%99s%20Top%20Designers%20%26%20Creative%20Professionals&en=page_view")
                    .headers(headers_15)
    }
  }
}

