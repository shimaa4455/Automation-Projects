package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MulitpleWindwosPage {
    private WebDriver driver;
    private By clickherebutton = By.linkText("Click Here");

    public MulitpleWindwosPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickhere()
    {
        driver.findElement(clickherebutton).click();
    }
}
