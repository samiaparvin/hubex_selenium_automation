package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;
//import org.junit.Test;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPageTest {
	
	
	WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void login_test_valid_info() throws InterruptedException
    {
        
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        String nextpageUrl = driver.getCurrentUrl();
        assertEquals(nextpageUrl, "http://stage.hubex.tech/dashboard/d3fc1a2b-d37c-4178-adef-266848895a3f/project");
        TimeUnit.SECONDS.sleep(2);
    }
    
    @Test
    public void login_test_Invalid_info() throws InterruptedException
    {
        
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_Invalid_info();
        String nextpageUrl = driver.getCurrentUrl();
        assertNotEquals(nextpageUrl, "http://stage.hubex.tech/dashboard/d3fc1a2b-d37c-4178-adef-266848895a3f/project");
        assertEquals(Lp.getError_Mssg().isDisplayed(), true);
        TimeUnit.SECONDS.sleep(2);
    }
 
    @Test
    public void check_elements_visibility()
    {
            
            LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
            assertEquals(Lp.passwordTxtbox_visibility_check(), true);
            assertEquals(Lp.emailTxtbox_visibility_check(), true);
            assertEquals(Lp.btnLogin_visibility_check(), true);
            assertEquals(Lp.forgot_pass_visibility_check(), true);
            assertEquals(Lp.logo_visibility_check(), true);
        
    }
    
    @Test
    public void Check_Maxlength_for_Txtboxes()
    {
        
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.maxLength_for_emailTxtbox();
        Lp.maxLength_for_passTxtbox();
    }
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }

}
