package com.testerfabrik.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Tempo {
    static WebDriver driver;
    static  String Chromepath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver",Chromepath );
        driver = new ChromeDriver();
        String baseUrl = "https://www.demoblaze.com/index.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait waitVar = new WebDriverWait(driver, 15);

        try {
            WebElement btTry = driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
            btTry.click();
            Thread.sleep(3000);
            String finaltest = driver.findElement(By.xpath("//*[@id=\"signin2\"]")).getText();
            String expecteResult = "Sign up";
            //System.out.println(finaltest.contains("Sign up")?finaltest:"Caso fallido");
            Assert.assertEquals(expecteResult, finaltest);
            System.out.println("Resultado despues del obtener el titulo ->"+ finaltest);

        }catch (NoSuchElementException | InterruptedException ex){
            System.err.println("No se encontro el Webelement" + ex.getMessage());
        }
        driver.quit();
    }

}
