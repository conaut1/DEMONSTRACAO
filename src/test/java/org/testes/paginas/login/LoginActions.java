package org.testes.paginas.login;

import org.testes.paginas.MasterPageFactory;

public class LoginActions {
    public static LoginPage loginPage(){
        return MasterPageFactory.getPage(LoginPage.class);
    }
    public static void clickBtnEntrarNaConta() throws InterruptedException {
        loginPage().getBtnEntrarNaConta().click();
        Thread.sleep(10000);
    }
}
