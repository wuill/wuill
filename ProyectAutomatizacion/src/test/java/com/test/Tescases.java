package com.test;

import com.pages.Contac;
import com.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.LongBinaryOperator;

public class Tescases {
    WebDriver driver;

    Login objlogin;
    Contac objContacto;

    @BeforeTest
    // Metodo que inicializa el navegador y abre la URL
    public  void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
    }
    // metodo que cierra el navegador despues de cada testcase
  /*  @AfterTest
    public  void tearDown (){
        driver.quit();
    }*/

    @Test(priority = 0)
    public void GotoLogin () throws InterruptedException {
        objlogin = new Login(driver);
        objlogin.ClickLogin();
    }
    @Test (priority = 1)
    public void LoginUser() throws InterruptedException {
        objlogin = new Login(driver);
        objlogin.EnviardatosForm("Fernando7744", "112343");
    }
    @Test (priority = 2)
    public void GoNext() throws InterruptedException {
        objlogin = new Login(driver);
        objlogin.ClickMonitor();
        objlogin.CLickNext();
    }
    @Test (priority = 3)
    public void Gotocontacto () throws InterruptedException {
        objContacto = new Contac(driver);
        objContacto.GoTocontacto();
    }
    @Test (priority = 4)
    public void RegistroContacto (){
        objContacto = new Contac(driver);
        objContacto.EnviarDatos("wuillam77@gmail.com","fernando puentes",
                "Estoy interesado en los productos");
    }
}
