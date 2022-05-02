package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contac {
    WebDriver driver;
    By LinkContacto = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By LinkTituloLop = By.xpath("//*[@id=\"exampleModalLabel\"]");
    By ContacEmail = By.xpath("//*[@id=\"recipient-email\"]");
    By ContacName = By.xpath("//*[@id=\"recipient-name\"]");
    By Mensaje = By.xpath("//*[@id=\"message-text\"]");
    By BtonEnviarSMS = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    private Contac contac;

    public Contac (WebDriver driver){
        this.driver= driver;
    }
//metodo para hacer click en el enlace Contacto
    public void GoTocontacto () throws InterruptedException {
        driver.findElement(LinkContacto).click();
        Thread.sleep(1000);
    }
    // metodo para optener el titulo del modal contacto
    public void Obtenertitulo (){
       driver.findElement(LinkTituloLop).getText();
    }
    // llenar campo CONTAC EMAIL
    public void Emailcontacto (String email){
        driver.findElement(ContacEmail).sendKeys(email);
    }
    // llenar el campo CONTAC NAME
    public void Nombrecontacto (String Nombre) {
        driver.findElement(ContacName).sendKeys(Nombre);
    }
    // llenar campo testo mensaje
    public void Mensaje (String stmensaje){
        driver.findElement(Mensaje).sendKeys(stmensaje);
    }
    // metodo para el boton enviar mensaje
    public void BtnEnviar (){
        driver.findElement(BtonEnviarSMS).click();
    }
    // metodo que contiene los metodos para enviar los datos
    public  void EnviarDatos (String stremeil, String nombre, String strmensaje){
        this.Obtenertitulo();
        this.Emailcontacto(stremeil);
        this.Nombrecontacto(nombre);
        this.Mensaje(strmensaje);
        this.BtnEnviar();
    }
}
