import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Three extends BaseClass {
    public WebDriver driver;
    @Test
    public void testThree(){
        driver.get(url);
        System.out.println(driver.getTitle() + "from Edge");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = setUpBrowser("edge");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
