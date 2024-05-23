package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYG {
    private WebDriver driver;
    private By frameid = By.id("mce_0_ifr");
    private By textarea = By.xpath("//p");
    private By decreasebuttton = By.xpath(" //button[@title=\"Increase indent\"]");

    public WYSIWYG(WebDriver driver) {
        this.driver = driver;
    }
    private void switchtoeditarea()
    {
        driver.switchTo().frame(driver.findElement(frameid));
    }
    private void switchtomainarea()
    {
        driver.switchTo().parentFrame();
    }
    public void cleartext()
    {

        switchtoeditarea();
        WebElement area =driver.findElement(textarea);
        area.sendKeys(Keys.CONTROL + "a");
        area.sendKeys(Keys.DELETE);
        switchtomainarea();
    }
    public void settext(String text)
    {
        switchtoeditarea();
        driver.findElement(textarea).sendKeys(text);
        switchtomainarea();
    }
    public void decreaseindention()
    {
        driver.findElement(decreasebuttton).click();
    }
    public String gettextfromeditor()
    {
        switchtoeditarea();
       String text= driver.findElement(textarea).getText();
       switchtomainarea();
       return text;
    }
}
