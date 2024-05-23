package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    private WebDriver driver;
    //private By FormAuthenticationlink=By.linkText("Form Authentication");
   public Homepage(WebDriver driver)
   {
        this.driver=driver;
    }
    public Loginpage clickFormAuthentication()
    {
        clicklink("Form Authentication");

        return new Loginpage(driver);
    }
    public Dropdown clickdropdownpage()
    {
        clicklink("Dropdown");
        return new Dropdown(driver);
    }
    public Havorpage clickhover()
    {
        clicklink("Hovers");
        return new Havorpage(driver);
    }
    public Forgetpassword clickforgerpassword()
    {
        clicklink("Forgot Password");
        return new Forgetpassword(driver);
    }
    public HorizontalSlider clickhorizontalslider()
    {
        clicklink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public Keypresses clickkeypresses()
    {
        clicklink("Key Presses");
        return new Keypresses (driver);
    }
    public Alertspage clickalert()
    {
        clicklink("JavaScript Alerts");
        return new Alertspage(driver);

    }
    public ContextMenu clickContexMenu()
    {
        clicklink("Context Menu");
        return new ContextMenu(driver);
    }
    public WYSIWYG clickWYSIWYG()
    {
        clicklink("WYSIWYG Editor");
        return new WYSIWYG(driver);
    }
    public Frames clickframes()
    {
        clicklink("Frames");
        return new Frames(driver);
    }
    public Dynamicloadingpage clickdynamic1()
    {
        clicklink("Dynamic Loading");
        return new Dynamicloadingpage(driver);

    }
    public LargeAndDeepPage clickLrgeandDeepDOM()
    {
        clicklink("Large & Deep DOM");
        return new LargeAndDeepPage(driver);

    }
    public InfiniteScrollPage clickInfinteScroll()
    {
        clicklink("Infinite Scroll");
        return new InfiniteScrollPage(driver);

    }
    public MulitpleWindwosPage clickMulitpleWindwos()
    {
        clicklink("Multiple Windows");
        return new MulitpleWindwosPage(driver);
    }
    protected void clicklink(String linktext)
    {
        driver.findElement(By.linkText(linktext)).click();
    }

}
