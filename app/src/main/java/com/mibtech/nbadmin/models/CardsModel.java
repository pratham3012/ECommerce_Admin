package com.mibtech.nbadmin.models;

/**
 * Created by kshitij on 16/1/18.
 */

public class CardsModel {


    public int cardid;
    public String cardname;
    public String cardimage;
    public String carddiscription;
    public float cardprice;

    public CardsModel() {
    }

    public CardsModel(int cardid, String cardname, String cardimage, String carddiscription, float cardprice) {
        this.cardid = cardid;
        this.cardname = cardname;
        this.cardimage = cardimage;
        this.carddiscription = carddiscription;
        this.cardprice = cardprice;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCardimage() {
        return cardimage;
    }

    public void setCardimage(String cardimage) {
        this.cardimage = cardimage;
    }

    public String getCarddiscription() {
        return carddiscription;
    }

    public void setCarddiscription(String carddiscription) {
        this.carddiscription = carddiscription;
    }

    public float getCardprice() {
        return cardprice;
    }

    public void setCardprice(float cardprice) {
        this.cardprice = cardprice;
    }
}
