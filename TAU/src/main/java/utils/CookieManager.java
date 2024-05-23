package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }
    //بتصيف كوكي
    public void addcookie(Cookie cookie)
    {
        driver.manage().addCookie(cookie);
    }
    //بتمسح كوكي
    public void deletecookie(Cookie cookie)
    {
        driver.manage().deleteCookie(cookie);
    }
    //بتتاكد ان الكوكي موجود
    public boolean isCookiePresent(Cookie cookie)
    {
        return driver.manage().getCookieNamed(cookie.getName()) !=null;
    }
    //set the cookie
    public Cookie buildCookie(String name, String value)
    {
        Cookie cookie = new Cookie.Builder(name,value)
                .domain("the-internet.herokuapp.com")
                .build();
        System.out.println("HFHJFJ");
        return cookie;
    }
}
