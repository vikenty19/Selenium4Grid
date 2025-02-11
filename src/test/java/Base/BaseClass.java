package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    protected String url ="https://the-internet.herokuapp.com/";
    public WebDriver setUpBrowser(String browserName) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities dc = new DesiredCapabilities();
        if (browserName.equalsIgnoreCase("chrome")){
            dc.setBrowserName("chrome");
        } else if (browserName.equalsIgnoreCase("firefox")) {
            dc.setBrowserName("firefox");
        } else if (browserName.equalsIgnoreCase("edge")) {
            dc.setBrowserName("MicrosoftEdge");
        } else if (browserName.equalsIgnoreCase("opera")) {
            dc.setBrowserName("opera");
        } else if (browserName.equalsIgnoreCase("ie")) {
            dc.setBrowserName("internet explorer");

        }
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
        return driver;
    }
}
