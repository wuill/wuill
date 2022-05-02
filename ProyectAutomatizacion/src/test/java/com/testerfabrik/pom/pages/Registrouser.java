package com.testerfabrik.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrouser {
    WebDriver driver;
    By username = By.xpath("//*[@id=\"sign-username\"]");
    By password = By.xpath("//*[@id=\"sign-password\"]");
    By Btnenviar = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    // se llama al constructar de la clase

    public  Registrouser ( WebDriver driver){
        this.driver= driver;
    }
    // metodo para crear el usuario
    public void CrearUsuario (String strUser){
        driver.findElement(username).sendKeys(strUser);
    }
    //metodo para crear la contraseña
    public void CrearContraseña (String stPassw){
        driver.findElement(password).sendKeys(stPassw);
    }
    //metodo para hacer click en el botón enviar
    public void BtnEnviar (){
        WebDriverWait waitVar = new WebDriverWait(driver, 10);
        driver.findElement(Btnenviar).click();
        waitVar.until(ExpectedConditions.alertIsPresent());
        Alert alerWindow = driver.switchTo().alert();// clase para controlar las alertas
        String alerttest = alerWindow.getText();
        String finaltest = "This user already exist";
        // Thread.sleep(3000);
        alerWindow.accept();
        System.out.println(alerttest.contains("successful")?alerttest:"prueba Fallida");
    }
    // metodo para enviar los datos en el formulario usuario y contraseña
    public void EnviarFormu (String User, String Password) throws InterruptedException {
        this.CrearUsuario(User);
        this.CrearContraseña(Password);
        this.BtnEnviar();
    }
}
