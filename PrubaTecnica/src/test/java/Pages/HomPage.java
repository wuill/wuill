package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomPage {
    WebDriver driver;

    By LinkEspañol = By.xpath("//*[@id=\"secondaryNav\"]/div[1]/button/div");
    By Linkautos= By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[1]/div[2]/div/figure/div[3]/div/div/ul/li[3]/a/span");
    By CampoEntrega = By.xpath("//*[@id=\"location-field-locn-menu\"]/div[1]/div[1]/button");
    By BusquedaCiudad = By.xpath("//*[@id=\"location-field-locn\"]");
    // mapea el resultado de la busqueda en el campo ENTREGA
    By ResulEntrega = By.xpath("//*[@id=\"location-field-locn-menu\"]/div[2]/div[2]/ul/li[2]/button/div/div[2]");
    By CampoDevolución = By.xpath("//*[@id=\"location-field-loc2-menu\"]/div[1]/div[1]/button");
    By ResulDevolución = By.xpath("//*[@id=\"location-field-loc2-menu\"]/div[2]/div[2]/ul/li[2]/button/div/div[2]");
    By FechaEntrega = By.xpath("//*[@id=\"d1-btn\"]");
// se escoje la fecha del 14 de Mayo
    By Seleccionarfecha = By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[3]/button");

    // se crea el constructor de la clas
    public HomPage (WebDriver driver) {
        this.driver = driver;
    }

    // link para hacer clic en el link vehiculos
    public void LinkAutos() throws InterruptedException {
        driver.findElement(Linkautos).click();
    }
// metodo que hace click en el campo ENTREGA
    public void ClickEntrega() throws InterruptedException {
        driver.findElement(CampoEntrega).click();
    }
    // metodo que ingresa el criterio de busqueda en el campo ENTREGA
    public void IngresaBusqueda(String nomciudad) throws InterruptedException {
        driver.findElement(BusquedaCiudad).sendKeys(nomciudad);
        Thread.sleep(8000);
    }
    // Selecionar ciudad de ENTREGA de la lista desplegable resultado de la busqueda

    public void SelectCiudad() throws InterruptedException {
        driver.findElement(ResulEntrega).click();
}
    // metodo que implementa los demás metodos para enviar los datos del formulario
    public void EnviardatosForm(String nomciudad) throws InterruptedException {
       // this.CambioIdioma();
        this.LinkAutos();
        this.ClickEntrega();
        this.IngresaBusqueda(nomciudad);
        this.SelectCiudad();
    }
}

