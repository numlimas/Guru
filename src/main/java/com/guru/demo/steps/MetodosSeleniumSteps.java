package com.guru.demo.steps;

import com.guru.demo.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MetodosSeleniumSteps {
    public void clickear(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).click();
    }

    public void escribir(By localizador, String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto);
    }

    public void limpiar(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }

    public void seleccionar(By localizador, String texto){
        Select select = new Select(SeleniumWebDriver.driver.findElement(localizador));
        select.selectByValue(texto);
    }
}
