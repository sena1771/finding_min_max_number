package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min=0,max=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("How many numbers you would calculate: ");
        int many= inp.nextInt();
        for(int i=1;i<=many;i++) {
            System.out.print(i);
            System.out.println(".Number: ");
            int a = inp.nextInt();


            if (a < min) {

                min=a;

            } if(a>max) {

                max=a;
                }
            }
        System.out.println("Max number: "+max);
        System.out.print("Min number: "+min);
        }
    }

