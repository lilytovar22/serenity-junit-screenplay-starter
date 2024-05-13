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
public class Create_OffertUI {

    public static final Target OFFER_INPUT = Target
            .the("Se ingresa oferta en el offer input")
            .located(By.id("textarea_forms_creation"));

    public static final Target SUPPLIER = Target
            .the("Se desplega campo de supplier")
            .located(By.xpath("//span[@class='dropdown-btn'][1]"));

    public static final Target SEARCH_IN_SUPPLIER = Target
            .the("Ingresa dato en el search de supplier")
            .located(By.xpath("//input[@placeholder='Search'][1]"));

    public static final Target BTN_POST_OFFER = Target
            .the("Se da click sobre el boton de Post Offer")
            .located(By.xpath("//button[@class='cta cta-primary cta-post ng-star-inserted']"));

    public static final Target DWN_POST_OFFER_PROTEIN = Target
            .the("Se da click sobre el drop down Protein")
            .located(By.xpath("//*[@formcontrolname=\"protein\"]"));

    public static final Target DWN_POST_OFFER_SUPPLIER = Target
            .the("Dar click sobre el drop down Supplier")
            .located(By.xpath("//*[@formcontrolname=\"supplier\"]"));

    public static final Target DWN_POST_OFFER_TEMPERATURE = Target
            .the("Click sobre el drop down Temperature")
            .located(By.xpath("//*[@formcontrolname=\"temperature\"]"));

    public static final Target DWN_POST_OFFER_INCONTERM = Target
            .the("Se de click sobre el drop down Inconterm")
            .located(By.xpath("//*[@formcontrolname=\"inconterm\"]"));

    public static final Target DWN_POST_OFFER_QTY = Target
            .the("Se ingresa el QTY / lbs")
            .located(By.xpath("//input[@name='available_pounds']"));

    public static final Target INP_POST_OFFER_LOCATION = Target
            .the("Se ingresa la informacion en Pick up location")
            .located(By.xpath("//*[@formcontrolname=\"location_id\"]"));

    public static final Target INP_POST_OFFER_DATE = Target
            .the("Se ingresa la informacion en Pick up date")
            .located(By.name("pick_up_date"));

    public static final Target INP_POST_OFFER_COMMENTS = Target
            .the("Se ingresan los comentarios")
            .located(By.xpath("//*[@formcontrolname=\"observations\"]"));

    public static final Target SWC_WITH_DOCS = Target
            .the("Clik en boton Switch With Docs")
            .located(By.xpath("//div[@class='toggle']//div[1]//label[1]//div[1]//span[2]"));

    public static final Target SWC_WITH_PALLETS = Target
            .the("Clik en boton Switch With Pallets")
            .located(By.xpath("//div[@class='container-dropdown']//div[2]//label[1]//div[1]//span[2]"));

    public static final Target BTN_CLOUD_UPLOAD = Target
            .the("Clik en boton Upload File")
            .located(By.xpath("//span[contains(text(),'cloud_upload')]"));

    public static final Target BTN_LOGO = Target
            .the("BOTON PARA AGREGAR EL LOGO").locatedBy("//input[@type='file']");

    public static final Target BTN_STANDARDIZE = Target
            .the("Clik en boton de Estandarizar")
            .located(By.xpath("//button[normalize-space()='Standardize']"));

    public static final Target BTN_DELETE_OFERT_IN_EDIT = Target
            .the("Clik en el icono de eliminar en el componente de editar")
            .located(By.xpath("//*[@id=\"kt_content_container\"]/app-offers/div[6]/div[1]/form/div/div[11]/mat-card/mat-card-content/div/div[14]/button/i"));

    public static final Target BTN_PUBLISH_OFERT_IN_EDIT = Target
            .the("Clik en el boton de publicar en el componente de editar")
            .located(By.xpath("//button[@class='cta cta-primary']"));

}
