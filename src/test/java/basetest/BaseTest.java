package basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginModal;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public LoginModal loginModal;
    public HomePage homePage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginModal = new LoginModal(driver);
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
