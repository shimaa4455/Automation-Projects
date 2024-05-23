package keypresese;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import pages.Homepage;

public class KeypressTest extends BaseTests {
    @Test
    public void testbackspace()
    {
        var keypress = Homepage.clickkeypresses();
        keypress.writeinthefiled("a"+ Keys.BACK_SPACE);
       var result= keypress.gettextbelow();
       assertEquals(result,"You entered: BACK_SPACE!");
    }
}
