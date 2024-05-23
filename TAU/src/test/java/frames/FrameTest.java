package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class FrameTest extends BaseTests {
    @Test
    public void testwsysiwyg()
    {
        var editirpage = Homepage.clickWYSIWYG();
        editirpage.cleartext();
        String text1="hello ";
        String text2="world!";
        editirpage.settext(text1);
        editirpage.decreaseindention();
        editirpage.settext(text2);
        assertEquals(editirpage.gettextfromeditor(),text1+text2,"error");
    }

}
