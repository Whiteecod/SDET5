package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import com.oracle.webservices.internal.api.message.BaseDistributedPropertySet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

import java.sql.Driver;

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

        WebElement sepet = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        sepet.click();



        BekleKapat();
    }
}
