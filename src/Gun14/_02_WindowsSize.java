package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _02_WindowsSize extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.Bekle(4);

        Dimension yeniBoyut = new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut);


        BekleKapat();
    }
}
