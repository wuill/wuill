package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmarRerserva {
    WebDriver driver;

    By DetallesPrecio= By.xpath("//*[@id=\"app-layer-base\"]/main/div[3]/div[1]/div/div[2]/div/div[2]/h2");
    By BTNReserva = By.xpath("//*[@id=\"app-layer-base\"]/main/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/button");

    // se crea el constructor de la clase
    public ConfirmarRerserva (WebDriver driver) {
        this.driver = driver;
    }
    // metodo para cambiar el validar el tipo de carro a seleccionar
    public void ObtenerTestCompra(){
        driver.findElement(DetallesPrecio).getText();
    }
    // Metodo para confirmar reserva
    public void ConfirmarReserva(){
        driver.findElement(BTNReserva).click();
    }

    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm() throws InterruptedException {
        this.ObtenerTestCompra();
        this.ConfirmarReserva();
    }

}
