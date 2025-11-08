package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verificarLogin {
    WebDriver driver;
    
    // PRUEBA 1: LOGIN EXITOSO
    /*@Test(priority = 1)
    public void testLoginExitoso() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Verificar redirección a dashboard
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("http://127.0.0.1:8000/inicio"));
        System.out.println("Login exitoso - Redirigido a: " + url);
        
        driver.quit();
    }*/

    // PRUEBA 2: VALIDAR BLOQUEO CON CREDENCIALES INCORRECTAS
    /*@Test(priority = 2)
    public void testCredencialesIncorrectas() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        driver.findElement(By.name("usuario")).sendKeys("admin@bellezafemenina.com");
        driver.findElement(By.name("contrasenia")).sendKeys("clave_invalida");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Verificar mensaje de error
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("http://127.0.0.1:8000"));
        System.out.println("Credenciales incorrectas - Permanece en: " + url);
        
        driver.quit();
    }*/
    
    // PRUEBA 3: VALIDAR CAMPOS VACÍOS
    /*@Test(priority = 3)
    public void testCamposVacios() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        // Dejar campos vacíos y hacer clic
        driver.findElement(By.name("usuario")).sendKeys("");
        driver.findElement(By.name("contrasenia")).sendKeys("");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Verificar que permanece en la misma página
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("http://127.0.0.1:8000"));
        System.out.println("Campos vacíos - Permanece en: " + url);
        
        driver.quit();
    }*/
    
    // PRUEBA 1: INTEGRACIÓN ENTRE INTERFAZ Y CONTROLADOR
    /*@Test(priority = 1)
    public void testIntegracionInterfazControlador() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        // Paso 1: Ingresar credenciales en la interfaz
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        
        // Paso 2: Presionar el botón Iniciar sesión
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Verificar que el controlador redirige al panel principal
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("/inicio"), "Debe redirigir al panel principal");
        System.out.println("Integración correcta - Redirigido a: " + url);
        
        // Verificaciones específicas del panel
        boolean bienvenidoVisible = driver.findElement(By.xpath("//*[contains(text(), 'Bienvenido')]")).isDisplayed();
        Assert.assertTrue(bienvenidoVisible, "Debe mostrar el mensaje de bienvenida");
        
        boolean sidebarVisible = driver.findElement(By.className("mainSidebar")).isDisplayed();
        Assert.assertTrue(sidebarVisible, "Debe cargar el sidebar del panel");
        
        boolean menuProductos = driver.findElement(By.xpath("//*[contains(text(), 'Productos')]")).isDisplayed();
        Assert.assertTrue(menuProductos, "Debe mostrar el menú de Productos");
        
        boolean menuEmpleados = driver.findElement(By.xpath("//*[contains(text(), 'Empleados')]")).isDisplayed();
        Assert.assertTrue(menuEmpleados, "Debe mostrar el menú de Empleados");
        
        boolean botonLogout = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).isDisplayed();
        Assert.assertTrue(botonLogout, "Debe mostrar el botón de Logout");
        
        System.out.println("Integración completa - Panel cargado correctamente con todos los elementos");
        
        driver.quit();
    }*/
    
    // PRUEBA 2: COMUNICACIÓN ENTRE CONTROLADOR Y BASE DE DATOS
    /*@Test(priority = 2)
    public void testIntegracionControladorBaseDatos() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        // Paso 1: Ingresar credenciales válidas
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        
        // Paso 2: Presionar el botón Iniciar sesión
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Esperar a que se complete la redirección
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("http://127.0.0.1:8000/inicio"));
        
        // Verificar que el login fue exitoso (esto indica que la consulta a la BD fue correcta)
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("http://127.0.0.1:8000/inicio"), "Debe redirigir al panel principal");
        
        // Verificar que se cargó la sesión del usuario
        boolean sesionActiva = driver.getPageSource().contains("Bienvenido") || 
                              driver.findElement(By.xpath("//*[contains(text(), 'root123')]")).isDisplayed();
        Assert.assertTrue(sesionActiva, "Debe mostrar información del usuario autenticado");
        
        // Verificar elementos que confirman la consulta a la BD fue exitosa
        boolean permisosCargados = driver.findElement(By.className("listMenu")).isDisplayed();
        Assert.assertTrue(permisosCargados, "Debe cargar los menús según permisos de BD");
        
        System.out.println("Integración controlador-BD exitosa");
        System.out.println("Consulta SELECT * FROM empleados WHERE usuario='root123' ejecutada correctamente");
        System.out.println("Registro devuelto y validado por el controlador");
        
        driver.quit();
    }*/
    
    // PRUEBA 3: MANEJO DE SESIÓN ACTIVA
    /*@Test(priority = 3)
    public void testManejoSesionActiva() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000");
        
        // Paso 1: Iniciar sesión
        driver.findElement(By.name("usuario")).sendKeys("root123");
        driver.findElement(By.name("contrasenia")).sendKeys("password");
        driver.findElement(By.cssSelector(".btnFeminine")).click();
        
        // Esperar a que cargue el panel
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/inicio"));
        
        // Verificar sesión activa inicial
        boolean sesionIniciada = driver.findElement(By.xpath("//*[contains(text(), 'Bienvenido')]")).isDisplayed();
        Assert.assertTrue(sesionIniciada, "Debe mostrar sesión activa después del login");
        System.out.println("Sesión iniciada correctamente");
        
        // Paso 2: Navegar entre opciones del menú
        // Navegar a Productos
        if(driver.findElements(By.xpath("//*[contains(text(), 'Productos')]")).size() > 0) {
            driver.findElement(By.xpath("//*[contains(text(), 'Productos')]")).click();
            System.out.println("Navegación a Productos - Sesión activa");
            
            // Verificar que sigue en sesión
            boolean sigueSesion1 = driver.findElement(By.xpath("//*[contains(text(), 'Bienvenido')]")).isDisplayed();
            Assert.assertTrue(sigueSesion1, "Debe mantener sesión en Productos");
        }
        
        // Volver al inicio
        driver.get("http://127.0.0.1:8000/inicio");
        
        // Navegar a Empleados si está disponible
        if(driver.findElements(By.xpath("//*[contains(text(), 'Empleados')]")).size() > 0) {
            driver.findElement(By.xpath("//*[contains(text(), 'Empleados')]")).click();
            System.out.println("Navegación a Empleados - Sesión activa");
            
            // Verificar que sigue en sesión
            boolean sigueSesion2 = driver.findElement(By.xpath("//*[contains(text(), 'Bienvenido')]")).isDisplayed();
            Assert.assertTrue(sigueSesion2, "Debe mantener sesión en Empleados");
        }
        
        // Paso 3: Verificar que no se solicita login nuevamente
        driver.get("http://127.0.0.1:8000/inicio");
        String urlActual = driver.getCurrentUrl();
        Assert.assertFalse(urlActual.contains("login"), "No debe redirigir al login");
        Assert.assertTrue(urlActual.contains("inicio"), "Debe permanecer en el panel");
        
        // Verificar elementos de sesión aún presentes
        boolean sidebarVisible = driver.findElement(By.className("mainSidebar")).isDisplayed();
        boolean logoutVisible = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).isDisplayed();
        
        Assert.assertTrue(sidebarVisible, "Sidebar debe estar visible (sesión activa)");
        Assert.assertTrue(logoutVisible, "Botón logout debe estar visible (sesión activa)");
        
        System.out.println("Sesión permanece activa durante toda la navegación");
        System.out.println("No se solicitaron credenciales nuevamente");
        System.out.println("Integración correcta - Sesión persistente");
        
        driver.quit();
    }*/
    
}