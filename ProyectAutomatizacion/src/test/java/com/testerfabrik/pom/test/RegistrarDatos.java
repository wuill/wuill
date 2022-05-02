package com.testerfabrik.pom.test;

import com.testerfabrik.pom.pages.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrarDatos {
    WebDriver driver;
    String expecteResult = null;
    String ActualResult = null;
    HomePageEjercicio1 objHomePage;
    Registrouser objRegisteruser;
    LoginUser objLoginUser;
    Contacto objContacto;
    AgregarCarrito objCarrito;

    @BeforeTest
    public void setup (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/");
    }
  @AfterTest // anotación para cerrar el navegador
    public void tearDown (){
        driver.quit();
    }

    @Test (priority = 0) // metodo para hacer click en el link SING UP
    public  void GotoRegisteruser () throws InterruptedException   {
        objHomePage = new HomePageEjercicio1(driver);
        objHomePage.clickSignUp();
        objHomePage.getTitle();

      }

   @Test (priority = 1) // metodo para crear el usaurio en el SIGN UP
    public  void Registeruser ()  throws InterruptedException {
        objRegisteruser = new Registrouser(driver);
        objRegisteruser.EnviarFormu("Fernando7758", "112357");
        Thread.sleep(2);
    }
    @Test (priority = 2)
    public  void Login () throws InterruptedException {
        objHomePage = new HomePageEjercicio1(driver);
        objHomePage.ClickLogin();
        objLoginUser = new LoginUser(driver);
        Thread.sleep(10);
        objLoginUser.EnviarDatos("Fernando7758", "112357");// Se llama el metodo "EnviarDatos" de la clase LoginUser
    }
    @Test (priority = 3)
    public void GotoContacto () throws InterruptedException {
        objHomePage = new HomePageEjercicio1(driver);
        objHomePage.Contac();// se llama al metodo Contac de la clase HomePageEjercicio1

    }
    @Test (priority = 4)
    public  void Contacto () throws InterruptedException {
        objContacto = new Contacto(driver);
        objContacto.EnviarContacto("wuillam@gmail.com", "Fernando puentes",
                "Me interesa recibir notificaciones, gracias" );
        Thread.sleep(5);

    }
 @Test (priority = 5)
    public  void GoLaptos(){
        objHomePage = new HomePageEjercicio1(driver);
        objHomePage.GotoLaptos();
    }

    @Test (priority = 6)
    public void Carrocompra () {
        objCarrito = new AgregarCarrito(driver);
        objCarrito.enviarProductos();
    }

}
