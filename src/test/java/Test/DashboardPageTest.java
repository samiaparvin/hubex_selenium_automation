package Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest {

WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        
    }
    
    @Test
    public void NavigationBar_Elements_visibility_Check() {
		// TODO Auto-generated method stub
    	DashboardPage Dp = PageFactory.initElements(driver, DashboardPage.class);
    	
    	assertEquals(Dp.HubexLogo_visibility_check(), true);
    	assertEquals(Dp.lblDashboard_visibility_check(), true);
    	assertEquals(Dp.lblComponente_visibility_check(), true);
    	assertEquals(Dp.lblRoles_visibility_check(), true);
    	assertEquals(Dp.lblUsarios_visibility_check(), true);
    	assertEquals(Dp.drpdwnProcesos_visibility_check(), true);
    	assertEquals(Dp.lblReportes_visibility_check(), true);
    	assertEquals(Dp.drpdwnShirleySolis_visibility_check(), true);
    	
	}
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }
    
}
