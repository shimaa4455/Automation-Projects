package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class NestedframesTest extends BaseTests {
    @Test
    public void GetTextFromNestedFrameTest()
    {
        var framepage=Homepage.clickframes();
       var nestesframepage = framepage.clicknestedframe();
       String left = nestesframepage.getoleftframetext();
       String bottom = nestesframepage.getbottomframetetxt();
       assertEquals(left,"LEFT");
       assertEquals(bottom,"BOTTOM");
       System.out.println(left+" "+bottom);

    }
}
