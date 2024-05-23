package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Havorpage;
import static org.testng.Assert.*;

public class HoverTest extends BaseTests {
    @Test
    public void testhoveruser1()
    {
        Havorpage Hoverpage = Homepage.clickhover();
        Havorpage.figurecaption caption =Hoverpage.hoveroverfigure(1);
        //var caption =Hoverpage.hoveroverfigure(1);

        assertTrue(caption.iscaptiondisplayed(),"caption not displayed");
        assertEquals(caption.gettitle(),"name: user1","caption titile incorrect");
        assertEquals(caption.getlinktext(),"View profile","incorrect linktext");
        assertTrue(caption.getlink().endsWith("/users/1"),"incorrectlink");
    }

}
