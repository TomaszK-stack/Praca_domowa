package com.company;

import java.util.Scanner;

public class zadanie7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        int maks = Math.max(a,b);
        int nwd = 1;
        for(int i=1;i<maks;i++){
            if((a%i==0) && (b%i==0)){
                 nwd = i;

            }

        }

        System.out.print(nwd);
    }
}
