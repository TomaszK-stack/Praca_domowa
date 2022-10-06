package com.company;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args){
        String czy_q = "";
        Scanner sc = new Scanner(System.in);
        Integer wynik = 0;
        while(czy_q != "q"){
            for(int i=0; i<2;i++){
                Integer a = sc.nextInt();
                Integer b = sc.nextInt();
                String dzialanie = sc.next();
                if(dzialanie.equals("+") ){
                    wynik = a + b;
                    System.out.print(wynik);
                }
                else if(dzialanie.equals("-")){
                    wynik = a - b;
                    System.out.print(wynik);
                }else{
                    System.out.print("błąd");

                }

                }
            System.out.print("Co teraz zrobić?");
            czy_q = sc.next();
            }

        }



    }



