package cookie;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class CookieTest extends BaseTests {
    @Test
    public void cookieIsDeletedTest()
    {
        var cookiemanager= getcookiemanager();
        Cookie cookie=cookiemanager.buildCookie("optimizelyBuckets", "%7B%7D");
        cookiemanager.deletecookie(cookie);
        assertFalse(cookiemanager.isCookiePresent(cookie),"the cookie was not deleted");

    }
}
