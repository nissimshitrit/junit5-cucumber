
package com.mytest.refund;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("com/mytest/refund")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.mytest.refund")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/mytest/refund",
        glue = "com.mytest.refund",
        plugin = {"pretty"}
)
public class CucumberTest {

}
