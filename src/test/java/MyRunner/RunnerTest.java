package MyRunner;

//Changes in workspaceA
//Changes in workSpaceA branch
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Ramesh_1\\src\\Pracitce\\src\\main\\java\\Feature\\login.feature", 
		glue = {"stepDefinitions"},
		plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		//plugin= {"pretty"},
		monochrome = true,
        dryRun = false
		)
public class RunnerTest {

}
