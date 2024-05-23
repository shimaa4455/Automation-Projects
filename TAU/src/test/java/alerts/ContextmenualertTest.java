package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class ContextmenualertTest extends BaseTests {
    @Test
    public void contextmenuTest()
    {
       var contextmenu= Homepage.clickContexMenu();
       contextmenu.righetclick();
      var result= contextmenu.getthetext();
      assertEquals(result,"You selected a context menu");
    }
}
