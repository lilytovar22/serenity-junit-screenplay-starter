/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.task;

import co.com.andes.interactions.WaitInteraction;
import co.com.andes.models.EditOfferModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.andes.userinterfaces.Create_OffertUI.BTN_PUBLISH_OFERT_IN_EDIT;

/**
 *
 * @author litio
 */
public class EditOfferTask implements Task {
    
    EditOfferModel offer;

    public EditOfferTask(EditOfferModel offer) {
        this.offer = offer;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //ScrollByPixels.down(1000),
                Click.on(BTN_PUBLISH_OFERT_IN_EDIT),
                WaitInteraction.waitFor(5)
        );
    }

    public static EditOfferTask editOfferTask(EditOfferModel offer) {
        return Tasks.instrumented(EditOfferTask.class, offer);
    }
}
