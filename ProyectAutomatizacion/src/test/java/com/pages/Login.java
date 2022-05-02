package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    By Linklogin = By.xpath("//*[@id=\"login2\"]");
    By Titulologin = By.xpath("//*[@id=\"logInModalLabel\"]");
    By username = By.xpath("//*[@id=\"loginusername\"]");
    By Password = By.xpath("//*[@id=\"loginpassword\"]");
    By BtnLogin = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By ClicMonitors = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
    By ClickNext = By.xpath("//*[@id=\"next2\"]");


    // se crea el constructor de la clas
    public Login (WebDriver driver) {
        this.driver = driver;
    }
    // Metodo que hace click sobre el link Login
    public  void ClickLogin () throws InterruptedException {
        driver.findElement(Linklogin).click();
        Thread.sleep(1000);
    }
    // metodo que obtiene el titulo de la ventana modal login
    public void ObtenerTitulo () {
        driver.findElement(Titulologin).getText();
    }
    // metodo que llena el campo usuario
    public void LlenarUsuario(String strusuario){
        driver.findElement(username).sendKeys(strusuario);
    }
    // metodo que llena el campo contraseña
    public void LennarContraseña (String strContrsena){
        driver.findElement(Password).sendKeys(strContrsena);
    }
    // metodo que hace click sobre el botón Login
    public void ClickBtnLogin () throws InterruptedException {
        driver.findElement(BtnLogin).click();
        Thread.sleep(2000);
    }
    public  void ClickMonitor () throws InterruptedException {
        driver.findElement(ClicMonitors).click();
        Thread.sleep(2000);
    }
    public void CLickNext () throws InterruptedException {
        driver.findElement(ClickNext).click();
        Thread.sleep(2000);
    }
    /*public void capturasPantalla (WebDriver driver, String Archivo){
        TakesScreenshot captura = (TakesScreenshot)driver;
    }*/
    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm(String Usurio, String Password) throws InterruptedException {
        this.ObtenerTitulo();
        this.LlenarUsuario(Usurio);
        this.LennarContraseña(Password);
        this.ClickBtnLogin();
    }
}
