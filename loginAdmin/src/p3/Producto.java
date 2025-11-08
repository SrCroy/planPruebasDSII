package p3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Producto {
    WebDriver driver;

    // ===== CONFIGURACIÓN INICIAL =====
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Iniciar sesión
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        System.out.println("Inicio de sesión completado correctamente.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Navegador cerrado correctamente.");
    }

    // ====== PRUEBAS PARA MÓDULO PRODUCTOS ======

    // PRUEBA 1: Verificar vista INDEX de productos
    /*@Test(priority = 1)
    public void testVistaIndexProductos() {
        driver.get("http://127.0.0.1:8000/productos");
        Assert.assertTrue(driver.getPageSource().contains("Productos"));
        System.out.println("Vista Index de Productos cargada correctamente.");
    }*/

    // PRUEBA 2: Acceder al formulario de creación
    /*@Test(priority = 2)
    public void testIrACrearProducto() {
        driver.get("http://127.0.0.1:8000/productos/create");
        Assert.assertTrue(driver.getPageSource().contains("Create Producto"));
        System.out.println("Formulario para crear producto cargado correctamente.");
    }*/

    // PRUEBA 3: Mostrar detalles de un producto existente
    /*@Test(priority = 3)
    public void testMostrarDetallesProducto() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/productos");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//table//a[contains(text(), 'Show')]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(!driver.getCurrentUrl().equals("http://127.0.0.1:8000/productos"));
        System.out.println("Vista de detalles de producto cargada correctamente.");
    }*/

    // PRUEBA 4: Acceder a la vista de edición
    /*@Test(priority = 4)
    public void testAccederVistaEditProducto() {
        driver.get("http://127.0.0.1:8000/productos");
        
        // Click en Edit con JavaScript
        WebElement editLink = driver.findElement(By.cssSelector("a[href*='/edit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editLink);
        
        try { Thread.sleep(2000); } catch (Exception e) {}
        
        Assert.assertTrue(driver.getCurrentUrl().contains("edit"));
        System.out.println("Vista de edición de producto cargada correctamente.");
    }*/

    // PRUEBA 5: Crear un nuevo producto
    /*@Test(priority = 5)
    public void testCrearProducto() {
        driver.get("http://127.0.0.1:8000/productos/create");
        
        // Llenar formulario
        driver.findElement(By.name("nombreProducto")).sendKeys("Camisa");
        driver.findElement(By.name("marcaProducto")).sendKeys("Nikey");
        driver.findElement(By.name("material")).sendKeys("Algodón");
        driver.findElement(By.name("descripcion")).sendKeys("Producto de prueba");
        driver.findElement(By.name("precio")).sendKeys("50");
        driver.findElement(By.name("estado")).sendKeys("Activo");
        
        // Enviar formulario con JavaScript
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
        
        Assert.assertTrue(driver.getCurrentUrl().contains("productos"));
        System.out.println("Producto 'Nikey' creado exitosamente.");
    }*/

    // PRUEBA 6: Editar un producto existente
    /*@Test(priority = 6)
    public void testEditarProducto() {
        driver.get("http://127.0.0.1:8000/productos");
        
        // Buscar por el texto "Edit"
        WebElement editLink = driver.findElement(By.xpath("//a[contains(text(), 'Edit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editLink);
        
        // Editar campos
        driver.findElement(By.name("nombreProducto")).clear();
        driver.findElement(By.name("nombreProducto")).sendKeys("Camisa Editada");
        
        driver.findElement(By.name("precio")).clear();
        driver.findElement(By.name("precio")).sendKeys("75");
        
        // Enviar formulario con JavaScript
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
        
        Assert.assertTrue(driver.getCurrentUrl().contains("productos"));
        System.out.println("Producto editado correctamente.");
    }*/

    // PRUEBA 7: Eliminar un producto
    /*@Test(priority = 7)
    public void testEliminarProducto() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/productos");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.confirm = function(){return true;}");
        WebElement deleteBtn = driver.findElement(By.cssSelector("button .fa-trash"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].closest('button').click();", deleteBtn);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("productos"));
        System.out.println("Producto eliminado correctamente.");
    }*/
}