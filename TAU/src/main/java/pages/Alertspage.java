package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alertspage {
   private WebDriver driver;
   private By alertbutton = By.xpath("//button[text()=\"Click for JS Alert\"]");
   private By confirmButton =By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By promptButton =By.xpath("//button[text()=\"Click for JS Prompt\"]");


    private By alertmessege = By.id("result");

    public Alertspage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggeralert()
    {
        driver.findElement(alertbutton).click();
    }
    //switchto.alert it is used to move from the dom to the alert that showed and alert function it return alert object
    public void acceptalert()
    {
        driver.switchTo().alert().accept();
    }
    public void triggerconfirm()
    {
        driver.findElement(confirmButton).click();

    }
    public void cancelconfirmalert()
    {
        driver.switchTo().alert().dismiss();
    }
    public String alert_gettext()
    {
        return driver.switchTo().alert().getText();
    }
    public String getresult()
    {
       return driver.findElement(alertmessege).getText();
    }
    public void triggerprompt()
    {
        driver.findElement(promptButton).click();
    }
    public void sendtxttotheprompt(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

}
