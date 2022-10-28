package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features",glue= {"com.stepDefination"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports", "json:Reports\\JSONReports\\Cucumber.json",
		"junit:Reports\\JUNITReports\\Cucumber.xml"},

dryRun=false,  // mapping betweeen feature file and step file
strict=true,  //it will if any step is not defined in step define file
tags= {"@FunctionalTest and @SmokeTest"}
		)

public class Runner {

}
