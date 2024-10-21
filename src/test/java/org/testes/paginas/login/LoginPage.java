package org.testes.paginas.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.testes.paginas.PageBase;


@Getter
public class LoginPage extends PageBase {

    @AndroidFindBy(xpath = "//*[@text='Entrar na conta']")
    private WebElement btnEntrarNaConta;
}
