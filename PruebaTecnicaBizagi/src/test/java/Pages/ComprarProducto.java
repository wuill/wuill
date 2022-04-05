package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ComprarProducto {
    WebDriver driver;
    // se decarar los localizadores
    String expectecResult = null; // variables utilizadas para comprobar la ingreso de loging almacena el titulo de bienvenida
    String actalresult = null;

    By LinkVentas = By.xpath("//*[@id=\"sidebar\"]/div/div[3]/button");
    By CampoCedula = By.xpath("//*[@id=\"inputCedula\"]");
    By ClickProductoUno = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[2]/div[1]/div");
    By SeleProductoUno = By.xpath("/html/body/div[2]/div[2]/ul/li[1]");
    By Cantidad = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[2]/div[2]/input");
    By ClickProductoDos = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[3]/div[1]/div");
    By SeleProductoDOs = By.xpath("/html/body/div[2]/div[2]/ul/li[2]");
    By CantidadDos = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[3]/div[2]/input");
    By ClickProductoTres = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[4]/div[1]/div");
    By CampoProductoTres = By.xpath("/html/body/div[2]/div[2]/ul/li[3]");
    By CantidadTres = By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[4]/div[2]/input");
    By TestTotal = By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[4]/div[4]/div[2]/div[3]/div/input");
    By BTNGuardar = By.xpath("//*[@id=\"pr_id_5_content\"]/div/form/div/div/div[2]/div[4]/div[4]/div[1]/button");

    // Se crea el constructor de la clase
    public ComprarProducto (WebDriver driver) {
        this.driver = driver;
    }
    // metodo que hace clic en el botón VENTAS
    public void BTNVentas (){
        driver.findElement(LinkVentas).click();
    }
    // metodo para ingresar el número de documento en el campo C.C
    public void IngresoCedula (String documento){
        driver.findElement(CampoCedula).sendKeys(documento);
    }
    // metodo que para seleccionar el primer producto

    public void ClckProductoUno ()  throws InterruptedException{
        driver.findElement(ClickProductoUno).click();
    }
    // metodo que seleccion un producto de las lista desplegable
    public void IngresaProductoUno()  {
        driver.findElement(SeleProductoUno).click();
    }
    // metodo para ingresar la cantidad del producto uno
    public void CantidadUno (String cantidadUno){
        driver.findElement(Cantidad).sendKeys(cantidadUno);
    }



    // metodo que hace clic en el segundo producto de la lista desplegable
    public void ClickProductoDos () {
        driver.findElement(ClickProductoTres).click();
    }
    // metodo para seleccionar producto 2
    public void SeleccionaProductoDos (){
        driver.findElement(SeleProductoDOs).click();
    }
    // metodo para ingresar la cantidad del producto Dos
    public void CantidadDos (String cantidadDos){
        driver.findElement(CantidadDos).sendKeys(cantidadDos);
    }


    // metodo que hace clic en el tercer producto de la lista desplegable
    public void ClickProductoTres () {
        driver.findElement(ClickProductoDos).click();
    }
    // metodo para seleccionar producto Tres
    public void IngresaProductoTres (){
        driver.findElement(CampoProductoTres).click();
    }
    // metodo para ingresar la cantidad del producto Tres
    public void CantidadTres (String cantidadTres){
        driver.findElement(CantidadTres).sendKeys(cantidadTres);
    }

    public String  getTotal() {
        return  driver.findElement(TestTotal).getAttribute("value");
    }
    // Metodo que comprueba si el ingreso fue correcto para ello compara el titulo de bienvenida
    public  void ComprobarIgreso () {
        expectecResult = "94784591"; // se quita un número para validar al comprobación el escenario debe quedar fallido
        actalresult = getTotal();
        Assert.assertEquals(actalresult, expectecResult);
    }

    public  void BTNguardar () throws InterruptedException{
        driver.findElement(BTNGuardar).click();
    }

    // metodo que implementa los demás metodos para enviar los datos del formulario

    public void Enviarformu (String documento, String cantidadUno, String cantidadDos, String cantidadTres) throws InterruptedException {
        this.BTNVentas();
        this.IngresoCedula(documento);
        this.ClckProductoUno ();
        this.IngresaProductoUno();
        this.CantidadUno(cantidadUno);
        this.ClickProductoDos();
        this.SeleccionaProductoDos();
        this.CantidadDos(cantidadDos);
        this.ClickProductoTres();
        this.IngresaProductoTres();
        this.CantidadTres(cantidadTres);
        this.ComprobarIgreso();
        this.BTNguardar();

    }
}
