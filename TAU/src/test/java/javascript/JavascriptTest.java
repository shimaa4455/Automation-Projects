package javascript;
import static org.testng.Assert.*;


import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTest extends BaseTests {
  /*  @Test
    public void testscrolltabletetst()
    {
        Homepage.clickLrgeandDeepDOM().scrollToTable();
    }*/
    @Test
    public void TestScrollToFifithPragraph()
    {
        Homepage.clickInfinteScroll().scrolltopragraph(5);
    }
}
