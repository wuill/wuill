package com.Servientrega.test;

import com.Servientrega.pages.Home;
import com.Servientrega.pages.IngresoCuentapersonal;
import com.Servientrega.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver;
    Home objhome; // se instancia la clase Home
    Login objLogin;
    IngresoCuentapersonal objingresocuenta;

    @BeforeTest
    // Metodo que inicializa el navegador y abre la URL
    public  void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.porvenir.com.co/web/personas/inicio");
    }
    @AfterTest
    public void tearDown () {
        driver.quit();
    }
    @Test (priority = 0)
    public void Cerrarmodal (){
        objhome = new Home(driver);
        objhome.CerrarModal();
    }
    @Test (priority = 1)
    public void Cerrarmodaldos (){
        objhome = new Home(driver);
        objhome.CerrarModaldos();
        objhome.cerrarKookies();
    }
  /*  @Test (priority = 2)
    public void GotoOptenerCertificado()  {
        objhome = new Home(driver);
        objhome.clickCertificado ();
    }*/
    @Test (priority = 3)
    public void GotoIngresarCuenta()  {
        objLogin = new Login( driver);
        objLogin.IngresoCuentaPerso ();
    }
    @Test (priority = 4)
    public void LoginCuenta()  {
        objingresocuenta = new IngresoCuentapersonal( driver);
        objingresocuenta.enviarDatos ("wuillam77","Fer777444222.*");
    }

}
