package com.testerfabrik.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;
    By testFirsName = By.name("firstName");
    By Countri = By.name("country");
    By username = By.name("email");
    By Pasword = By.name("password");
    By ConfirPasword = By.name("confirmPassword");
    By Enviar = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input");

    //  se llama el constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;

    }
    public void setFirsName (String strFirsname){
        driver.findElement(testFirsName).sendKeys(strFirsname);

    }
    public void selectCountry (String strcountry){
        new Select(driver.findElement(Countri)).selectByVisibleText(strcountry);
    }
    public void setUsername (String strUsername){
        driver.findElement(username).sendKeys(strUsername);

    }
    public  void strPassword (String strpassword) {
        driver.findElement(Pasword).sendKeys(strpassword);

    }
    public  void strConfirPassword(String strconfirmpass) {
        driver.findElement(ConfirPasword).sendKeys(strconfirmpass);

    }
    public void Btnenviar (){
        driver.findElement(Enviar).click();
    }
    public void Enviarformu (String utrUser, String strPassword){
        this.setFirsName(utrUser);
        this.strPassword(strPassword);
        this.strConfirPassword(strPassword);
        this.Btnenviar();
    }






}
