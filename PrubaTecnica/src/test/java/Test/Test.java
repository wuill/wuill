package Test;

import Pages.ConfirmarRerserva;
import Pages.HomPage;
import Pages.PaginaReservaAuto;
import Pages.RealizaPago;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {

    WebDriver driver;
    // Se instancias las clases de las diferentes secciones del sitio
    HomPage homPage;
    PaginaReservaAuto pageReserva;
    ConfirmarRerserva ConReserva;
    RealizaPago pago;
    // no se puede culminar la codificación dado que la pagian no permite realizar consultas desde un robot
    String expectecResult = null;
    String actalresult = null;

    @BeforeTest
    // Metodo que inicializa el navegador y abre la URL
    public  void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.travelocity.com");
        }
    // metodo que cierra el navegador despues de cada testcase
    @AfterTest
   public  void tearDown (){
        driver.quit();
    }

    // caso que realiza la busqueda de autos
    @org.testng.annotations.Test(priority = 0)
    public void GotoLogin () throws InterruptedException {
        homPage = new HomPage(driver);
        homPage.EnviardatosForm("bogota");
        Thread.sleep(3000);

    }
    // caso q selecciona el auto de la pagina resultados de busqueda
    @org.testng.annotations.Test(priority = 1)
    public void SelecAuto () throws InterruptedException {
        pageReserva = new PaginaReservaAuto(driver);
        pageReserva.EnviardatosForm();

    }
    // Caso se confirmala reserva
    @org.testng.annotations.Test(priority = 2)
    public void ConfimaReserva () throws InterruptedException {
        ConReserva = new ConfirmarRerserva(driver);
        pageReserva.EnviardatosForm();

    }
    // caso que Realiza el pago con TC
    @org.testng.annotations.Test(priority = 3)
    public void RealizarPago () throws InterruptedException {
        pago = new RealizaPago(driver);
        pago.EnviardatosForm("fernando","2242426","fernando p","5454545454545454",
                "555","11011","pao@hotmail.com");

    }

}
