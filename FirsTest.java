package ua.smarttech;

import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class FirsTest {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.opera.driver", "/D:/MaxMak/operadriver_win32/operadriver_win32/operadriver.exe");
        OperaDriver driver = new OperaDriver();
        driver.get("https://smarttech.com.ua");
    }
}
