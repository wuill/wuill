package Test;

import Pages.ComprarProducto;
import Pages.CrearCliente;
import Pages.PageLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver;
    // Se instancias las clases de las diferentes secciones del sitio
    PageLogin objLogin;
    CrearCliente objcrearCliente;
    ComprarProducto Objcompra;

    String expectecResult = null;
    String actalresult = null;

    @BeforeTest
    // Metodo que inicializa el navegador y abre la URL
    public  void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://petter.eastus2.cloudapp.azure.com/");
    }
    // metodo que cierra el navegador despues de cada testcase
    @AfterTest
    public  void tearDown (){
        driver.quit();
    }

   @Test(priority = 0)
    public void GotoLogin () throws InterruptedException {
        objLogin = new PageLogin(driver);
        objLogin.EnviardatosForm("adminbog","123");

    }
    @Test(priority = 1)
    public void CrearCliente () throws InterruptedException {
        objcrearCliente = new CrearCliente(driver);
        objcrearCliente.Enviarformu("80747547","fernando", "call 100",
                "80747233", "wui7@gmail.com");
    }
   @Test(priority = 2)
    public void Comprar () throws InterruptedException {
       Objcompra = new ComprarProducto( driver);
       Objcompra.Enviarformu("80747222","1", "1",
                "1");
    }

}
