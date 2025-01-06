package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
    public void setUpBrowser(String browserName){
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
        }

    }
}
