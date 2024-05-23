package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.http.Message;

public class Forgetpassword {
    private WebDriver driver;
    private By emailfield = By.id("email");
    private By messege = By.tagName("h1");
    private By retrivepasswordbutton = By.id("form_submit");
    public Forgetpassword(WebDriver driver) {
        this.driver=driver;
    }
    public void enteremailinemailfield(String email)
    {
        driver.findElement(emailfield).sendKeys(email);
    }
    public Forgetpassword clickretrivepassword()
    {
        driver.findElement(retrivepasswordbutton).click();
        return new Forgetpassword(driver);
    }
    public String gettextmessege()
    {
       return driver.findElement(messege).getText();
    }

}
