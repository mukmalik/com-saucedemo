package project4comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    static String browser = "Chrome";
    static String url = "https://www.saucedemo.com/";
    static WebDriver drive;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            drive = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            drive = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            drive = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        // 2. Open url
        drive.get(url);

        // 3. print the title of the page
        System.out.println("Page title :\t" + drive.getTitle());

        // 4. print current url
        System.out.println("current url :\t" + drive.getCurrentUrl());

        // 5. print the page source
        System.out.println("page source :\t" + drive.getPageSource());

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
        System.out.println("Print current url :\t" + drive.getCurrentUrl());

        // 10. navigate to base url
        drive.navigate().to(url);

        // 11. Refresh the page
        drive.navigate().refresh();

        // 12. close the browser
        drive.close();


    }
}
