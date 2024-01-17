package web.runners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import web.stepdef.BaseClass;

@CucumberOptions(
        tags = "",
        features = "src/test/resources/Functional/Restrictedlogin.feature",
        glue = "web/stepdef",
        plugin = {}
)

public class Restrictedlogin extends AbstractTestNGCucumberTests {
BaseClass baseClassObj = new BaseClass();

	@BeforeSuite
	public void init() {
		baseClassObj.initiateBrowser();
		baseClassObj.setPageObjects();
	}

	@AfterSuite
	public void tearDown() {
		baseClassObj.tearDown();
	}
}