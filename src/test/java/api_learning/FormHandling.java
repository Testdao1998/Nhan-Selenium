package api_learning;

import driver.DriverFactory;
import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormHandling {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        // Open target page https://the-internet.herokuapp.com/login
        driver.get("https://the-internet.herokuapp.com/login");
        // Find Username/Password Element by using username selector
        WebElement usernameElem = driver.findElement(By.id("username"));
        // Input username and password

        // Quit driver session

    }
    }
