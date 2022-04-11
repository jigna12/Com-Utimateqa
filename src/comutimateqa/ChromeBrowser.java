package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);//Launch the URL
        driver.manage().window().maximize();//Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//we give implicit time to driver

        String title = driver.getTitle();//Get the title of the page
        System.out.println("Page title:" +title);
        System.out.println("Current URL = "+driver.getCurrentUrl());//Get current URL

        String p = driver.getPageSource();//Get the page-source
        System.out.println("Page-Source ="+p);

        WebElement emailField = driver.findElement(By.id("user[email]"));//Find the email field element
        emailField.sendKeys("java123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("user[password]"));//Find the password field element
        passwordField.sendKeys("123java");

        driver.close();//Close the browser
    }
}
