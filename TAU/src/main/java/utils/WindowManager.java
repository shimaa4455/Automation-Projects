package utils;

import org.openqa.selenium.WebDriver;
//الكلاس دي عملتها في باكج مختلفه لانها بتتاعامل مع البراوزر ذات نفسه ميعتبرش صفحه
public class WindowManager {
    private WebDriver driver;
    //عملته عشان بدل ما انادي كل شويه ال navigate في كل فانكشن استعمل دي ع طول
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goback()
    {
//الخطوه دي شلناها وحطينا الاتحتها بسبب ال الاوبجكن ال حطيناه فده وفر علينا بحيث ف اي فانكشن انادي ع طول ع الاوبجطت
        //driver.navigate().back();
        navigate.back();
    }
    public void goforward()
    {
        navigate.forward();
    }
    public void refresh()
    {
        navigate.refresh();
    }
    public void  goTo(String url)
    {
        navigate.to(url);
    }
    //(getwindowhandel) دي بترجع هاندل لكل التابات المفتوحه
    //ال println دي مجرد عشان تفهمني ايه ال بيحصل جوا الفانكشن
    //خاندل ده بيكون حاجه مميزه للويندو ال بتتفتح وكل مره بفتحه بيحصل generate لهاندل جديد
    public void switchToTab(String tabTitle)
    {
        var windows= driver.getWindowHandles();
        System.out.println("number of windows" + windows.size());
        System.out.println("windows handels");
        windows.forEach(System.out::println);
        for(String window:windows)
        {
            //هنا ال ويدو جواها قيمخ الهادل اليونيك للويندو
            System.out.println("swithching to window " + window);
            //هنا انا بروح من ال dom للويندو
            driver.switchTo().window(window);
            System.out.println("current window title " + driver.getTitle());
            if(tabTitle.equals(driver.getTitle()))
            {
                break;
            }
        }

    }
    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
    public void swithtotab2()
    {
        var windows = driver.getWindowHandles();
        //windows دي الليسته البيبقى جواها كذا حاجه
        // window دي الفانكشن ال مش بتاخد غير ارجيومنت واحد فبنكر نعمل :: عشان نقدر نباصي اكتر من ارجيومن كل ارجيومنت في لوب لوحدها
        windows.forEach(driver.switchTo()::window);
    }
}
