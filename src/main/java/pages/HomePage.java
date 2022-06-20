package pages;

import common.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page is displayed after the user is logged in
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#nav-link-new-post")
    WebElement newPostButton;

    @FindBy(css="i[class*= \"sign-out\"]")
    WebElement signOutButton;

    @FindBy(xpath = "//div[@class=\"post-feed-img\"][1]")
    WebElement postImage;

    @FindBy(xpath = "//div/input[@placeholder='Comment here']")
    WebElement commentInputField;

    public void clickNewPostButton() {
        newPostButton.click();
    }

    public boolean isNewPostBtnDisplayed() {
        return newPostButton.isDisplayed();
    }

    public boolean isSingOutBtnDisplayed() {
        return signOutButton.isDisplayed();
    }

    public void clickSignOutButton() {
        signOutButton.click();
    }

    public void clickAnyPost() {
        postImage.click();
    }

    public void commentPost() {
        clickAnyPost();
        commentInputField.clear();
        commentInputField.sendKeys("Test comment");
        commentInputField.sendKeys(Keys.ENTER);
    }

}

