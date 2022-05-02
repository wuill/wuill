package com.testerfabrik.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Struct;

public class AgregarCarrito {
    WebDriver driver;
    By LinkMacbook = By.linkText("MacBook Pro");
    By LinkAgregar = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    String espectedResul = "MacBook Pro";


    public  AgregarCarrito ( WebDriver driver){
        this.driver= driver;
    }
    public void selecionarProducto (){
        String ActualResul = driver.findElement(LinkMacbook).getText();
        System.out.println(ActualResul.contains("MacBook Pro")?ActualResul:"Caso fallido");
        driver.findElement(LinkMacbook).click();

    }
    public void agregarProducto () {
        WebDriverWait waitVar = new WebDriverWait(driver, 10);
        driver.findElement(LinkAgregar).click();
        waitVar.until(ExpectedConditions.alertIsPresent());
        Alert alerWindow = driver.switchTo().alert();// clase para controlar las alertas
        String alerttest = alerWindow.getText();
        // Thread.sleep(3000);
        alerWindow.accept();
        System.out.println(alerttest.contains("Product added")?alerttest:"prueba Fallida");
    }
    public void enviarProductos (){
        this.selecionarProducto();
        this.agregarProducto();
    }

}
