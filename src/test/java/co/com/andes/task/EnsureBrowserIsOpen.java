/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 *
 * @author litio
 */
public class EnsureBrowserIsOpen implements Task {

    public static EnsureBrowserIsOpen theBrowserIsOpen() {
        return instrumented(EnsureBrowserIsOpen.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene la capacidad de BrowseTheWeb asociada al actor para interactuar con el navegador
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();

        // Intenta navegar a una página, como la página de inicio, o simplemente recuperar el título para comprobar si el navegador está abierto
        try {
            // Solo intenta obtener el título para comprobar si el navegador está activo
            String title = webDriver.getTitle();
        } catch (Exception e) {
            // Si el navegador no está abierto o hay algún error, reabre el navegador
            webDriver.get("about:blank"); // Usa una página ligera como about:blank para abrir el navegador
        }
    }
}
