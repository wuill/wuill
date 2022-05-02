package com.Ejercicios.testNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

public class EjercicioAlert {

    static  WebDriver driver;
    static  String Chromepath = System.getProperty("user.dir")+"\\Driver\\";

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver",Chromepath );
        driver = new ChromeDriver();
        String baseUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait waitVar = new WebDriverWait(driver, 15);

        try {
            driver.switchTo().frame("iframeResult");// sobre carga de metodos para acceder a los IFRAMES HTML
            WebElement btTry = driver.findElement(By.xpath("/html/body/button"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btTry));
            btTry.click();
            Thread.sleep(2000);
            waitVar.until(ExpectedConditions.alertIsPresent());
            Alert alerWindow = driver.switchTo().alert();// clase para controlar las alertas
            String alertext = alerWindow.getText();// se obtiene el texto del alerta
            System.out.println(alertext);// se imprime el texto del alerta
            alerWindow.sendKeys("William");
            alerWindow.accept();
            Thread.sleep(2000);
            String finaltest = driver.findElement(By.id("demo")).getText();
            System.out.println(finaltest.contains("william")?finaltest:"Caso fallido");

        }catch (NoSuchElementException ne){
            System.err.println("No se encontro el Webelement" + ne.getMessage());
        }catch (NoSuchFrameException fa){
            System.out.println("No se encontro el frame" +fa.getMessage());

        }catch (NoAlertPresentException aler){
            System.out.println("No se encontro el alerta" +aler.getMessage());
        }
        catch (WebDriverException we){
            System.err.println("WebDriver ha fallado:"+ we.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }finally {
            driver.quit();
        }
    }





















}
