package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Loginpage;
import pages.securepage;

import static org.testng.Assert.assertTrue;

public class LoginTest  extends BaseTests {
    @Test

    public void testsucssfulllogintest()
    {
        Loginpage loginpage = Homepage.clickFormAuthentication();
        loginpage.setuseername("tomsmith");
        loginpage.setpassword("SuperSecretPassword!");
        securepage securepahe= loginpage.clickloginbutton();
        assertTrue(securepahe.setalerttext().contains("You logged into a secure area!"),"wrong");

    }
}
