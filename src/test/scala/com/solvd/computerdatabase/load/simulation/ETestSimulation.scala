package com.solvd.computerdatabase.load.simulation

import com.solvd.computerdatabase.load.BaseSimulation
import com.solvd.computerdatabase.load.scenario.eCommerce.{CategoryScenario,PagesScenario}

class ETestSimulation extends BaseSimulation{


  setUp(
    PagesScenario().populationBuilder,
    CategoryScenario().populationBuilder
  )

}
