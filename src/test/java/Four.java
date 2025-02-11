import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Four extends BaseClass {
    public WebDriver driver;
    @Test
    public void testFour(){
        driver.get(url);
        System.out.println(driver.getTitle() + "from IE");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = setUpBrowser("opera");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
