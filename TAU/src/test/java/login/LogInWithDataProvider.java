package login;
import base.BaseTests;
import pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Loginpage;
import pages.securepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LogInWithDataProvider  extends BaseTests{

    @Test(dataProvider ="data")
    public void testsucssfulllogintest (String username,String password)
    {
        Loginpage loginpage = Homepage.clickFormAuthentication();
        loginpage.setuseername(username);
        System.out.println(username);
        loginpage.setpassword(password);
        System.out.println(password);

        securepage securepahe= loginpage.clickloginbutton();
        assertTrue(securepahe.setalerttext().contains("You logged into a secure area!"),"wrong");
    }
    @DataProvider(name="data")
    public Object[][] LoginData()
    {
        Object [][] data = new Object[2][2];
        //the test here will fail(sad senario)
        data[0][0]="shimaa";     data[0][1]="87989";
        //the test here will pass(happy senario)
        data[1][0]="tomsmith";   data[1][1]="SuperSecretPassword!";
        return data;
    }
}
