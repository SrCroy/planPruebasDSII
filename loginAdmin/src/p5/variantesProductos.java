package p5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class variantesProductos {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    // PRUEBA 1: Verificar vista Index
    @Test(priority = 1)
    public void testIndexVariantes() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Variantes Productos"));
        System.out.println("Index Variantes Productos - OK");
    }

    // PRUEBA 2: Verificar vista Create
    /*@Test(priority = 2)
    public void testCreateVariantes() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("create"));
        System.out.println("Create Variantes Productos - OK");
    }*/

    // PRUEBA 3: Verificar vista Show
    /*@Test(priority = 3)
    public void testShowVariantes() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Show')]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("variantes-productos"));
        System.out.println("Show Variantes Productos - OK");
    }*/

    // PRUEBA 4: Verificar vista Edit
    /*@Test(priority = 4)
    public void testEditVariantes() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("edit"));
        System.out.println("Edit Variantes Productos - OK");
    }*/
    
    // PRUEBA 5: Crear variante producto - SELECCIONANDO POR TEXTO
    /*@Test(priority = 5)
    public void testCrearVariante() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos/create");
        Thread.sleep(3000);
        
        // Seleccionar producto "Faja Colombiana Cintura Alta"
        Select productoSelect = new Select(driver.findElement(By.name("idProducto")));
        productoSelect.selectByVisibleText("Faja Colombiana Cintura Alta");
        Thread.sleep(1000);
        
        // Seleccionar talla "Large" 
        Select tallaSelect = new Select(driver.findElement(By.name("idTalla")));
        tallaSelect.selectByVisibleText("Large");
        Thread.sleep(1000);
        
        // Llenar campos
        driver.findElement(By.name("color")).sendKeys("Rojo Test");
        driver.findElement(By.name("stock")).sendKeys("100");
        driver.findElement(By.name("precio")).sendKeys("88.88");
        Thread.sleep(1000);
        
        // Enviar
        driver.findElement(By.cssSelector(".btn-submit")).click();
        Thread.sleep(3000);
        
        Assert.assertTrue(driver.getCurrentUrl().contains("variantes-productos"));
        System.out.println("Crear Variante Producto - OK");
    }*/

    // PRUEBA 6: Editar variante producto
    /*@Test(priority = 6)
    public void testEditarVariante() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("color")).clear();
        driver.findElement(By.name("color")).sendKeys("Azul");
        driver.findElement(By.name("stock")).clear();
        driver.findElement(By.name("stock")).sendKeys("75");
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("variantes-productos"));
        System.out.println("Editar Variante Producto - OK");
    }*/

    // PRUEBA 7: Eliminar variante producto
    /*@Test(priority = 7)
    public void testEliminarVariante() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/variantes-productos");
        Thread.sleep(2000);
        WebElement deleteBtn = driver.findElement(By.cssSelector(".btn-danger"));
        ((JavascriptExecutor) driver).executeScript("window.confirm = function(){return true;}");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteBtn);
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("variantes-productos"));
        System.out.println("Eliminar Variante Producto - OK");
    }*/
}