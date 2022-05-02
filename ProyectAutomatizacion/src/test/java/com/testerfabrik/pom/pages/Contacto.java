package com.testerfabrik.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contacto {
    WebDriver driver;
    By Emailcontac = By.xpath("//*[@id=\"recipient-email\"]");
    By Namecontac = By.xpath("//*[@id=\"recipient-name\"]");
    By Mensaje = By.xpath("//*[@id=\"message-text\"]");
    By EnviarSMS = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    public  Contacto ( WebDriver driver){
        this.driver= driver;
    }
    public void contacEmail (String contactoEma) {
        driver.findElement(Emailcontac).sendKeys(contactoEma);
    }
    public void contacName (String Nombrecontacto) {
        driver.findElement(Namecontac).sendKeys(Nombrecontacto);
    }
    public void contacSMS (String strMensaje) {
        driver.findElement(Mensaje).sendKeys(strMensaje);
    }
    // metodo para el botón de la pantalla de contacto
    public void Btocontac (){
        WebDriverWait waitVar = new WebDriverWait(driver, 10);
        driver.findElement(EnviarSMS).click();
        waitVar.until(ExpectedConditions.alertIsPresent());
        Alert alerWindow = driver.switchTo().alert();// clase para controlar las alertas
        String alerttest = alerWindow.getText();
        // Thread.sleep(3000);
        alerWindow.accept();
        System.out.println(alerttest.contains("Thanks for the message")?alerttest:"prueba Fallida");

    }
    // metodo que agrupa los metodos de enviar los datos de contacto
    public void EnviarContacto (String strEmail, String strNombre, String strMensaje){
        this.contacEmail(strEmail);
        this.contacName(strNombre);
        this.contacSMS(strMensaje);
        this.Btocontac();

    }

}
