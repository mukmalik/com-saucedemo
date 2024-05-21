package project4comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComSaucedemo {

    public static void main(String[] args) {

        String url = "https://www.saucedemo.com/";

        // 1. Setup Chrome browser
        WebDriver drive = new ChromeDriver();

        // 2. Open url
        drive.get(url);

        // 3. print the title of the page
        System.out.println("Page title :\t"+drive.getTitle());

        // 4. print current url
        System.out.println("current url :\t"+drive.getCurrentUrl());

        // 5. print the page source
        System.out.println("page source :\t"+drive.getPageSource());

        // 6. enter email to email field
        WebElement emailEl = drive.findElement(By.id("user-name"));
        emailEl.sendKeys("visual_user");

        // 7. enter the password to password field
        WebElement pass = drive.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");

        // 8. click on login button
        WebElement click = drive.findElement(By.id("login-button"));
        click.click();

        // 9. print current url
        System.out.println("Print current url :\t"+drive.getCurrentUrl());

        // 10. navigate to base url
        drive.navigate().to(url);

        // 11. Refresh the page
        drive.navigate().refresh();

        // 12. close the browser
        drive.close();


    }

}
