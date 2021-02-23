package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scnr = new Scanner(System.in);
        while (flag){
            System.out.println("Enter first argument ");
            int first = scnr.nextInt();
            System.out.println("Enter second argument ");
            int second = scnr.nextInt();
            int result = power(first, second);
            System.out.println("Result is " + result + ".");
            System.out.println("If you want to exit from program, enter 1.");
            int check = scnr.nextInt();
            if (check == 1){
                flag = false;
            }
        }
        System.out.println("GoodBye!");
    }
    protected static int power(int a, int b) {
        int res = 1;
        int i = 0;
        while (i<b){
            res *= a;
            i++;
        }
        return res;
    }
}
