package com.amazon.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
    public static final Target PRODUCT = Target.the("enlace celular").located(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a"));
    public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.id("twotabsearchtextbox"));
    public static final Target BUTTON_ADDTOCARD = Target.the("Boton agregar").located(By.xpath("//*[@id=\'add-to-cart-button\']"));
    public static final Target CARRITO = Target.the("Carrito").located(By.xpath("//*[@id=\'nav-cart-count\']"));



    public static final Target INPUT_NOMBRE = Target.the("Input nombre").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[1]/input"));
    public static final Target INPUT_DESCRIPCION = Target.the("Input descripcion").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[2]/input"));

    public static final Target INPUT_VALOR_CRITERIO = Target.the("Input valor criterio").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[1]/div[4]/input"));

    public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[2]/div[1]/button"));

    public static final Target TEXTO_EXITO = Target.the("Texto exito").located(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div/div[3]/h4"));

}
