package com.FibaniccoSeries;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Number for How much time you want to perform the series.");

        int a=0;
        int b=1;
        int c=a+b;

        int n=input.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
