package com.solvd.computerdatabase.load.simulation

import com.solvd.computerdatabase.load.BaseSimulation
import com.solvd.computerdatabase.load.scenario.{BrowseScenario, EditScenario, SearchScenario}

class TestSimulation extends BaseSimulation{

  setUp(
    SearchScenario().populationBuilder,
    BrowseScenario().populationBuilder,
    EditScenario().populationBuilder
  )

}
