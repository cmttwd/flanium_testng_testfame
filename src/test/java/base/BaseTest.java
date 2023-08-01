package base;

import FlaNium.WinAPI.FlaNium;
import FlaNium.WinAPI.webdriver.FlaNiumDriver;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void before(){
        FlaNiumDriver driver = FlaNium.initDriver();
        WebDriverRunner.setWebDriver(driver);
    }


    @AfterClass
    public void after(){
        WebDriverRunner.closeWindow();
        WebDriverRunner.closeWebDriver();
    }


    public FlaNiumDriver getDriver(){
        return (FlaNiumDriver) WebDriverRunner.getWebDriver();
    }

}
