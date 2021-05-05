package Step;

import Page.AT;
import Page.DriverManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

//this is a test message 123

public class ATSteps extends DriverManager
{
    WebDriver driver = DriverManager.getDriver();
    AT B  = new AT(driver);

    @Given("^I navigate to AutoTrader$")
    public void iNavigateToAutoTrader() throws IOException, InterruptedException {
        B.navigate();
    }

    @And("^I enter postcode$")
    public void iEnterPostcode() throws InterruptedException {
        B.SelectPostcode();
    }

    @And("^I select the dropdown options min$")
    public void iSelectTheDropdownOptionsMin() throws InterruptedException {
        B.MinOptions();
    }



    @When("^I select search min$")
    public void iSelectSearchMin()
    {
    }

    @Then("^I see the results min$")
    public void iSeeTheResultsMin()
    {
    }

    @And("^I select the dropdown options max$")
    public void iSelectTheDropdownOptionsMax()
    {
    }

    @When("^I select search max$")
    public void iSelectSearchMax()
    {
    }

    @Then("^I see the results max$")
    public void iSeeTheResultsMax()
    {
    }
}
