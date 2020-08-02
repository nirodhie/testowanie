package com.teska;

import java.util.ArrayList;

public class Cinema {

    private final String nazwaSali;


    private ArrayList<String> siedzenia = new ArrayList<>();



    public Cinema(String nazwaSali, char rzedy, int kolumny) {
        this.nazwaSali = nazwaSali;

            for (char litera = 'A'; litera <= rzedy; litera++) {
                for (Integer numer = 1; numer <= kolumny; numer++) {

                    this.siedzenia.add(litera + numer.toString() );

                }
            }


    }


    public String getNazwaSali() {
        return nazwaSali;
    }

    public ArrayList<String> getSiedzenia() {
        return siedzenia;
    }
}


