/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginselenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author rafap
 */
public class Login {

  

    public void preencheCampos(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement userName = driver.findElement(By.id("cplMainContent_LoginUser_UserName"));
        userName.sendKeys("rafapcmor@gmail.com");

        WebElement senha = driver.findElement(By.name("cplMainContent_LoginUser_Password"));
        senha.sendKeys("QATest123");

        WebElement keeplogin = driver.findElement(By.xpath("//*[@id=\"cplMainContent_LoginUser\"]/tbody/tr/td/label[3]/span[2]"));
        keeplogin.click();

        WebElement submit = driver.findElement(By.id("cplMainContent_LoginUser_btnLogIn"));
        submit.click();

    }

    public String validarMsg(WebDriver driver) {
        return driver.findElement(By.id("cplMainContent_LoginUser_FailureText")).getText();
    }
}
