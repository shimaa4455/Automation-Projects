package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keypresses {
   private WebDriver driver;
   private By target= By.id("target");
    private By result= By.id("result");



    public Keypresses(WebDriver driver) {
        this.driver = driver;
    }
    public void writeinthefiled(String text)
    {
        driver.findElement(target).sendKeys(text);

    }
    public String gettextbelow()
    {
       return driver.findElement(result).getText();
    }

}
