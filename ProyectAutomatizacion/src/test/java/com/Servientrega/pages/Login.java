package com.Servientrega.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;
     By clickCuenttaPer = By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a");
     By OpcionAfliado = By.xpath("//*[@id=\"linkAfl\"]");

     public Login (WebDriver driver){
         this.driver = driver;
     }
     // Metodo para hacer click en el link ingresar a cuenta personal
    public void IngresoCuentaPerso (){
         driver.findElement(clickCuenttaPer).click();
        driver.findElement(OpcionAfliado).click();
         //WebDriverWait espera =  new WebDriverWait(driver, 2);
     // espera.until(ExpectedConditions.visibilityOfElementLocated(OpcionAfliado)).click();
        //Thread.sleep(5000);
    }
}
