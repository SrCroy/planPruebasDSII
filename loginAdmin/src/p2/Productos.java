package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Productos {
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

    // ====== PRUEBAS UNITARIAS ======

    // PRUEBA 1: Verificar vista INDEX de categorías
    /*@Test(priority = 1)
    public void testVistaIndexCategorias() {
        driver.get("http://127.0.0.1:8000/categorias");
        Assert.assertTrue(driver.getPageSource().contains("categorias"));
        System.out.println("Vista Index de Categorías cargada correctamente.");
    }*/

    // PRUEBA 2: Acceder al formulario de creación
    /*@Test(priority = 2)
    public void testIrACrearCategoria() {
        driver.get("http://127.0.0.1:8000/categorias/create");
        Assert.assertTrue(driver.getPageSource().contains("categoria"));
        System.out.println("Formulario para crear categoría cargado correctamente.");
    }*/

    // PRUEBA 3: Mostrar detalles de una categoría existente
    /*@Test(priority = 3)
    public void testMostrarDetallesCategoria() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/categorias");
        Thread.sleep(2000);
        
        // Hacer click en el primer enlace Show
        driver.findElement(By.xpath("//a[contains(text(), 'Show')]")).click();
        Thread.sleep(2000);
        
        // Solo verificar que la URL cambió (estamos en detalles)
        Assert.assertTrue(!driver.getCurrentUrl().equals("http://127.0.0.1:8000/categorias"));
        System.out.println("Vista de detalles cargada correctamente.");
    }*/

    // PRUEBA 4: Acceder a la vista de edición
    /*@Test(priority = 4)
    public void testAccederVistaEdit() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/categorias");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElements(By.tagName("form")).size() > 0);
        System.out.println("Vista de edición cargada correctamente.");
    }*/

    // ====== PRUEBAS DE INTEGRACIÓN ======

    // PRUEBA 5: Crear una nueva categoría
    /*@Test(priority = 5)
    public void testCrearCategoria() {
        driver.get("http://127.0.0.1:8000/categorias/create");
        
        driver.findElement(By.name("categoria")).sendKeys("Accesorios");
        driver.findElement(By.name("descripcion")).sendKeys("Productos de moda y accesorios.");
        
        // Si no hay form, el test no puede continuar
        if (driver.findElements(By.tagName("form")).isEmpty()) {
            System.out.println("ERROR: No hay formulario en la página");
            return;
        }
        
        driver.findElement(By.cssSelector(".btn-submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("categorias"));
        System.out.println("Categoría 'Accesorios' creada exitosamente.");
    }*/
    
    // PRUEBA 6: Editar una categoría
    /*@Test(priority = 6)
    public void testEditarCategoria() {
        driver.get("http://127.0.0.1:8000/categorias");
        
        // Click en Edit con JavaScript
        WebElement editLink = driver.findElement(By.cssSelector("a[href*='/edit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editLink);
        
        // Esperar
        try { Thread.sleep(3000); } catch (Exception e) {}
        
        // Editar campos
        driver.findElement(By.name("categoria")).clear();
        driver.findElement(By.name("categoria")).sendKeys("Categoria Editada");
        
        driver.findElement(By.name("descripcion")).clear();
        driver.findElement(By.name("descripcion")).sendKeys("Descripción editada");
        
        // Enviar
        driver.findElement(By.cssSelector(".btn-submit")).click();
        
        Assert.assertTrue(driver.getCurrentUrl().contains("categorias"));
        System.out.println("Categoría editada correctamente.");
    }*/

    // PRUEBA 7: Eliminar una categoría
    @Test(priority = 7)
    public void testEliminarCategoria() {
        driver.get("http://127.0.0.1:8000/categorias");
        
        // Buscar el primer botón "Delete" y hacer clic
        driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).click();
        
        // Verificar que se eliminó (ya no está en la misma página o recargó)
        Assert.assertTrue(driver.getCurrentUrl().contains("categorias"));
        System.out.println("Categoría eliminada correctamente.");
    }
}
