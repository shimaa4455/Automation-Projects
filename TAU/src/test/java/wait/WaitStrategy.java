package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class WaitStrategy extends BaseTests {
    @Test
    public void TestWaitUntilHidden()
    {
        var laodingpage=Homepage.clickdynamic1().clickexample1();
        laodingpage.clickstart();
        assertEquals(laodingpage.getLoadText(),"Hello World!");
    }
    @Test
    public void testWaitUntilVisible()
    {
        var laodingpage=Homepage.clickdynamic1().clickexample2();
        laodingpage.clickstart();
        assertEquals(laodingpage.getLoadedText(),"Hello World!");
    }


}
