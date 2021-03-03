package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_pages {

    public void testFazerLogin(WebDriver navegador, String user, String senha){
        navegador.findElement(By.id("cpf")).sendKeys(user);
        navegador.findElement(By.id("txtPassword")).sendKeys(senha);
        navegador.findElement(By.linkText("Entrar")).click();
    }
}
