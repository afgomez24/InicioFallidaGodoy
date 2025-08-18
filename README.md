# Automatización de Pruebas - Inicio Fallido Godoy

Este proyecto contiene pruebas automatizadas realizadas con **Selenium WebDriver**, **Java**, **JUnit 5** y el patrón **Page Object Model (POM)**.  
El objetivo principal es validar el **inicio de sesión fallido** en la aplicación de **Bioseguridad Godoy Córdoba**, y posteriormente realizar el registro de un nuevo usuario con el sector **"Caficultor"**.

---

## Flujo de Prueba Automatizada

1. Ingresar a la URL: [https://bioseguridad.godoycordoba.com](https://bioseguridad.godoycordoba.com)  
2. Intentar ingresar con un usuario **inexistente**.  
3. Verificar que el **inicio de sesión falle** correctamente.  
4. Proceder a realizar el **registro automático** de un nuevo usuario en el sistema.  
   - Seleccionar el sector **"Caficultor"**.  
   - Validar que el registro sea exitoso.  

---

## ⚙Tecnologías Utilizadas

- **Java 17+**
- **Selenium**
- **JUnit 5**
- **Maven** (para gestión de dependencias y ejecución de pruebas)
- **Page Object Model (POM)** (para mejor mantenibilidad del código)

---

## Estructura del Proyecto
InicioFallidaGodoy/
│── src/
│ ├── main/java/... # Clases base y Page Objects
│ ├── test/java/... # Casos de prueba con JUnit 5
│
│── Imagenes/ # Evidencias de ejecución (capturas de pantalla)
│── pom.xml # Dependencias del proyecto
│── README.md # Documentación

## ▶Configuración y Ejecución

**Clonar este repositorio:**
   
   git clone https://github.com/tu-usuario/InicioFallidaGodoy.git
   cd InicioFallidaGodoy

**Compilar el proyecto:**
mvn clean install

**Ejecutar las pruebas:**
mvn test

