package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModal extends LoginPage {

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#defaultLoginFormUsername")
    WebElement usernameField;
    @FindBy(css = "#defaultLoginFormPassword")
    WebElement passwordField;
    @FindBy(css = "#sign-in-button")
    WebElement signInButton;

    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void login() {
        enterUsername("Mickey13");
        enterPassword("Pass123!");
        clickSignInButton();
    }
}
