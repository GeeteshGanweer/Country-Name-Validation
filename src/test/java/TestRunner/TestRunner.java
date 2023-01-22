package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "AllFeature/task.feature" },
glue = { "StepDefination" },
dryRun = true
)

public class TestRunner {

}
