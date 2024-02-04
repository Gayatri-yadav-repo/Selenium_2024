package TestCases;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginPage extends BaseClass {
   @Test
    public void  loginTest()

    {

driver.get(baseurl);
        LoginPage lp = new LoginPage(driver);

    lp.setUsername(username);
    lp.setPassword(password);
    lp.clicksubmit();
    }
}