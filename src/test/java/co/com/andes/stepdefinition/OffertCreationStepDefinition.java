/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.stepdefinition;

import co.com.andes.models.EditOfferModel;
import co.com.andes.models.OffertModel;
import co.com.andes.question.Offer_list;
import co.com.andes.question.Public_edit_Offer;
import co.com.andes.task.CreateOfferTask;
import co.com.andes.task.EditOfferTask;
import co.com.andes.task.EnsureBrowserIsOpen;
import co.com.andes.task.OpenBrowser;
import co.com.andes.utils.Wait;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author litio
 */
public class OffertCreationStepDefinition {

    Actor actor = Actor.named("Ismael Carvajal");

    WebDriver hisBrowser;    
    
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled("Ismael Carvajal");
        actor.can(BrowseTheWeb.with(hisBrowser));
    }
    
    @Dado("que el {actor} ingresa a la aplicacion")
    public void queElAnalistaEstaEnLaPaginaWebDeAndesIA(Actor actor) {
        actor.attemptsTo(
                OpenBrowser.toLoginPage(),
                Wait.oneTime(8000)
        );
    }

    @Cuando("el {actor} ingresa una {string} sin estandarizar en el offer input y llena los campos de {string},{string},{string},{string},{string},{string},{string},{string}")
    public void ingresaUnaOfertaSinEstandarizarEnElOfferInputyllenaloscamposdeproteinsuppliertemperature(Actor actor, String offer, String protein, String supplier, String temperature, String inconterm, String qty, String location, String date, String comment) {
        actor.attemptsTo(CreateOfferTask.createOffer(new OffertModel(offer, protein, supplier, temperature, inconterm, qty, location, date, comment)));
    }

    @Entonces("el {actor} recibe su mensaje de confirmacion {string}")
    public void recibeSuMensajeDeConfirmacion(Actor actor, String mensaje) {
        actor.attemptsTo(Wait.oneTime(25000));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Offer_list.message(), org.hamcrest.CoreMatchers.is(mensaje)));
    }

    @Cuando("el {actor} quiere editar una oferta")
    public void queElActorQuiereEditarUnaOferta(Actor actor) {
        actor.attemptsTo(
                EnsureBrowserIsOpen.theBrowserIsOpen(),
                Wait.oneTime(8000)
        );
    }

    @Cuando("el {actor} modifica los campos de {string},{string},{string},{string},{string},{string},{string},{string} en la edicion de la estandarizacion")
    public void modificaLosCamposDeLaEdicionDeLaEstandarizacion(Actor actor, String protein, String supplier, String temperature, String inconterm, String qty, String location, String date, String comment) {
        actor.attemptsTo(EditOfferTask.editOfferTask(new EditOfferModel(protein, supplier, temperature, inconterm, qty, location, date, comment)));
    }

    @Entonces("el {actor} puede publicar las ofertas estandarizadas y ver {string}")
    public void puedePublicarLasOfertasEstandarizadas(Actor actor, String mensaje) {
        actor.attemptsTo(Wait.oneTime(20000));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Public_edit_Offer.message(), org.hamcrest.CoreMatchers.is(mensaje)));
    }

}
