package com.testerfabrik.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By likRegister = By.linkText("REGISTER");
    // se crea el construntor para la clase
    public  HomePage (WebDriver driver) {
        this.driver = driver;
    }
    public void clicRegisterPage (){
        driver.findElement(likRegister).click();
    }
    public String getTitleHomePage () {
        return driver.getTitle();
    }
}
