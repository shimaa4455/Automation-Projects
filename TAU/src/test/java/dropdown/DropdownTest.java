package dropdown;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Dropdown;
import static org.testng.Assert.*;


import java.util.List;

public class DropdownTest extends BaseTests {

    @Test
    public void testselectoption()
    {
        Dropdown Dropdown = Homepage.clickdropdownpage();
        Dropdown.selectfromdropdown("Option 1");
        List<String> selectedoptions= Dropdown.getselectedoptions();
        assertEquals(selectedoptions.size(),1,"incorrect number of asssertion");
        assertTrue(selectedoptions.contains("Option 1"),"NOT selected");

        }
     @Test
    public void testselectmultipleoption()
        {
            Dropdown Dropdown = Homepage.clickdropdownpage();
            Dropdown.addmulitbleoptions();
            var optionstoselect = List.of("Option 1", "Option 2");
            //هنا for each بتباصي اوبشن 1 للفانكشن selectfromdropdown بعدين بتباصي اوبشن 2 لنفس الفامشكن في لوب بعدها
            //الفانكسن دي بتاخد المنت واحد بس فاحنا عملنا الطريقه دي عشان نفدر نباضي اكتر من element
            optionstoselect.forEach(Dropdown::selectfromdropdown);


            var selectedOptions = Dropdown.getselectedoptions();
            assertTrue(selectedOptions.containsAll( optionstoselect), "All options were not selected");
            assertEquals(selectedOptions.size(),  optionstoselect.size(), "Number of selected items");

        }
}
