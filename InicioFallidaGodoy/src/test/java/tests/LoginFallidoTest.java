package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginFallidoTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private final String baseUrl = "https://bioseguridad.godoycordoba.com/";

    @BeforeAll
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        loginPage = new LoginPage(driver);
    }

    @Test
    @DisplayName("Inicio de sesión fallido - Usuario inexistente")
    void loginFallido() {
        driver.get(baseUrl);

        loginPage.ingresarUsuario("usuario_inexistente");
        loginPage.ingresarPassword("clave_invalida");
        loginPage.clickIngresar();

        Assertions.assertTrue(loginPage.mensajeErrorVisible(),
                "El mensaje de error no apareció o no es visible.");
    }

    @AfterAll
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
