package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealizaPago {
    WebDriver driver;

    By TestReservación= By.xpath("//*[@id=\"page-header\"]/h1");
    By CampoNombre = By.xpath("//*[@id=\"preferences\"]/section/article/fieldset/div[2]/div[2]/label/input");
    By CampoTelefono = By.xpath("//*[@id=\"preferences\"]/section/article/fieldset/div[2]/label[2]/input");
    By CampoNombreTarjeta = By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input");
    By CampoNoTarjeta = By.xpath("//*[@id=\"creditCardInput\"]");
    By CampoCodSeguridad = By.xpath("//*[@id=\"new_cc_security_code\"]");
    By CampoPostal = By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[4]/input");
    By CampoCorreo = By.xpath("//*[@id=\"email\"]/div[1]/fieldset/label/input");
    By BTNReserva = By.xpath("//*[@id=\"complete-booking\"]");

    // se crea el constructor de la clase
    public RealizaPago (WebDriver driver) {
        this.driver = driver;
    }
    // metodo para obtener el texto de pago reserva auto con el fin de comprobar si es está en dicha pagina
    public void ObtenerTestPago(){
        driver.findElement(TestReservación).getText();
    }
    // Metodo para seleccionar ingresar nombre
    public void Nombre(String nombre){
        driver.findElement(CampoNombre).sendKeys(nombre);
    }
    // Metodo para seleccionar ingresar Telefono
    public void Telefono(String telefono){
        driver.findElement(CampoTelefono).sendKeys(telefono);
    }
    // Metodo para seleccionar ingresar el nombre del propietario de la tarjeta
    public void NombreTarjeta(String NombreTarjeta){
        driver.findElement(CampoNombreTarjeta).sendKeys(NombreTarjeta);
    }
    // Metodo para seleccionar ingresar No tarjeta
    public void Tarjeta(String Tarjeta){
        driver.findElement(CampoNoTarjeta).sendKeys(Tarjeta);
    }
    // Metodo para seleccionar ingresar cod seguridad
    public void CodSeguridad(String codseguridad){
        driver.findElement(CampoCodSeguridad).sendKeys(codseguridad);
    }

    // Metodo para seleccionar ingresar cod postal
    public void Codpostal(String codpostal){
        driver.findElement(CampoPostal).sendKeys(codpostal);
    }
    // Metodo para seleccionar ingresar email
    public void Email(String email){
        driver.findElement(CampoCorreo).sendKeys(email);
    };
    // Metodo para hacer clic BTN confirmar pago
    public void BTNPago(){
        driver.findElement(BTNReserva).click();
    }
    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm(String nombre, String telefono, String nombretarjeta, String tarjeta, String codseguridad,
                                String codpostal, String email) throws InterruptedException {
        this.ObtenerTestPago();
        this.Nombre(nombre);
        this.Telefono(telefono);
        this.NombreTarjeta(nombretarjeta);
        this.Tarjeta(tarjeta);
        this.CodSeguridad(codseguridad);
        this.Codpostal(codpostal);
        this.Email(email);
        this.BTNPago();
    }
}
