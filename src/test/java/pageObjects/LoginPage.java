package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        driver=driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy (name="user-name")
    WebElement txtusername;
    @FindBy (name="password")
    WebElement txtpassword;
    @FindBy (id="login-button")
    WebElement btn;

    //encapsulation
    public void setUsername(String uname)
    {
        txtusername.sendKeys(uname);

    }
    public void setPassword(String upassword)
    {
        txtpassword.sendKeys(upassword);

    }
public void clicksubmit(){
        btn.click();
}

}
