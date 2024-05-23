package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Homepage;
import utils.CookieManager;
import utils.EventReborter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTests {
    private EventFiringWebDriver driver;
    protected Homepage Homepage;
@BeforeTest
@Parameters( { "BrowserType"} )
    public void setUp( @Optional("chrome") String browserType)
    {

        if (browserType.equalsIgnoreCase("Chrome"))
        {
            //ده عباره عن event firingwebdriver ده وب listen ل اي ايفنت
            driver = new EventFiringWebDriver(new ChromeDriver());
        }
        else if (browserType.equalsIgnoreCase("Firefox"))
        {

            driver = new EventFiringWebDriver(new FirefoxDriver());
        }
        //this is implicit wait
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
       // عشان اقدر اخليها-> (driver) فعلا تسمع للايفنت بستخدم ميثود اسمها ريجستر تاخد كلاس ب implement ويب درايفر ايقنت ليسمر انترفيس ال انا سميته eventreborter
        driver.register(new EventReborter());
        gohome();
        //driver.get();
        //Homepage = new Homepage(driver);
        //setcookie();


    }
    @BeforeMethod
    public void gohome()
    {
        driver.get("https://the-internet.herokuapp.com/");
        Homepage = new Homepage(driver);

    }


    @AfterClass
    public void shutdown()
    {
       // driver.quit();
    }
    //هنا عملنا كاست للدرايفر وبقي اويجكت من كلاس سكرينشوت

    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        //عملنا مدا بحيث مياخد لثطه عير لما التست تفيل
        //(ITestresult) دي باكج من تستنج بخرن فيها حاله التيست سواء فشل ولا باس
        if(ITestResult.FAILURE==result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            //ده هيحلي السكرين شوت تبقى فايل
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //عملنا ال try-catch دي عشان الموف رمت اكسبشن لاوم يتهندل
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
            //System.out.println("screenshot taken " + screenshot.getAbsolutePath());

        }

    }

    //هنا بقى احنا كان عايزين ننادي الفانكشن الجوا windowmanager غشان نعمل مدا لازم نباصي درايفر للكونتسراكتور بتاع الكلسا ده فاحنا هنا روحنا
    // لل base test  لان هنا اقدر انادي الدرايفر فروحنا عملنا فانكسن بترجع اوبجكت من windowmanager عن طريق باضينا للكونستراكتور درايفر
    //دلوقتي اقدر استعلم الفانكشنز الجوا windowmanager عن كريق الفانكشن دي اني اناديها في navigationTest
    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);

    }
   /* private void setcookie()
    {
        //هنا انا بنتي الكوكي للموقع ال عيزاه
        Cookie cookie = new Cookie.Builder("tau" ,"123" ).domain("the-internet.herokuapp.com").build();
        //set the cookie
        driver.manage().addCookie(cookie);
    }*/
    public CookieManager getcookiemanager()
    {
        return new CookieManager(driver);
    }


}
