package com.testerfabrik.pom.test;

import com.testerfabrik.pom.pages.HomePage;
import com.testerfabrik.pom.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Registertest {
    WebDriver driver;
    String expectecResult = null;
    String actalresult = null;
    HomePage objHome;
    RegisterPage objregister;

    @BeforeTest
    public  void seup () {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/index.php");
    }
    @AfterTest
    public void tearDown (){
        driver.quit();
    }
    @Test (priority = 0)
    public void goToregisterPage(){
        objHome = new HomePage(driver);
        objHome.clicRegisterPage();
        expectecResult = "Register: Mercury Tour";
        actalresult = objHome.getTitleHomePage();
        Assert.assertEquals(actalresult, expectecResult);

    }
    @Test (priority = 1)
    public void Registeruser(){
        objregister = new RegisterPage(driver);
        objregister.setFirsName("William fernando");
        objregister.selectCountry("COLOMBIA");
        objregister.Enviarformu("wuillam77@gmail.com", "12345");
        WebElement testSuccess = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
        String OptenerTest = testSuccess.getText();
        System.out.println("Test exitoso:"+ OptenerTest);

    }

}

