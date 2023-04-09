package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://courses.ultimateqa.com/users/sign_in";
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseurl);
        //print the title of the page
        System.out.println("Page Title : " + driver.getTitle());
        //print Current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");
        //enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("prime123");
        //close the browser
        //driver.close();
    }
}
