package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ElementAfterTheFactPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");



    public ElementAfterTheFactPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickstart()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));

    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();


    }
    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }
}
