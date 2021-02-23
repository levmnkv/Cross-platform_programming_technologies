package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scnr = new Scanner(System.in);
        while (flag){
            System.out.println("Enter first argument ");
            long first = scnr.nextLong();
            System.out.println("Enter second argument ");
            long second = scnr.nextLong();
            long result = power(first, second);
            System.out.println("Result is " + result + ".");
            System.out.println("If you want to exit from program, enter 1.");
            byte check = scnr.nextByte();
            if (check == 1){
                flag = false;
            }
        }
        System.out.println("GoodBye!");
    }
    protected static long power(long a, long b) {
        int res = 1;
        int i = 0;
        while (i<b){
            res *= a;
            i++;
        }
        return res;
    }
}
