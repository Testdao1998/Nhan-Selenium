package driver;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public  static WebDriver getChromeDriver(){
        String chromeDriverLocation = null;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = OS.isFamilyMac()
                ? currentProjectLocation.concat("/Driver/chromedriver")
                : currentProjectLocation.concat("\\src\\test\\resources\\Driver\\chromedriver.exe");
// Chrome option
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        // Start browser session
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        // Open a webpage
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;

    }
}
