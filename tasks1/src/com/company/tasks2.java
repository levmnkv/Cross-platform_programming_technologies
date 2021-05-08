package com.company;

import java.util.Arrays;
import java.util.Locale;

public class tasks2 {
    public static int oppositeHouse(int houseNum, int count){
        return houseNum*2+1-count;
    }
    public static String nameShuffle(String FirstAndLastName){
        String[] LastAndFirstName = FirstAndLastName.split("\\s");
        return LastAndFirstName[1] + " " + LastAndFirstName[0];
    }
    public static double discount(double price, double dis){
        return price - price * dis / 100;
    }
    public static int differenceMaxMin(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
    public static int equal(int a, int b, int c){
        if (a != b && a != c && b != c)
            return 0;
        else if ((a == b && a != c && b != c) ||
                 (a != b && a == c && b != c) ||
                 (a != b && a != c && b == c))
            return 1;
        else
            return 2;
    }
    public static String reverse(String s){
        String str = "";
        for(int i = s.length() -1; i >= 0; --i){
            str += s.charAt(i);
        }
        return str;
    }
    public static int programmers(int firstProgrammer, int secondProgrammer, int thirdProgrammer){
        int[] pogers = {firstProgrammer, secondProgrammer, thirdProgrammer};
        Arrays.sort(pogers);
        return pogers[pogers.length - 1] - pogers[0];
    }
    public static boolean getXO (String xoStr){
        int countX = 0,
                countO = 0;
        xoStr = xoStr.toLowerCase(Locale.ROOT);
        for (int i = 0; i < xoStr.length(); i++) {
            if(xoStr.charAt(i) == 'x')
                countX++;
            else if(xoStr.charAt(i) == 'o')
                countO++;
        }
        if (countO == countX)
            return true;
        else
            return false;
    }
    public static String bomb(String str){
        str = str.toLowerCase(Locale.ROOT);
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'b'){
                if (str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 2) == 'm' &&
                    str.charAt(i + 3) == 'b'){
                    return "DUCK!";
                }
            }
        }
        return "Relax, there's no bomb.";
    }
    public static boolean sameAscii(String first, String second){
        int firstAsciiSum = 0, secondAsciiSum = 0;
        for (int i = 0; i < first.length(); i++){
            firstAsciiSum += (int) first.charAt(i);
        }
        for (int i = 0; i < second.length(); i++){
            secondAsciiSum += (int) second.charAt(i);
        }
        if (firstAsciiSum == secondAsciiSum)
            return true;
        else
            return false;
    }
}
