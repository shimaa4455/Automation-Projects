package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AlertTest extends BaseTests {
    @Test
    public void acceptalerttest()
    {
       var alaertpage= Homepage.clickalert();
       alaertpage.triggeralert();
       alaertpage.acceptalert();
       assertEquals(alaertpage.getresult(),"You successfully clicked an alert","incorrect");
    }
    @Test
    public void gettetxtfromalertTest()
    {
        var alaertpage= Homepage.clickalert();
        alaertpage.triggerconfirm();
       var text= alaertpage.alert_gettext();
        alaertpage.cancelconfirmalert();
        assertEquals(text,"I am a JS Confirm");
    }
    @Test
    public void testprompfield()
    {
        var alaertpage= Homepage.clickalert();
        alaertpage.triggerprompt();
        alaertpage.sendtxttotheprompt("shimaa");
        alaertpage.acceptalert();
       var result= alaertpage.getresult();
       assertEquals(result,"You entered: shimaa");

    }
}
