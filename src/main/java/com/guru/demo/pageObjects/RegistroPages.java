package com.guru.demo.pageObjects;

import org.openqa.selenium.By;

public class RegistroPages {
    private By btnRegister = By.xpath("(//a[@href='register.php'])[1]");
    private By txtFirst = By.name("firstName");
    private By txtLast = By.name("lastName");
    private By txtPhone = By.name("phone");
    private By txtEmail = By.id("userName");
    private By txtAdress = By.name("address1");
    private By txtCity = By.name("city");
    private By txtState = By.name("state");
    private By txtPostal = By.xpath("//input[@name='postalCode']");
    private By txtCountry = By.xpath("//select[@name='country']");
    private By txtUsername = By.id("email");
    private By txtPassword = By.name("password");
    private By txtConfPass = By.name("confirmPassword");
    private By btnEnviar = By.name("submit");

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getTxtFirst() {
        return txtFirst;
    }

    public By getTxtLast() {
        return txtLast;
    }

    public By getTxtPhone() {
        return txtPhone;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtAdress() {
        return txtAdress;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtState() {
        return txtState;
    }

    public By getTxtPostal() {
        return txtPostal;
    }

    public By getTxtCountry() {
        return txtCountry;
    }

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getTxtConfPass() {
        return txtConfPass;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }
}
