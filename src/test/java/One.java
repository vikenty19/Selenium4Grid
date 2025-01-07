import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class One extends BaseClass {
    public WebDriver driver;
    @Test
    public void testOne(){
        driver.get(url);
        System.out.println(driver.getTitle() + " from Chrome");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
       driver = setUpBrowser("chrome");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
