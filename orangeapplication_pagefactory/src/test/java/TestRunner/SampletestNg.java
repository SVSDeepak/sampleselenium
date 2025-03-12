package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\sample1.feature",
glue= {"StepDefinition","Hooks"}, 
plugin= {"pretty","html:target/cucumberreport/report.html"},
//tags= ("@sanity"),
monochrome=true)
public class SampletestNg extends AbstractTestNGCucumberTests{
	

}
