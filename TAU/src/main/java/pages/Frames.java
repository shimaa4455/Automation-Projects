package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
    private WebDriver driver;

    public Frames(WebDriver driver) {

        this.driver = driver;
    }

    public Nestedframe clicknestedframe()
    {
        driver.findElement(By.linkText("Nested Frames")).click();
        return new Nestedframe(driver);
    }
}
