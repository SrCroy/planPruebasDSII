package p4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tallas {
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
    /*@Test(priority = 1)
    public void testIndexTallas() {
        driver.get("http://127.0.0.1:8000/tallas");
        Assert.assertTrue(driver.getPageSource().contains("Tallas"));
        System.out.println("Index Tallas - OK");
    }*/
    
    // PRUEBA 2: Verificar vista Create
    /*@Test(priority = 2)
    public void testCreateTallas() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/tallas/create");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElements(By.tagName("form")).size() > 0);
        System.out.println("Create Tallas - OK");
    }*/

    // PRUEBA 3: Verificar vista Show
    /*@Test(priority = 3)
    public void testShowTallas() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/tallas");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".custom-table a")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("tallas"));
        System.out.println("Show Tallas - OK");
    }*/

    // PRUEBA 4: Verificar vista Edit
    /*@Test(priority = 4)
    public void testEditTallas() throws InterruptedException {
        driver.get("http://127.0.0.1:8000/tallas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
        Thread.sleep(2000);
        System.out.println("Edit Tallas - OK");
    }*/

    // PRUEBA 5: Crear talla
    /*@Test(priority = 5)
    public void testCrearTalla() {
        driver.get("http://127.0.0.1:8000/tallas/create");
        driver.findElement(By.name("talla")).sendKeys("XL");
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
        Assert.assertTrue(driver.getCurrentUrl().contains("tallas"));
        System.out.println("Crear Talla - OK");
    }*/

    // PRUEBA 6: Editar talla
    /*@Test(priority = 6)
    public void testEditarTalla() {
        driver.get("http://127.0.0.1:8000/tallas");
        WebElement editLink = driver.findElement(By.xpath("//a[contains(text(), 'Edit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editLink);
        driver.findElement(By.name("talla")).clear();
        driver.findElement(By.name("talla")).sendKeys("Large");
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
        Assert.assertTrue(driver.getCurrentUrl().contains("tallas"));
        System.out.println("Editar Talla - OK");
    }*/

    // PRUEBA 7: Eliminar talla
    /*@Test(priority = 7)
    public void testEliminarTalla() {
        driver.get("http://127.0.0.1:8000/tallas");
        WebElement deleteBtn = driver.findElement(By.xpath("//button[contains(text(), 'Delete')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteBtn);
        Assert.assertTrue(driver.getCurrentUrl().contains("tallas"));
        System.out.println("Eliminar Talla - OK");
    }*/
}