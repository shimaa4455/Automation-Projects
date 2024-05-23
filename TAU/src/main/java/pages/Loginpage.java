package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class Loginpage {
    private WebDriver driver;
    private By usernamefield=By.id("username");
    private By passwordfield =By.id("password");
    private By loginbutton=By.cssSelector("#login button");
    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setuseername(String username)
    {
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void setpassword(String password)
    {
        driver.findElement(passwordfield).sendKeys(password);
    }
    public securepage clickloginbutton()
    {
        driver.findElement(loginbutton).click();
        return new securepage(driver);
    }
}
