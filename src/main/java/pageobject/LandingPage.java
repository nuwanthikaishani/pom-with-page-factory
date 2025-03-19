package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    //constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //WebElement userEmail = driver.findElement(By.id("userEmail"));
    //page Factory
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement loginButton;

    public void loginApplicatio(String email,String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        loginButton.click();
    }

}
