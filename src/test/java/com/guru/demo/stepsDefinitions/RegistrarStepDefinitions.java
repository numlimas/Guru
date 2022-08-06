package com.guru.demo.stepsDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import com.guru.demo.driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import com.guru.demo.steps.RegistrarSteps;

public class RegistrarStepDefinitions {

    @Steps
    RegistrarSteps registrarSteps = new RegistrarSteps();
    @Dado("^estoy en la pagina Guru$")
    public void estoyEnLaPaginaGuru() {
        SeleniumWebDriver.firefoxDriver("https://demo.guru99.com/test/newtours/");
    }

    @Cuando("^doy click en registrar$")
    public void doyClickEnRegistrar() {
        registrarSteps.escribirForm();
    }

    @Y("^escribo y envio mis datos$")
    public void escriboYEnvioMisDatos() {

    }

    @Entonces("^obtengo un registro exitoso$")
    public void obtengoUnRegistroExitoso() {

    }
}
