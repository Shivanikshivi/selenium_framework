package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.Demoblazepage;
import selenium.Login;
import selenium.Signup;
import utils.WebDriverFactory;

public class SignupLogin {
    WebDriver driver;
    Demoblazepage homePage;
    Signup signupPage;
    Login loginPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(); 
        driver.get("https://www.demoblaze.com/");
        homePage = new Demoblazepage(driver);
        signupPage = new Signup(driver);
        loginPage = new Login(driver);
    }

    @Test
    public void testSignup() {
        homePage.clickSignupButton();
        signupPage.enterUsername("example_user");
        signupPage.enterPassword("example_password");
        signupPage.clickSignupSubmitButton();
        
    }

    @Test
    public void testLogin() {
        homePage.clickLoginButton();
        loginPage.enterUsername("example_user");
        loginPage.enterPassword("example_password");
        loginPage.clickLoginSubmitButton();
        
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



