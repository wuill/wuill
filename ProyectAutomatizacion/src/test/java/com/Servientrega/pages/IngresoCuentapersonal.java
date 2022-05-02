package com.Servientrega.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IngresoCuentapersonal {
    WebDriver driver;
    By Usuario = By.xpath("//*[@id=\"ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_txtUserName\"]");
    By Password = By.xpath("//*[@id=\"ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_txtPassword\"]");
    By btnIngresar = By.xpath("//*[@id=\"ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_lkbLogin\"]");

    public IngresoCuentapersonal (WebDriver driver){
        this.driver = driver;
    }
    public void IngresarUsuario (String usuario){
        driver.findElement(Usuario).sendKeys(usuario);

    }
    public void IngresarPass (String password){
        driver.findElement(Password).sendKeys(password);
    }
    public void Btnenviar (){
        driver.findElement(btnIngresar).click();
    }
    public void enviarDatos (String strusuario, String passw){
        this.IngresarUsuario(strusuario);
        this.IngresarPass(passw);
        this.Btnenviar();
    }
}
