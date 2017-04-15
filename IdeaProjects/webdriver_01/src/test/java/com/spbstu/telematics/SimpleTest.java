package com.spbstu.telematics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by hamlet on 21.03.17.
 */
public class SimpleTest extends Init{
    @Test
    public void test1(){
        driver.navigate().to("http://www.google.com");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("spbstu" + Keys.ENTER);
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='res']//div[@class='g']//cite"));
        String expected = "spbstu";
        Assert.assertTrue(elements.stream().anyMatch(e -> e.getText().contains(expected)));
    }
    @Test
    public void test2(){
        driver.navigate().to("https://ya.ru/");
        WebElement element = driver.findElement(By.id("text"));
        element.sendKeys("spbstu" + Keys.ENTER);
        List<WebElement> elements = driver.findElements(By.xpath("html/body/div[2]/div[1]/div[3]/div[1]/div[1]/ul//li"));
        String expected = "spbstu";
        Assert.assertTrue(elements.stream().anyMatch(e -> e.getText().contains(expected)));
    }
}
