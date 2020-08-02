package com.teska;

public class Main {

    public static void main(String[] args) {
        Cinema MojeKino = new Cinema("Sala główna", 'D',15);
        System.out.println(MojeKino.getNazwaSali());
        System.out.println(MojeKino.getSiedzenia());
        //

//        rozkladSiedzien('D',10);
//StringBuilder sb = new StringBuilder();
    }
        public static void rozkladSiedzien(char rzedy, int kolumny)
        {
            for (char litera = 'A'; litera <= rzedy; litera++) {
                for (int numer = 1; numer <= kolumny; numer++) {
                    System.out.print(litera + "" + numer + " ");
                }
                System.out.println();
            }
        }
    }

