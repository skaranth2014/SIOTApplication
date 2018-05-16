package SIOT.Samsung.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format = { "pretty", "json:target/json/output.json",
"html:target/html/" }, features = "C:\\Users\\ravindra.parauha\\workspace\\SampleDemo\\Samsung\\src\\test")


public class  RunnerTest extends AbstractTestNGCucumberTests {

}
