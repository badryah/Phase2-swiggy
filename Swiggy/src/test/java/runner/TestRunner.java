package runner;

import tests.TestBase;


import cucumber.api.CucumberOptions;


@CucumberOptions(features="src/test/java/features",
glue= {"steps"}
, plugin= {"pretty", "html:target/cucumber-html-report"})
public class TestRunner extends TestBase {
	
	

}
