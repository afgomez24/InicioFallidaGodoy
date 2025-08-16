package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Localizadores
    private By usuarioInput = By.name("TxtUsuario");
    private By passwordInput = By.name("TxtClave");
    private By ingresarBtn = By.id("BtnIngresar");
    private By mensajeError = By.xpath("//*[contains(text(),'Datos incorrectos, porfavor intentelo nuevamente')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Acciones
    public void ingresarUsuario(String usuario) {
        driver.findElement(usuarioInput).clear();
        driver.findElement(usuarioInput).sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickIngresar() {
        driver.findElement(ingresarBtn).click();
    }

    public boolean mensajeErrorVisible() {
        WebElement error = driver.findElement(mensajeError);
        return error.isDisplayed();
    }
}

