 package Stepdef1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		monochrome=true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/Feature1",
		glue= "Stepdef1",
        tags= {"@Login or @AddToCart"}

		
		
		)
public class Runnerclass1 {

}