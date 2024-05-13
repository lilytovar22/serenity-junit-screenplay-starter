/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.models;

/**
 *
 * @author litio
 */
public class OffertModel {
    
    public String offer;
    public String protein;
    public String supplier;
    public String temperature;
    public String inconterm;
    public String qty;
    public String location;
    public String date;
    public String comment;

    public OffertModel(String offer, String protein, String supplier, String temperature, String inconterm, String qty, String location, String date, String comment) {
        this.offer = offer;
        this.protein = protein;
        this.supplier = supplier;
        this.temperature = temperature;
        this.inconterm = inconterm;
        this.qty = qty;
        this.location = location;
        this.date = date;
        this.comment = comment;
    }

    public OffertModel(String offer) {
        this.offer = offer;
    }

    public String getOffer() {
        return offer;
    }

    public String getProtein() {
        return "//span[contains(text(),'" + protein + "')]";
    }

    public String getSupplier() {
        return "//span[contains(text(),'" + supplier + "')]";
    }

    public String getTemperature() {
        return "//mat-option/span[text()='" + temperature + "']";
    }

    public String getInconterm() {
        return "//span[contains(text(),'" + inconterm + "')]";
    }

    public String getQty() {
        return qty;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}
