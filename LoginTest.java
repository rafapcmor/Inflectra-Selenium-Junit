/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.loginselenium.Login;
import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author rafap
 */
public class LoginTest {

    static WebDriver driver;
    static Login login;

    public LoginTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        File file = new File("C:\\Users\\rafap\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("https://www.inflectra.com/CustomerArea/Login.aspx?ReturnUrl=%2fCustomerArea");

        login = new Login();

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @org.junit.jupiter.api.Test
    public void teste() {
        login.preencheCampos(driver);
        assertEquals("Your login attempt was not successful. Please try again", login.validarMsg(driver));
    }
}
