package com.amazon.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Input nombre").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[1]/input"));
    public static final Target INPUT_DESCRIPCION = Target.the("Input descripcion").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[2]/input"));

    public static final Target INPUT_VALOR_CRITERIO = Target.the("Input valor criterio").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[4]/input"));

    public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[2]/div[1]/button"));

    public static final Target TEXTO_EXITO = Target.the("Texto exito").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[3]/h4"));

}
