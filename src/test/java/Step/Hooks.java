package Step;
import Page.DriverManager;
import Page.DriverManager;
//import Page.TestDriverManager;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.IOException;

public class Hooks
{
    @Before
    public void setUp() throws Exception
    {
        DriverManager.OpenBrowser("chrome");
       // DriverManager.OpenBrowser("edge");
    }

    @After
    public void tearDown()
    {
        new DriverManager().CloseBrowser();
    }
}
