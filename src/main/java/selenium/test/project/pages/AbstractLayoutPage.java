package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractLayoutPage extends AbstractPage {

    @FindBy(xpath = "//html/body/header/div[2]/div[2]/a/span")
    public WebElement logoutButton;

    public AbstractLayoutPage(WebDriver driver){
        super(driver);
    }

    public boolean isLogoutButtonDisplayed(){
        return isElementDisplayed(logoutButton);
    }
}