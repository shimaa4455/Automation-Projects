package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.HorizontalSlider;
import static org.testng.Assert.*;

public class SliderTest extends BaseTests {


    @Test
    public void slidertetst()
    {
      HorizontalSlider HorizontalSlider=  Homepage.clickhorizontalslider();
      HorizontalSlider.sliderincreasetofour("4");
      assertEquals(HorizontalSlider.getslidervalue(),"4","Slider value is incorrect");
    }


}
