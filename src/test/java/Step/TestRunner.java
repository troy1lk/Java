package Step;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions
        (features = ".",
       // "C:\\Users\\44753\\IdeaProjects\\MyTestFramework\\src\\test\\resources\\Feature", glue={"Step"},
//                tags = {"@sanity","@smoke","@ATT"},
                //tags = "@sanity",
                //tags = "@smoke",
                tags =   "@ATT",

                // dryRun = true,
        monochrome = true,
plugin = {
        "pretty",
        "html:test-out",
        "json:json-output/cucumber.json",
        "junit:junit_xml/cucumber.xml"
        }
        )

public class TestRunner
{
}
