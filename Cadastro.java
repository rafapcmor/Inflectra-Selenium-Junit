/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginselenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author rafap
 */
public class Cadastro {

    static WebDriver driver;

    public Cadastro(WebDriver driver) {
        this.driver = driver;
    }

    public void preencheCampos(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement email = driver.findElement(By.id("txtEmailAddress"));
        email.sendKeys("rafaela.cruz.mor.2021");

        WebElement firstName = driver.findElement(By.id("txtFirstName"));
        firstName.sendKeys("Rafaela");

        WebElement middleName = driver.findElement(By.id("txtMiddleInitial"));
        middleName.sendKeys("Rafaela");

        WebElement lastName = driver.findElement(By.id("txtLastName"));
        lastName.sendKeys("Priscila Cruz Moreira");

        Select country = new Select(driver.findElement(By.id("cplMainContent_ddlCountry")));
        country.selectByValue("31");

        WebElement passwd = driver.findElement(By.id("txtPassword"));
        passwd.sendKeys("Rafa@@@123");

        WebElement confPasswd = driver.findElement(By.id("txtPasswordConfirm"));
        confPasswd.sendKeys("Rafa@@@123");

        Select question = new Select(driver.findElement(By.id("cplMainContent_ddlSecurityQuestion")));
        question.selectByValue("What was your childhood nickname?");

        WebElement answer = driver.findElement(By.id("txtSecurityAnswer"));
        answer.sendKeys("Azul");

        WebElement notify = driver.findElement(By.id("chkNotifyLocal"));
        notify.click();

        WebElement captcha = driver.findElement(By.id("txtCaptcha"));
        captcha.sendKeys("1234");

        WebElement submit = driver.findElement(By.id("btnRegister"));
        submit.click();

    }

    public String validarMsg() {
        return driver.findElement(By.xpath("//*[@id=\"frmRegister\"]/div[1]/div/small[2]")).getText();
    }
}
