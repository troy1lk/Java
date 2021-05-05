package Step;

import Page.BBCHeadersHome;
import Page.DriverManager;
import Page.BBCHome;
//import Page.TestDriverManager;
import Page.DriverManager;
import Page.BBCHome;
//import Page.TestDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class BBCHeader extends DriverManager
{
    WebDriver driver = DriverManager.getDriver();
    BBCHeadersHome V  = new BBCHeadersHome(driver);

    @Given("^I navigate to BBC$")
    public void iNavigateToBBC() throws IOException, InterruptedException {
        V.navigate();
    }

    @When("^I click on ([^\"]*)$")
    public void iClickOnHeaders(String links)
    {
        V.BBCLINKS(links);
    }

    @Then("^I see the ([^\"]*) page$")
    public void iSeeTheHeadersPage(String lINKS)
    {
        V.BBCLinksVerify(lINKS);
    }

}
