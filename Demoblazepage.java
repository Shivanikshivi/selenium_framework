package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demoblazepage extends Base {

    @FindBy(id = "signup")
    private WebElement signupButton;

    @FindBy(id = "login2")
    private WebElement loginButton;

    
    public Demoblazepage(WebDriver driver) {
        super(driver);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
