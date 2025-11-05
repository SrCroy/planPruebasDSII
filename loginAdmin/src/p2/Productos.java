package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Productos {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        System.out.println("Login completado");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //PRUEBA 1: Verificar vista INDEX de categorías (COMENTADA)
    /*
    @Test(priority = 1)
    public void testVistaIndexCategorias() {
        driver.get("http://127.0.0.1:8000/categorias");
        Assert.assertTrue(driver.getPageSource().contains("Categorias"));
        System.out.println("Vista Index de Categorías cargada correctamente.");
    }
    */

    //PRUEBA 2: Acceder al formulario de creación (COMENTADA)
    /*
    @Test
    public void testIrACrearCategoria() {
        driver.get("http://127.0.0.1:8000/categorias/create");
        System.out.println("Formulario crear categoría cargado");
    }
    */

    //PRUEBA 3: Crear una nueva categoría (COMENTADA)
    /*
    @Test
    public void testCrearCategoria() {
        driver.get("http://127.0.0.1:8000/categorias/create");
        
        // Llenar formulario
        driver.findElement(By.name("categoria")).sendKeys("Accesorios");
        driver.findElement(By.name("descripcion")).sendKeys("Productos de moda y accesorios.");
        
        // Enviar formulario
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        System.out.println("Categoría 'Accesorios' creada exitosamente");
    }
    */

    //PRUEBA 4: Mostrar detalles de una categoría (COMENTADA)
    /*
    @Test
    public void testMostrarDetallesCategoria() {
        // Ir al index de categorías
        driver.get("http://127.0.0.1:8000/categorias");
        
        // Hacer clic en el primer botón "Show" que encuentre
        driver.findElement(By.linkText("Show")).click();
        
        System.out.println("Vista Show cargada");
    }
    */

    //PRUEBA 5: Acceder a la vista Edit (COMENTADA)
    /*
    @Test
    public void testAccederVistaEdit() {
        // Ir al index de categorías
        driver.get("http://127.0.0.1:8000/categorias");
        
        // Hacer clic en el primer botón "Edit" que encuentre
        driver.findElement(By.linkText("Edit")).click();
        
        System.out.println("Vista Edit cargada");
    }
    */

    //PRUEBA 6: Eliminar una categoría
    @Test
    public void testEliminarCategoria() {
        // Ir al index de categorías
        driver.get("http://127.0.0.1:8000/categorias");
        
        // Hacer clic en el primer botón "Delete" que encuentre
        driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).click();
        
        System.out.println("Categoría eliminada correctamente");
    }
}