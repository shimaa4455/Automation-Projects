package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nestedframe {
    private WebDriver driver;
    private By left= By.xpath("//frame[@name=\"frame-left\"]");
    private By top=By.xpath("//frame[@name=\"frame-top\"]");
    private By bottom=By.xpath("//frame[@name=\"frame-bottom\"]");
    private By body = By.tagName("body");


    public Nestedframe(WebDriver driver) {
        this.driver = driver;
    }
    public String getoleftframetext()
    {
        driver.switchTo().frame(driver.findElement(top));
        driver.switchTo().frame(driver.findElement(left));
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit left to top
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }
    public String getbottomframetetxt()
    {
        driver.switchTo().frame(driver.findElement(bottom));
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }
    private String getFrameText(){
        return driver.findElement(body).getText();
    }

}
