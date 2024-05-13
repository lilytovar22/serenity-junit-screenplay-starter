/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 *
 * @author litio
 */
public class Question_UI {

    public static final Target INPUT_OFFER_TXT = Target
            .the("Se confirma que el texto es Input Offer")
            .located(By.xpath("//h4[normalize-space()='Input Offer']"));

    public static final Target EDIT_QUOTATION_TXT = Target
            .the("Confirmar que el Quotation Space es Ismael")
            .located(By.xpath("//h2[normalize-space()='LATAM1-AUTOMATIZACION']"));

    public static final Target EDIT_OFFER_LIST_TXT = Target
            .the("Se confirma que el texto es Offer List en el componente de Editar")
            .located(By.xpath("//*[@id=\"kt_header\"]/div/div[2]/div/h2"));

    public static final Target PUBLIC_EDIT_OFFER_LIST_TXT = Target
            .the("Se confirma que el texto es Offer List despues de publicar")
            .located(By.xpath("//*[@id=\"kt_header\"]/div/div[2]/div/h2"));
}
