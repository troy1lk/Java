package Page;

import cucumber.runtime.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import org.openqa.selenium.By;

public class BBCHome
{
    public WebDriver driver;
    public BBCHome(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.CSS,using = ".ssrcss-u3tmht-ConsentBanner") WebElement signin;

    @FindBy(how = How.LINK_TEXT, using = "BBC Account") private WebElement BBCAccount;
    String Expected = "BBC Account";

    public void navigateFunction()throws InterruptedException, IOException
    {
        driver.get("https://bbc.co.uk");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/Screenshots/Google.jpg"));
        Thread.sleep(3000);

    }

    public void SignInLocater()
    {
        signin.isDisplayed();
        assert BBCAccount.getText().equals(Expected);
    }
}
