package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Havorpage {
    private WebDriver driver;
    private By figurebox = By.className("figure");
    private By boxcaption = By.className("figcaption");
    public Havorpage(WebDriver driver) {
        this.driver=driver;
    }

    /**
     *
     * @param index start at 1
     */
    public figurecaption hoveroverfigure(int index)
    {
        WebElement figure=driver.findElements(figurebox).get(index-1);
        Actions actions= new Actions(driver);
        actions.moveToElement(figure).perform();
        return new figurecaption(figure.findElement(boxcaption));
    }
    public class figurecaption
    {
        private WebElement caption;
        private By header= By.tagName("h5");
        private By linktext=By.tagName("a");

        public figurecaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean iscaptiondisplayed()
        {
            return caption.isDisplayed();
        }
        public String gettitle()
        {
            return caption.findElement(header).getText();
        }
        public String getlinktext()
        {
            return caption.findElement(linktext).getText();
        }
        public String getlink()
        {
            return caption.findElement(linktext).getAttribute("href");
        }
    }
}
