package Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ComponentsPage;
import Pages.CreateComponentPage;
import Pages.DashboardPage;
import Pages.LoginPage;

public class CreateComponentPageTest {
	
WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        DashboardPage Dp = PageFactory.initElements(driver, DashboardPage.class);
        Dp.getComponentes().click();
        ComponentsPage CP = PageFactory.initElements(driver, ComponentsPage.class);
        CP.crearComponentes_click();
        
    }
    
    @Test
    public void check_CrearComponentePage() throws InterruptedException
    {
    	CreateComponentPage CCP = PageFactory.initElements(driver, CreateComponentPage.class);
    	assertEquals(CCP.EditarComponente_visibility(), true);
    	assertEquals(CCP.CrearComponente_visibility(), true);
    	assertEquals(CCP.lbl_name_visibility(), true);
    	assertEquals(CCP.lbl_deacription_visibility(), true);
    	assertEquals(CCP.lbl_organization_visibility(), true);

    	assertEquals(CCP.Edit_name(), "text");
    	assertEquals(CCP.Edit_description(), "text");
    
    }
    
    @Test
    public void Creating_components_check() throws InterruptedException {
    	
    	CreateComponentPage CCP = PageFactory.initElements(driver, CreateComponentPage.class);
    	CCP.textboxex_fill();
    	CCP.select_organization();
    	CCP.submitBtn_click();
    	TimeUnit.SECONDS.sleep(3);
    	
    	String getURL = driver.getCurrentUrl();
    	assertEquals(getURL, "http://stage.hubex.tech/dashboard/components");
    	driver.navigate().back();
	}
    
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }

}
