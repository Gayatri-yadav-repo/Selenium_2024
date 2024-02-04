package TestCases;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginPage extends BaseClass {
   @Test
    public void  loginPage()

    {

        driver.get(baseurl);
        log.info("url open");

        LoginPage loginpage = new LoginPage(driver);

        loginpage.setUsername(username);
        log.info("enter username");

        loginpage.setPassword(password);
        log.info("enter password");
        loginpage.clicksubmit();

        if(driver.getTitle().equals("Swag Labs"))
        {
            Assert.assertTrue(true);
            log.info("login test pass");
        }else
        {
            Assert.assertTrue(false);
            log.info("login page failed");
        }
    }
}