package tests;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPageAdan;
import utilities.BrowserUtil;
import utilities.ConfigReader;
import utilities.TestBase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VyTrackTests extends TestBase {

    @Test
    public void testDriverLoginPage(){

        LoginPageAdan loginObj=new LoginPageAdan();

        loginObj.goTo();

        loginObj.login(ConfigReader.read("tduser1"),ConfigReader.read("password"));
        BrowserUtil.waitFor(2);



    }

    @Test
    public void testStoreManagerLoginPage(){

        LoginPageAdan loginObj=new LoginPageAdan();

        loginObj.goTo();
        loginObj.login(ConfigReader.read("storemanuser1"),ConfigReader.read("password"));



    }

    @Test
    public void testSalesManagerLoginPage(){

        LoginPageAdan loginObj=new LoginPageAdan();

        loginObj.goTo();
        loginObj.login(ConfigReader.read("salesmanuser1"),ConfigReader.read("password"));



    }
    @Test
    public void US1_ManagerAllModules(){
        LoginPageAdan loginObj=new LoginPageAdan();
        loginObj.goTo();
        loginObj.login(ConfigReader.read("storemanuser2"),ConfigReader.read("password"));
        BrowserUtil.waitFor(2);
        List<WebElement> allModules = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li"));
        assertEquals(allModules.size(), 8);
        WebElement a;
        for(int i=0; i<allModules.size(); i++){
            a=allModules.get(i);
            System.out.println(a.getText());
        }
    }
    @Test
    public void US1_DriverAllModules() {
        LoginPageAdan loginObj = new LoginPageAdan();
        loginObj.goTo();
        loginObj.login(ConfigReader.read("tduser2"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);
        List<WebElement> allModules = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li"));
        assertEquals(allModules.size(), 4);
        WebElement a;
        for (int i = 0; i < allModules.size(); i++) {
            a = allModules.get(i);
            System.out.println(a.getText());

        }
    }
}