package com.teska;

public class Main {

    public static void main(String[] args) {
    Cinema MojeKino = new Cinema("Sala główna",14);
        System.out.println(MojeKino.getNazwaSali() + " ma " + MojeKino.getSeats() + " siedzeń");

        StringBuilder sb = new StringBuilder();
        for (char A='A'; A<='Z';A++){
            sb.append(A); //dodawaj kolejne litery do obiektu sb
            System.out.println(sb);
        }
        }
    }

