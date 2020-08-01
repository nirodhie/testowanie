package com.teska;

import java.util.ArrayList;

public class Cinema {

    private String nazwaSali;
    private int seats;
    private ArrayList<String> nazwaSiedzenia;

    public Cinema(String nazwaSali, int seats) {
        this.nazwaSali = nazwaSali;
        this.seats = seats;
    }

    public String getNazwaSali() {
        return nazwaSali;
    }

    public int getSeats() {
        return seats;
    }
}


