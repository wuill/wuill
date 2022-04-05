package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageLogin {
    WebDriver driver;

    By CampoUsuario = By.id("username");
    By CampoContraseña = By.id("password");
    By TestoInicioOk = By.xpath("/html/body/div/div/div/div/div[2]/div/h2");
    By BTNValidar = By.xpath("//*[@id=\"submitButton\"]");

    String expectecResult = null; // variables utilizadas para comprobar la ingreso de loging almacena el titulo de bienvenida
    String actalresult = null;

    // se crea el constructor de la clas
    public PageLogin (WebDriver driver) {
        this.driver = driver;
    }

    // metodo que llena el campo usuario
    public void LlenarUsuario(String strusuario){
        driver.findElement(CampoUsuario).sendKeys(strusuario);
    }
    // metodo que llena el campo contraseña
    public void diligenciarContraseña (String strContrsena){
        driver.findElement(CampoContraseña).sendKeys(strContrsena);
    }
    // metodo que hace click sobre el botón Validar
    public void ClickBtnLogin () throws InterruptedException {
        driver.findElement(BTNValidar).click();
        WebDriverWait espera = new WebDriverWait(driver, 1);
        espera.until(ExpectedConditions.visibilityOfElementLocated(TestoInicioOk));

    }
    // obtiene el textos de bienvenida de la pagina
    public String  getTituloInicio() {
        return  driver.findElement(TestoInicioOk).getText();
    }
    // Metodo que comprueba si el ingreso fue correcto para ello compara el titulo de bienvenida
    public  void ComprobarIgreso () {
        expectecResult = "Bienvenido a Petter Mascotas";
        actalresult = getTituloInicio();
        Assert.assertEquals(actalresult, expectecResult);

    }
    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm(String Usurio, String Password) throws InterruptedException {
        this.LlenarUsuario(Usurio);
        this.diligenciarContraseña(Password);
        this.ClickBtnLogin();
        this.getTituloInicio();
        this.ComprobarIgreso();

    }



}
