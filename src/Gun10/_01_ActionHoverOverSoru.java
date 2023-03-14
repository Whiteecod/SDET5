package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverSoru extends BaseDriver {
    //     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");

        List<WebElement>cookiesAccept=driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0 ) // varsa
            cookiesAccept.get(0).click(); // kapat, tıkla


        WebElement mucevher=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye=driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye=driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar = new Actions(driver);


        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(3); // gözükene kadar bekle diyeceğiz bir sonra ki derste
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.Bekle(3);
        aksiyonlar.moveToElement(bibKolye).click().build().perform();

        MyFunc.Bekle(3);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("Url de bib Kolye varmi", driver.getCurrentUrl().contains("bib-necklaces"));
        BekleKapat();

    }
}
