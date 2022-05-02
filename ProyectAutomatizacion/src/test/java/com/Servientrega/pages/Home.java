package com.Servientrega.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    WebDriver driver;

    By Descertificado = By.xpath("//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ssR0EqTaUJiS\"]/div/div/div/div[2]/div/div[2]/a[2]");
    By cerrarModal = By.xpath("//*[@id=\"no-momento\"]");
    By CerrarmodalDos = By.xpath("//*[@id=\"modal-general1\"]/div/div/div[1]/button");
    By CerrarModKookies = By.xpath("/html/body/div[11]/a[1]");
    By clickPencionesCesan = By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a");
    By ClicRetirocesantias = By.xpath("//*[@id=\"navbar\"]/ul/li[1]/div/ul/li[3]/ul/li[1]/a");


    public Home (WebDriver driver) {
        this.driver = driver;
    }
    public  void CerrarModal (){
         try {
             driver.findElement(cerrarModal).click();
         }catch (NoSuchElementException ex){
             System.out.println("No se encontro el elemento Web-> " +  ex.getMessage());
         }

    }
    public void CerrarModaldos (){
        driver.findElement(CerrarmodalDos).click();
    }
    public void cerrarKookies () {
        driver.findElement(CerrarModKookies).click();
    }
    /*public void clickCertificado ()  {

        driver.findElement(Descertificado).click();
    }*/
    public void clickPensiCesantias (){
        driver.findElement(clickPencionesCesan).click();
        driver.findElement(ClicRetirocesantias).click();
    }

}
