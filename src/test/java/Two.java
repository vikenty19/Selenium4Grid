import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Two extends BaseClass {
    public WebDriver driver;
    @Test
    public void testTwo(){
        driver.get(url);
        System.out.println(driver.getTitle() + "from Firefox");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = setUpBrowser("Firefox");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
