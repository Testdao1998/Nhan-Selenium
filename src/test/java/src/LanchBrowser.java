package src;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanchBrowser {
    public static WebDriver main(String[] args  ) throws InterruptedException{
        // Location of WebDriver
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
        return driver;


    }
}
