package ProgramDTS.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions{
        features = "src/test/java/ProgramDTS/cucumber/features",
        glue = "ProgramDTS.cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"}
        }
public class runkeranjang {
}
