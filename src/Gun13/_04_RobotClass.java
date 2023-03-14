package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {
    @Test
    public void Test1() throws AWTException {
        String window = driver.getWindowHandle();
        MyFunc.Bekle(5);
        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        // driver.switchTo().frame(8); // AcceptAll bölümü kapatması için kullanılan durum

        // List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All'"));
        // if (acceptAll.size() > 0 )
        //  acceptAll.get(0).click();

        Robot rbt = new Robot();
                    driver.switchTo().window(window);

        for (int i = 0; i <21; i++) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı. down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı.
            // mutlaka bu şekilde kullanılması gerekiyor. Tab a bastığında basılı kalıp sistem kitlenebiliyor
        }
          rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı. down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı.

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor.
        StringSelection dosyaYolu = new StringSelection("/Users/kubilayculha/Downloads");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu,null);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_RIGHT);
        rbt.keyRelease(KeyEvent.VK_RIGHT);
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        MyFunc.Bekle(10);

    }
}
