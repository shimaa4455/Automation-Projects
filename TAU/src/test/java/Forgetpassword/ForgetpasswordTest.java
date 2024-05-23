package Forgetpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import pages.Forgetpassword;
import pages.Homepage;

public class ForgetpasswordTest extends BaseTests {
    @Test
    public void newmeesegeapearTest()
    {
       Forgetpassword Forgetpassword= Homepage.clickforgerpassword();
       Forgetpassword.enteremailinemailfield("shimaa.shehata@yahoo.com");
       Forgetpassword.clickretrivepassword();
       String themessege =Forgetpassword.gettextmessege();
       assertTrue(themessege.contains("Internal Server Error"),"test fail");


    }
}
