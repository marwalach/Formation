package Run;
//pour générer un rapport

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// kan ma nekhtarouch tag raw bech yrani les features lkol
@RunWith(Cucumber.class)
@CucumberOptions(tags="@Connection"
		,features = "src/test/features/AutomationExcercice/CreationCompte.feature"
		,glue={"stepdefinition", "hooks"}
        ,publish= true
        ,plugin= {"pretty"
		,"html:target/cucumber-Reports.html"
		,"json:target/cucumber-Reports"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
}
        ,snippets= io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
        ,monochrome=true
)
public class Runner {

}
