package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {

    public String baseurl= "https://www.saucedemo.com/v1/";
    public String username = "standard_user";
    public String password = "secret_sauce";
    public static Properties prop;
    public static  FileInputStream ip;

    public static WebDriver driver;


@BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayatri\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().pageLoadTimeout( Testutils.page_load_timeout, TimeUnit.SECONDS);
   //     driver.manage().timeouts().implicitlyWait(Testutils.implicit_wait,TimeUnit.SECONDS);
        //  driver.get(prop.getProperty("url"));
        String titlename =  driver.getTitle();
        System.out.println("titlename is "+titlename);
    }

 @AfterClass
 public void methodName() {

   }
       public void tearDown()
    {
        driver.quit();
    }

    public void readproperties(){
    try
    {
            prop = new Properties();
            ip = new FileInputStream("C:\\Users\\Gayatri\\IdeaProjects\\Selenium\\SeleniumQA\\src\\main\\java\\Config\\config.properties");

            prop.load(ip);
        }
     catch (Exception e) {
            e.printStackTrace();

        }
    }

}
