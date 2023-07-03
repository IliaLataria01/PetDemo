package com.solvd.computerdatabase.load.util

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.StrictLogging

trait ConfigUtil extends StrictLogging{
  val conf = ConfigFactory.load("performance");
  val codebase = sys.props.getOrElse("codebase", conf.getString("sf.codebase"))
  val locale = sys.props.getOrElse("locale", conf.getString("sf.locale"))
  val env = conf.getString("sf.env.".concat(codebase).concat(".").concat(locale))
  val baseUrl = getBaseUrl(env)

  val simulationMode = sys.props.getOrElse("simulationMode", conf.getString("sf.simulationMode"))
  val durationMeasurements = sys.props.getOrElse("durationMeasurements", conf.getString("sf.durationMeasurements"))
  val simulationDuration = sys.props.getOrElse("simulationDuration", conf.getString("sf.duration"))

  val searchQueries = conf.getString("sf.searchQueriesFile")

  val loginQueries = conf.getString("sf.loginQueries")

  val productQueries = conf.getString("sf.productQueries")

  def getIntValueFromConfig(path: String) = conf.getInt(path)

  def getBaseUrl(url: String): String = {
    url.split("(?=/s/PND-ES)|(?=/en/)|(?=/es/)|(?=/on/demandware.store)|(?=/s/refapp-global)")(0)
  }

}
