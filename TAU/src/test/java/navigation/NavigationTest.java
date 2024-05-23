package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class NavigationTest extends BaseTests {
    @Test
    public void Testnavigatior()
    {
        Homepage.clickdynamic1().clickexample1();
        //ميزتهم مش بحتاح ان استني الصغحه انها تحمل
        getWindowManager().goback();
        getWindowManager().refresh();
        getWindowManager().goforward();
        getWindowManager().goTo("https://google.com");

    }
    @Test
    public void Testswitchwindow()
    {
        Homepage.clickMulitpleWindwos().clickhere();
        getWindowManager().switchToTab("New Window");
    }
    @Test
    public void  testopenNewWindowbyCommand()
    {
        var buttonPage = Homepage.clickdynamic1().righclickexample2();
        getWindowManager().swithtotab2();
        assertTrue(buttonPage.isStartButtonDisplayed(),"Start button is not displayed");

    }

}
