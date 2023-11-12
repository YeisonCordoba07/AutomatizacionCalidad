package com.amazon.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
    public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.id("APjFqb"));
    public static final Target INPUT_TEXT1 = Target.the("INPUT_TEXT").located(By.id("//*[@id=\"twotabsearchtextbox\"]"));
}
