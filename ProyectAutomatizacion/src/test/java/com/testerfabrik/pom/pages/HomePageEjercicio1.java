package com.testerfabrik.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePageEjercicio1 {
    WebDriver driver;
    By LinkLogin = By.linkText("Sign up");
    By titulomodal = By.xpath("//*[@id=\"signInModalLabel\"]");
    By Login = By.linkText("Log in");
    By Contac = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By LinkLaptos = By.linkText("Laptops");
    By linkContacto = By.xpath("//*[@id=\"exampleModalLabel\"]");

    // se crea el constructor para la clase
    public HomePageEjercicio1 (WebDriver driver){
        this.driver = driver;
    }
    public void clickSignUp  () {
        driver.findElement(LinkLogin).click();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    public void ClickLogin (){
        driver.findElement(Login).click();
    }
    public void Contac() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Contac).click();
        String expecteResult= "New message";
        String ActualResult = this.getTitleContac();
        Thread.sleep(3000);
        System.out.println("Resultado despues del obtener el titulo ->"+ ActualResult);
        Assert.assertEquals(expecteResult, ActualResult);

    }
    public String getTitleContac (){
        return driver.findElement(linkContacto).getText();
    }
   public void getTitle() throws InterruptedException {
        //Thread.sleep(3000);
       WebDriverWait espera = new WebDriverWait(driver, 1);
     //  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       espera.until(ExpectedConditions.visibilityOfElementLocated(titulomodal));
       String Actualresul = driver.findElement(titulomodal).getText();
       String expecteResult= "Sign up";
       System.out.println("Resultado despues del obtener el titulo ->"+ Actualresul);
       Assert.assertEquals(expecteResult, Actualresul);

    }
    public void GotoLaptos (){
        driver.findElement(LinkLaptos).click();

    }
}
