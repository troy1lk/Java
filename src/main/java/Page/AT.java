package Page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AT
{
    public WebDriver driver;
    public AT(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigate()throws InterruptedException, IOException
    {
        driver.get("https://www.autotrader.co.uk/");
        Thread.sleep(3000);
    }
    @FindBy(how = How.ID,using = "postcode") WebElement PC;
    @FindBy(how = How.ID,using = "distance\"") WebElement miles;

    public void SelectPostcode() throws InterruptedException {
        PC.sendKeys("rm8 1ae");
        Thread.sleep(3000);
    }
    public void MinOptions() throws InterruptedException {

        //IWebElement miles = Driver.FindElement(By.Id("distance"));
        WebElement miles = driver.findElement(By.id("distance"));
        Select selectMiles = new Select (miles);
        selectMiles.selectByVisibleText("Within 5 miles");
        Thread.sleep(4000);


        //Count and print number of items in the lists
        WebElement elementCounts = driver.findElement(By.id("distance"));
        Select Distance = new Select(elementCounts);
        int x = Distance.getOptions().size();
        System.out.println("Count : " + x);
        Thread.sleep(4000);

        //another way
        Select dropDown = new Select(driver.findElement(By.id("distance")));
        List<WebElement> elementCount = dropDown.getOptions();
        System.out.println("Number of items: " + elementCount.size());
        Thread.sleep(4000);


        //Print all the items in the lists
        Select dropDownnew = new Select(driver.findElement(By.id("distance")));
        List <WebElement> elementCountnew = dropDownnew.getOptions();
        int itemSize = elementCountnew.size();
        for(int i = 0; i < itemSize ; i++)
        {
            String optionsValue = elementCount.get(i).getText();
            System.out.println(optionsValue);
        }

        WebElement make = driver.findElement(By.id("make"));
        Select selectMake = new Select(make);
        selectMake.selectByValue("AUDI");
        Thread.sleep(4000);

        WebElement model = driver.findElement(By.id("model"));
        Select selectModel = new Select(model);
        selectModel.selectByIndex(1);
        Thread.sleep(4000);

        WebElement minimumprice = driver.findElement(By.id("minPrice"));
        Select selectMinPrice = new Select(minimumprice);
        selectMinPrice.selectByIndex(1);
        Thread.sleep(4000);

        WebElement maximumprice = driver.findElement(By.id("maxPrice"));
        Select selectMaxPrice = new Select(maximumprice);
        selectMaxPrice.selectByIndex(1);
        Thread.sleep(4000);


        WebElement miless = driver.findElement(By.id("distance"));
        miless.isDisplayed();

//        String url = driver.getCurrentUrl(aaa);
//
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));


    }
}
