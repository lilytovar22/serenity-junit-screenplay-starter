/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.task;

import co.com.andes.interactions.WaitInteraction;
import co.com.andes.models.OffertModel;
import co.com.andes.userinterfaces.Create_OffertUI;
import co.com.andes.utils.ScrollByPixels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.JavascriptExecutor;

import static co.com.andes.userinterfaces.Create_OffertUI.*;

/**
 *
 * @author litio
 */
public class CreateOfferTask implements Task {

    private OffertModel offer;

    public CreateOfferTask(OffertModel offer) {
        this.offer = offer;
    }

    private void highlightMouseMovement(Actor actor) {
        String script = "var body = document.querySelector('body');"
                + "var mousePointer = document.createElement('div');"
                + "mousePointer.setAttribute('style', 'width: 20px; height: 20px; border-radius: 10px; background: red; position: absolute; z-index: 10000; pointer-events: none;');"
                + "body.appendChild(mousePointer);"
                + "document.addEventListener('mousemove', function(e) {"
                + "  mousePointer.style.left = e.pageX + 'px';"
                + "  mousePointer.style.top = e.pageY + 'px';"
                + "});";

        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript(script);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_POST_OFFER),
                ScrollByPixels.down(1000),
                WaitInteraction.waitFor(5)
        );
        highlightMouseMovement(actor); // Llama al método para resaltar el movimiento del mouse
        actor.attemptsTo(WaitInteraction.waitFor(5));

        /*  Aqui se hace el proceso de carga de un archivo del PC al sitio web */
        actor.attemptsTo(Enter.theValue(offer.getOffer()).into(Create_OffertUI.OFFER_INPUT));

        actor.attemptsTo(Click.on(DWN_POST_OFFER_PROTEIN));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(offer.getProtein()));

        actor.attemptsTo(Click.on(DWN_POST_OFFER_SUPPLIER));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(offer.getSupplier()));

        actor.attemptsTo(Click.on(DWN_POST_OFFER_TEMPERATURE));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(offer.getTemperature()));

        actor.attemptsTo(Click.on(DWN_POST_OFFER_INCONTERM));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(offer.getInconterm()));
        actor.attemptsTo(WaitInteraction.waitFor(3));

        actor.attemptsTo(Click.on(DWN_POST_OFFER_QTY));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Enter.theValue(offer.getQty()).into(DWN_POST_OFFER_QTY));
        actor.attemptsTo(WaitInteraction.waitFor(3));

        actor.attemptsTo(Click.on(INP_POST_OFFER_LOCATION));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Enter.theValue(offer.getLocation()).into(INP_POST_OFFER_LOCATION));
        actor.attemptsTo(WaitInteraction.waitFor(3));

        actor.attemptsTo(Click.on(INP_POST_OFFER_COMMENTS));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Enter.theValue(offer.getComment()).into(INP_POST_OFFER_COMMENTS));
        actor.attemptsTo(WaitInteraction.waitFor(2));

        actor.attemptsTo(Click.on(INP_POST_OFFER_DATE));
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Enter.theValue(offer.getDate()).into(INP_POST_OFFER_DATE));
        actor.attemptsTo(WaitInteraction.waitFor(3));

        actor.attemptsTo(Click.on(SWC_WITH_DOCS));
        actor.attemptsTo(WaitInteraction.waitFor(2));

        actor.attemptsTo(Click.on(SWC_WITH_PALLETS));
        actor.attemptsTo(WaitInteraction.waitFor(2));

        actor.attemptsTo(Click.on(BTN_STANDARDIZE));
        actor.attemptsTo(WaitInteraction.waitFor(20));

        actor.attemptsTo(ScrollByPixels.down(1000));
        actor.attemptsTo(WaitInteraction.waitFor(5));
        actor.attemptsTo(ScrollByPixels.down(1000));

    }

    public static CreateOfferTask createOffer(OffertModel offer) {
        return Tasks.instrumented(CreateOfferTask.class, offer);
    }

}
