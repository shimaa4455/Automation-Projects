package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    private WebDriver driver;
    private By hotspot = By.id("hot-spot");

    public ContextMenu(WebDriver driver) {
        this.driver = driver;
    }
    public void righetclick()
    {
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(hotspot)).perform();
    }
    public String getthetext()
    {
        return driver.switchTo().alert().getText();
    }
}




