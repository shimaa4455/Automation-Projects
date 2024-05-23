package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
     private WebDriver driver;
     private By slider = By.cssSelector(".sliderContainer input");
    private By slidervalue = By.id("range");


    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }
    public void  sliderincreasetofour(String value)

    {
        while(!getslidervalue().equals(value))
        {driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);}
    }
    public String getslidervalue()
    {
         return driver.findElement(slidervalue).getText();
    }


}
