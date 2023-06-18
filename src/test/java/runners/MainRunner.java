package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
		tags="@ColorsFeature",
		monochrome = true, 
		dryRun = false,
		strict= true
		)

public class MainRunner {

}
