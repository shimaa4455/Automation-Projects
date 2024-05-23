package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dynamicloadingpage {
    private WebDriver driver;
    private String linkpathformat ="//a[contains(text(), '%s')]";
    private By linkExample_1=By.xpath(String.format(linkpathformat,"Example 1"));
    private By linkExample_2=By.xpath(String.format(linkpathformat,"Example 2"));


    public Dynamicloadingpage(WebDriver driver) {
        this.driver = driver;
    }
     public ElementIsHiddenPage clickexample1()
     {
         driver.findElement(linkExample_1).click();
         return new ElementIsHiddenPage(driver);
     }
    public ElementAfterTheFactPage clickexample2()
    {
        driver.findElement(linkExample_2).click();
        return new ElementAfterTheFactPage(driver);
    }
    public ElementAfterTheFactPage righclickexample2()
    {
        WebElement link2= driver.findElement(linkExample_2);
        link2.sendKeys(Keys.chord(Keys.CONTROL ,Keys.RETURN));

        return new ElementAfterTheFactPage(driver);
    }

}
