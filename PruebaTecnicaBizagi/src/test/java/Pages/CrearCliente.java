package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrearCliente {
    WebDriver driver;
    // se decarar los localizadores

    By LinkClientes = By.xpath("//*[@id=\"sidebar\"]/div/div[2]/div/button");
    By NuevoCliente = By.xpath("//*[@id=\"pr_id_4_content\"]/div/div[1]/ul/li[1]/a/span[2]");
    By CCcliente = By.xpath("//*[@id=\"id\"]");
    By Nombre = By.id("username");
    By Direccion = By.id("address");
    By Telefono = By.id("phone");
    By Email = By.id("email");
    By BTNguardar = By.xpath("//*[@id=\"pr_id_3\"]/div[3]/div/button[2]/span[2]");

    public CrearCliente (WebDriver driver) {
        this.driver = driver;
    }
    // metodo que hace clic en el botón CLIENTES
    public void ClickBTNClientes (){
        driver.findElement(LinkClientes).click();
    }
    // metodo que hace clic en el botón +  CLIENTES
    public void AgregarCliente (){
        driver.findElement(NuevoCliente).click();
    }
    // metodo que llena el campo C.C
    public void Cedulacliente (String strusuario){
        driver.findElement(CCcliente).sendKeys(strusuario);
    }
    // metodo que llena el campo Nombre
    public void Nombrecliente (String strusuario){
        driver.findElement(Nombre).sendKeys(strusuario);
    }
    // metodo que llena el campo Direccion
    public void Direccioncliente (String strusuario){
        driver.findElement(Direccion).sendKeys(strusuario);
    }
    // metodo que llena el campo Telefono
    public void Telefonocliente (String strusuario){
        driver.findElement(Telefono).sendKeys(strusuario);
    }
    // metodo que llena el campo Email
    public void Emailcliente (String strusuario){
        driver.findElement(Email).sendKeys(strusuario);
    }
    // metodo que hace clic en el botón guardar
    public void ClickGuardar (){
        driver.findElement(BTNguardar).click();
    }

// metodo que implementa los demás metodos para enviar los datos del formulario
    public void Enviarformu (String cedula, String nombre, String direccion, String telefono, String email){
        this.ClickBTNClientes();
        this.AgregarCliente();
        this.Cedulacliente(cedula);
        this.Nombrecliente(nombre);
        this.Direccioncliente(direccion);
        this.Telefonocliente(telefono);
        this.Emailcliente(email);
        this.ClickGuardar();

    }
}
