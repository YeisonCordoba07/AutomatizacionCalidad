package com.amazon.certificacion.calidad.stepdefinitions;

import com.amazon.certificacion.calidad.questions.Validacion;
import com.amazon.certificacion.calidad.tasks.OpenThe;
import com.amazon.certificacion.calidad.userinterfaces.UsuarioPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class FHStepDefinitionsTest {

    @Managed(driver="chrome")
    public WebDriver driver;
    private Actor usuario = Actor.named("cosme");

    @Before
    public void preStep(){
        driver.manage().window().maximize();
        //usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de amazon")
    public void paginaPrincipal(){
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("busque un producto y lo seleccione y lo agregue al carrito")
    public void nombreProducto(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver como el numero de productos en el carrito cambia")
    public void listaResultados(){
        usuario.should(seeThat(Validacion.theHomePage(), equalTo(true)));
    }

}
