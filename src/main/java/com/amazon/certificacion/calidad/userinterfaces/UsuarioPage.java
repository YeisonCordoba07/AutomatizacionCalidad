package com.amazon.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
    public static final Target LINK_HOMEPAGE = Target.the("enlace celular").located(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a"));
    public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.id("twotabsearchtextbox"));
}
