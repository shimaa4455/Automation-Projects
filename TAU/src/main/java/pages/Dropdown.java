package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class Dropdown {
   private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public Dropdown(WebDriver driver)
    {
       this.driver=driver;
    }
    public void selectfromdropdown(String option)
    {
       finddropdown().selectByVisibleText(option);

    }
    public void addmulitbleoptions()
    {
        String script="arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script,finddropdown());
    }
    public List<String> getselectedoptions()
    {
       List<WebElement> selectedelements = finddropdown().getAllSelectedOptions();
      return selectedelements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select finddropdown()
    {
        return new Select(driver.findElement(dropdown));
    }

}
