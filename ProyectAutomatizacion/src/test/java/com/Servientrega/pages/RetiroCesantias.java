package com.Servientrega.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class RetiroCesantias {
    WebDriver driver;
    By Tipodocu = By.xpath("//*[@id=\"selectTipoDoc\"]");
    By Numidentificacion = By.xpath("//*[@id=\"formIdentidad\"]/div[2]/label");
    By Fechaexpedicion = By.xpath("//*[@id=\"formIdentidad\"]/div[3]/label");
    By Numcelu = By.xpath("//*[@id=\"formIdentidad\"]/div[4]/label");
    By Datosempleador = By.xpath("//*[@id=\"nit-container\"]/label");
    By Concepto = By.xpath("//*[@id=\"_ztevalidacionidentidadtransunion_INSTANCE_Fox9qwfkwcA9_concepto\"]");
    By Terminos = By.xpath("//*[@id=\"tyc\"]");
    By TratamientoDatos = By.xpath("//*[@id=\"formIdentidad\"]/div[8]/div");


    public RetiroCesantias (WebDriver driver){
        this.driver = driver;
    }
    // Metodo para hacer click en el link ingresar a sección penciones cesantias

    public void Tipodocu (String tipodocu){
        try {
            driver.findElement(Tipodocu).sendKeys(tipodocu);

        }catch (NoSuchElementException ex){
        }
    }
    public void NumeroDocu (String numdocu){
        try {
            driver.findElement(Numidentificacion).sendKeys();

        }catch (NoSuchElementException ex){
            System.out.println("No se encontro el elemento Web-> " +  ex.getMessage());
        }
    }
    public void FechaNacimiento (String Fecnacimiento){
        try {
            driver.findElement(Numidentificacion).sendKeys(Fecnacimiento);

        }catch (NoSuchElementException ex){
            System.out.println("No se encontro el elemento Web-> " +  ex.getMessage());
        }

    }
    public void Numcelular () {
        try {
            driver.findElement(Fechaexpedicion).sendKeys();

        }catch (NoSuchElementException ex){
            System.out.println("No se encontro el elemento Web-> " +  ex.getMessage());
        }


    }
    public void Datosempleador (){

    }
    public  void ConcepRetiro () {
    }
    public void aceptarTerminos () {

    }
    public  void NosoyRobot(){

    }
    public void BtnEnviar (){

    }
    public  void Enviardatos (){

    }
}
