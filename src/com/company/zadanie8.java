package com.company;

import java.util.Scanner;

public class zadanie8

{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int a;
        int b;


        int[][] threeD_arr = new int[10][10];
        int lengthone = threeD_arr.length;
        int lengthtwo = threeD_arr[0].length;
        for(int i =0;i<lengthone;i++){
            for (int z = 0; z<lengthtwo;z++){
                if(threeD_arr[i][z]==element){
                    System.out.print(i);
                    System.out.print(z);
                }

            }

        }

    }
}
