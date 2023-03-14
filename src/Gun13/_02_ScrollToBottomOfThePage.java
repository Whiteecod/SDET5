package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // Sayfanın sonuna kadar kaydırır.
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0, 0);"); // buda en başa direk gidiyor.

        //js.executeScript("\"window.scrollBy(0, 0);"); // bulunduğu yerden 0 kadar gider

        BekleKapat();
    }
}
