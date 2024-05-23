package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementIsHiddenPage {
    private WebDriver driver;
    //private Duration time;
    private By startbutton= By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By loadtext=By.id("finish");

    public ElementIsHiddenPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickstart()
    {

        driver.findElement(startbutton).click();
        //this explicit wait
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        //this fluent wait it is more specific اقدر في خلال  الوقت ال بيستني فيخ اخليه يعمل شيك عللا على حاجات تاني
       /* FluentWait wait= new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));*/

    }
    public String getLoadText()
    {
        return driver.findElement(loadtext).getText();
    }

}
