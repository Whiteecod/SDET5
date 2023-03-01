package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Assert;
import org.junit.Test;
import com.oracle.webservices.internal.api.message.BaseDistributedPropertySet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import java.util.Collections;
import java.util.List;


public class _01_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        // 1. Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();

        MyFunc.Bekle(2);
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        MyFunc.Bekle(2);
        WebElement btnBack = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack.click();


        // 2. Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        MyFunc.Bekle(2);
        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();

        MyFunc.Bekle(2);
        WebElement btnBack2 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack2.click();

        // sepet işlemleri
        MyFunc.Bekle(2);
        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        MyFunc.Bekle(2);
        WebElement buttonCheckOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        // kullanıcı bilgileri giriyoruz
        MyFunc.Bekle(1);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("ismet");

        MyFunc.Bekle(1);
        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("temur");

        MyFunc.Bekle(1);
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("232323");

        MyFunc.Bekle(1);
        WebElement btnContinue=driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();

        List<WebElement> ucretler= Collections.singletonList(driver.findElement(By.xpath("//div[@class='inventory_item_price']")));

        double toplam=0;
        for (WebElement e: ucretler) {
            System.out.println("e.getText() = " + e.getText()); // $29.99 -> e.getText().substring(1) -> 29.99
            // replaceAll ile [^0-9.,]
            toplam=toplam+ Double.parseDouble(e.getText().substring(1)); // 1 den itibaren sonuna kadar al
        }
        System.out.println("toplam = " + toplam);

        //alt toplam
        WebElement webAltToplam= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam.getText() = " + webAltToplam.getText());
        //System.out.println("webAltToplam.getText().replaceAll(\"[^0-9,.]\",\"\") = " +
        //       webAltToplam.getText().replaceAll("[^0-9,.]",""));
        Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Değerleri eşit değil" , (toplam==altToplam));

        System.out.println("altToplam = " + altToplam);






        BekleKapat();
    }
}
