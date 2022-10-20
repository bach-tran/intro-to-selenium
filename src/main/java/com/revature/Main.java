package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // I put chromedriver.exe into my D:/ drive
        // path to the executable: D:\chromedriver.exe

        /*
            OLD WAY
         */
//        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        /*
            NEW WAY
         */
        WebDriverManager.chromedriver().setup(); // it will automatically download and configure
        // the chromedriver.exe at runtime

        WebDriver driver = new ChromeDriver(); // Opens the web browser controlled by the
        // webdriver

        driver.get("http://127.0.0.1:5500/login.html"); // Go to a particular webpage

        WebElement usernameInputElement = driver.findElement(By.cssSelector("#username"));
        WebElement passwordInputElement = driver.findElement(By.id("password"));
        WebElement submitButtonElement = driver.findElement(By.tagName("button"));

        Thread.sleep(10000); // pause for 10 seconds

        driver.quit(); // This quits the webdriver process running the computer + the web browser
        // controlled by the webdriver
    }

}
