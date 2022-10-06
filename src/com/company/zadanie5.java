package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj 3 liczby");
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        System.out.print(Collections.max(Arrays.asList(a,b,c)));


    }

}
