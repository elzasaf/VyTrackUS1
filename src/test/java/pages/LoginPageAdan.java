package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPageAdan {
    //Fields
  @FindBy(id = "prependedInput")
  public WebElement userNameBox;

  @FindBy(id = "prependedInput2")
 public  WebElement passwprdBox;
  @FindBy(id = "_submit")
  public WebElement loginBox;

  public LoginPageAdan(){//constructor

      PageFactory.initElements(Driver.getDriver() , this );

  }
  //Actions/Methods

  public void goTo(){
      Driver.getDriver().navigate().to(ConfigReader.read("url"));
  }

public void login(String username,String password){
      userNameBox.sendKeys(username);
      passwprdBox.sendKeys(password);
      loginBox.click();


}











}
