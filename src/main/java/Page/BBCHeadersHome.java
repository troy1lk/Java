package Page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;


public class BBCHeadersHome
{
    public WebDriver driver;
    public BBCHeadersHome(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//Element
    @FindBy(how = How.CSS,using = ".ssrcss-1ssvzom-NavigationLink") WebElement Homelink;
    @FindBy(how = How.CSS,using = ".ssrcss-1j2epfn-NavigationLink") WebElement Newslink;
    @FindBy(how = How.CSS,using = ".ssrcss-w14lwg-NavigationLink") WebElement Sportlink;
    @FindBy(how = How.CSS,using = ".ssrcss-zq9bvs-NavigationLink") WebElement Weatherlink;
    @FindBy(how = How.XPATH,using = "//*[contains(@class, 'ssrcss-5uvoza-NavigationLink')]") WebElement Iplayerlink;
    @FindBy(how = How.XPATH,using = "//*[contains(@class, 'ssrcss-zi89s5-NavigationLink')]") WebElement Soundslink;
    @FindBy(how = How.CSS,using = ".ssrcss-1w02lvb-NavigationLink") WebElement CBBClink;


//Element verification
    @FindBy(how = How.CSS,using = ".ssrcss-cl4b5i-MastheadText") WebElement HomelinkVerify;
    @FindBy(how = How.CSS,using = ".nw-c-nav__secondary-sections > li:nth-of-type(8) > a > span") WebElement NewslinkVerify;
    @FindBy(how = How.CSS,using = ".sp-c-global-header__logo") WebElement SportlinkVerify;
    @FindBy(how = How.CSS,using = ".wr-c-uk-warnings__weather .wr-c-uk-warnings__title") WebElement WeatherlinkVerify;
    @FindBy(how = How.CSS,using = ".navigation__logo__svg > path") WebElement IplayerlinkVerify;
    @FindBy(how = How.CSS,using = ".sc-c-sounds-nav__brand-svg > path") WebElement SoundslinkVerify;
    @FindBy(how = How.CSS,using = "#large-menu-logo .logo__part--raspberry") WebElement CBBClinkVerify;



    public void navigate()throws InterruptedException, IOException
    {
        driver.get("https://bbc.co.uk");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/Screenshots/Google.jpg"));
        Thread.sleep(3000);
    }

    public void BBCLINKS(String link)
    {
        switch (link)
        {
            case "Home" :
            Homelink.click();
            break;

            case "News" :
                Newslink.click();
                break;

            case "Sport" :
                Sportlink.click();
                break;

            case "Weather" :
                Weatherlink.click();
                break;
            case "Iplayer" :
                Iplayerlink.click();
                break;
            case "Sounds" :
                Soundslink.click();
                break;
            case "CBBC" :
                CBBClink.click();
                break;

            default: System.out.println("NO SUCH LINK");
        }

    }
    public void BBCLinksVerify(String link)
    {
        switch (link)
        {
            case "Home" :
                HomelinkVerify.isDisplayed();
                break;

            case "News" :
                NewslinkVerify.isDisplayed();
                break;

            case "Sport" :
                SportlinkVerify.isDisplayed();
                break;

            case "Weather" :
                WeatherlinkVerify.isDisplayed();
                break;

            case "Iplayer" :
                IplayerlinkVerify.isDisplayed();
                break;

            case "Sounds" :
                SoundslinkVerify.isDisplayed();
                break;

            case "CBBC" :
                CBBClinkVerify.isDisplayed();
                break;

            default: System.out.println("NO SUCH LINK");
        }

    }



}
