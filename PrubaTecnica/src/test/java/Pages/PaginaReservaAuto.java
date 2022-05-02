package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaReservaAuto {
    WebDriver driver;

    By Carroaseleccionar= By.xpath("//*[@id=\"offer-cards-list\"]/ol/li[1]/div/div/div[2]/div/div[1]/div[2]/section[1]/div[1]/div[1]/div");
    By BTNReserva = By.xpath("//*[@id=\"offer-cards-list\"]/ol/li[1]/div/div/div[2]/div/div[2]/a/button");

    // se crea el constructor de la clase
    public PaginaReservaAuto (WebDriver driver) {
        this.driver = driver;
    }
    // metodo para obtener el texto de servar auto con el fin de comprobar si es está en dicha pagina
    public void ObtenerTestCarro(){
        driver.findElement(Carroaseleccionar).getText();
    }
    // Metodo para seleccionar el carro escoguido
    public void SelecioanrCarroBYNRerservas(){
        driver.findElement(BTNReserva).click();
    }
    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm() throws InterruptedException {
        this.ObtenerTestCarro();
        this.SelecioanrCarroBYNRerservas();
    }
}
