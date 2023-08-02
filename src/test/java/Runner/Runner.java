package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Feat/Feat.feature"},glue= {"Stepdef"},tags= "@valid",dryRun=false)


public class Runner extends AbstractTestNGCucumberTests {
	
	
	

}