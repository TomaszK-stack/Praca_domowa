package com.company;

import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie");
        String Imie = sc.next();
        System.out.print("Podaj nazwisko");
        String Nazwisko = sc.next();
        System.out.print("Podaj plec");
        String Plec = sc.next();
        System.out.print("Podaj wiek");
        String Wiek = sc.next();
        System.out.printf(Imie,Nazwisko,Wiek,Plec);




    }
}
