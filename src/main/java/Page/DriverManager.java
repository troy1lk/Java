package Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager
{
    public static WebDriver driver;
    public static void OpenBrowser(String browser) throws Exception {
//        if (browser.equalsIgnoreCase("edge"))
//        {
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        }
//        else if (browser.equalsIgnoreCase("chrome"))
//        {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        else{
//            throw new Exception("Browser not correct");
//        }
        {
            switch (browser)
            {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                      driver = new ChromeDriver();;
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                      driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("Browser not correct");
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    public void CloseBrowser()
    {
        driver.close();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
