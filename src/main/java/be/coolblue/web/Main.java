package be.coolblue.web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // driver setup
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.coolblue.be/nl";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        // selectors
        WebElement cookieBtn = driver.findElement(By.name("accept_cookie"));
        cookieBtn.isDisplayed();
        cookieBtn.click();

        // close browser
        driver.close();
    }
}