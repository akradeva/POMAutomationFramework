package pomscripts;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkilloBaseTests extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/posts/all");
        loginPage.clickLoginButton();
        loginModal.enterUsername("Mickey13");
        loginModal.enterPassword("Pass123!");
        loginModal.clickSignInButton();
        Assert.assertTrue(homePage.isSingOutBtnDisplayed());
        Assert.assertTrue(homePage.isNewPostBtnDisplayed());
        Thread.sleep(1500);
    }

    @Test
    public void commentPost() {
        driver.get("http://training.skillo-bg.com/posts/all");
        loginPage.clickLoginButton();
        loginModal.login();
        homePage.commentPost();
    }

    @Test
    public void logout() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/posts/all");
        loginPage.clickLoginButton();
        loginModal.login();
        Thread.sleep(5000);
        homePage.clickSignOutButton();
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
    }

}
