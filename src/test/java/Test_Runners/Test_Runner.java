package Test_Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/Features",
		glue="Step_definations", tags="@GreencartTesting1",strict=true,monochrome=true,
		plugin={"pretty","json:/CucuJ.json"}
		
)
public class Test_Runner {

}
