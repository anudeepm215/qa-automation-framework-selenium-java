package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("loginBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName, String passWord) {
        driver.findElement(username).sendKeys(userName);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(loginBtn).click();
    }
}
