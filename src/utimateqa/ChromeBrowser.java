package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseurl);
        //maximize the browser
        driver.manage().window().maximize();
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
