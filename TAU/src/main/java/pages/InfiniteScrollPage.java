package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By scroll= By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * scroll untill pragraph with index specified is view
     * @param index 1-based
     */
    public void scrolltopragraph(int index)
    {
        String script  = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExcuter = (JavascriptExecutor)driver;
        while (getNumberOfthePragraphsArePresent()<index)
        {
            jsExcuter.executeScript(script);

        }
    }
    public int getNumberOfthePragraphsArePresent()
    {
        return driver.findElements(scroll).size();
    }
}
