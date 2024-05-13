/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

/**
 *
 * @author litio
 */
public class ScrollByPixels implements Task {
    
    private final int pixels;

    public ScrollByPixels(int pixels) {
        this.pixels = pixels;
    }

    public static ScrollByPixels down(int pixels) {
        return new ScrollByPixels(pixels);
    }

    public static ScrollByPixels up(int pixels) {
        return new ScrollByPixels(-pixels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        jsExecutor.executeScript("window.scrollBy(0," + this.pixels + ")");
    }
}
