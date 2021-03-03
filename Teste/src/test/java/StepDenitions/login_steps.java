package StepDenitions;

import TestPages.login_pages;
import cucumber.api.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class login_steps {
    WebDriver driver;
    @Dado("que eu acesso a página principal")
    public void que_eu_acesso_a_página_principal() {
        System.setProperty("webdriverr.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.siga.ufrpe.br/ufrpe/");
    }

    @Quando("eu faço login com {string} e {string}")
    public void eu_faço_login_com_e(String user, String senha) {
        driver = new ChromeDriver();
        login_pages login;
        login = new login_pages();
        login.testFazerLogin(driver, user, senha);
    }

    @Então("devo ser autenticado com sucesso")
    public void devo_ser_autenticado_com_sucesso() {
        driver = new ChromeDriver();
        driver.findElement(By.cssSelector("label.bemVindo"));
        String saudacao = driver.findElement(By.className("lblNomePessoa")).getText();
        assertEquals("\n" +
                "TALITA FERREIRA", saudacao);
    }

    @Então("devo ver a mensagem {string}")
    public void devo_ver_a_mensagem(String mensagem) {
        driver = new ChromeDriver();
        String saudacao = driver.findElement(By.className("bemVindo")).getText();
        assertEquals("Seja bem-vinda ao SIG@UFRPE. O seu login é talita.moraes@ufrpe.br.", saudacao);
        driver.quit();
    }

}
