package com.solvd.computerdatabase.load.models

import com.solvd.computerdatabase.load.util.ConfigUtil

import scala.concurrent.duration._

class AbstractPage extends ConfigUtil{
  val minThinkTime = 5.seconds
  val maxThinkTime = 7.seconds


}
