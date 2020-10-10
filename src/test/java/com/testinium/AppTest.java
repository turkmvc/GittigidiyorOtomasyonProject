package com.testinium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
{
    @Test
    public void loginButton() throws InterruptedException {

        clickXpath("//div[@data-cy='header-user-menu']");
        Thread.sleep(2000);
        clickXpath("//a[@data-cy='header-login-button']");
        Thread.sleep(2000);
       sendByXpath("//div[@class=\"gg-d-24 gg-m-24 posr\"]/div[2]","akbuluttceren@gmail.com");
       Thread.sleep(2000);
       sendByXpath("//div[@class=\"normal-login gg-label gg-d-24 padding-none\"]","******");
       clickId("gg-login-enter");
       Product("buzdolabı");
    }
    @Test
    public void Basket(){
        clickXpath("//div[@id=\"basket-container robot-header-iconContainer-cart\"]//a[@class=\"dIB\"]");
        clickXpath("//div[@id=\"cart-continue-button-container\"]//a[@class=\"dIB\"]//input[@class=\"gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay\"]");

    }
    @Test
    public void addAdress(){
        sendByXpath("//div[@class=\"txt-box address-txt-box gg-input\"]//input[@name=\"AddressName\"]","1.adresim");
        sendByXpath("//div[@class=\"txt-box gg-input\"]//input[@name=\"Name\"]","Ayşe");
        sendByXpath("//div[@class=\"txt-box gg-input\"]//input[@name=\"SurName\"]","Kara");
        sendByXpath("//div[@class=\"gg-label\"]//input[@name=\"SurName\"]","Kara");
        Select slc = (Select)driver.findElement(By.id("CitySelect"));
        slc.selectByValue("34");
        Select slc1 = (Select)driver.findElement(By.id("District"));
        slc1.selectByValue("Avcılar");
        Select slc2 = (Select)driver.findElement(By.id("Neighborhood"));
        slc2.selectByValue("35656");
        sendByXpath("//div[@class=\"txt-box gg-input\"]//input[@name=\"PostCode\"]","35656");
        sendByXpath("//div[@class=\"txt-box gg-input telephone-input\"]//span//input[@class=\"telephone-number telephone-code\"]","5627593456");
        clickXpath("//div[@class=\"gg-w-9 gg-d-12 gg-t-12 gg-m-24 gg-form-item\"]//input[@class=\"gg-ui-btn-primary gg-btn post-address gg-ui-btn-fluid address-save-and-continue-btn\"]");
    }







}
