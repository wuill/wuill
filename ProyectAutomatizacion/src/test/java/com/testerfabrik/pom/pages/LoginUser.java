package com.testerfabrik.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUser {
    WebDriver driver;
    By user = By.xpath("//*[@id=\"loginusername\"]");
    By Passw = By.xpath("//*[@id=\"loginpassword\"]");
    By Login = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");


    public  LoginUser ( WebDriver driver){
        this.driver= driver;
    }
    public void User (String stUsuario) {
        driver.findElement(user).sendKeys(stUsuario);
    }
    public void contraseña (String Contraseña) {
        driver.findElement(Passw).sendKeys(Contraseña);
    }
    public void Btenviar () {
        driver.findElement(Login).click();
        String testofinal = driver.findElement(By.id("nameofuser")).getText();
        System.out.println(testofinal.contains("Welcome Fernando")?testofinal:"Caso fallido");
        System.out.println("EL texto es --> "+ testofinal);

    }
    public void EnviarDatos (String usuario, String cotraseña) {
        this.User(usuario);
        this.contraseña(cotraseña);
        this.Btenviar();
    }
}
