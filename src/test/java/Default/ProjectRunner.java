package Default;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue= {"stepsDefinitions"},
		tags= {"@login,@register"},
				
		plugin = {"pretty","html:target/report-html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		strict = true
)


public class ProjectRunner {

}
