package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class securepage {
    private WebDriver driver;
    private By alerttext=By.id("flash");
    public securepage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String setalerttext()
    {
       return driver.findElement(alerttext).getText();
    }

}
