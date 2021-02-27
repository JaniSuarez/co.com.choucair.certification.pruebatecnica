package co.com.choucair.certification.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/pruebaTecnica.feature",
        tags="@stories",
        glue="co.com.choucair.certification.pruebatecnica.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
