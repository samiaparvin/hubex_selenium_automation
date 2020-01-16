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
import Pages.UsersPage;

public class UsersPageTest {

WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        DashboardPage Dp = PageFactory.initElements(driver, DashboardPage.class);
        Dp.NavigationBar_elements_visibility_check();
        TimeUnit.SECONDS.sleep(1);
        Dp.getUsers().click();
        
    }
    
    @Test
    public void Page_Elements_Visibility_Check() {
		// TODO Auto-generated method stub
    	UsersPage Up = PageFactory.initElements(driver, UsersPage.class);
    	assertEquals(Up.Header1_visibility(), true);
    	assertEquals(Up.Header2_visibility(), true);
    	assertEquals(Up.TH_Nombre_visibility(), true);
    	assertEquals(Up.TH_Apellido_visibility(), true);
    	assertEquals(Up.TH_SegundoApellido_visibility(), true);
    	assertEquals(Up.TH_Email_visibility(), true);
    	assertEquals(Up.TH_Tipo_visibility(), true);
    	assertEquals(Up.TH_CreadoPor_visibility(), true);
    	assertEquals(Up.TH_creadoEl_visibility(), true);
	}
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }
    
}
