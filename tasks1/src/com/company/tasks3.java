package com.company;

import javax.swing.plaf.PanelUI;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;

enum variants{
    rock, paper, scissors
}

public class tasks3 {
    public static HashMap<String, Integer> millionsRounding(HashMap<String, Integer> myHashMap){
        for (String i : myHashMap.keySet()) {
            BigDecimal roundDec = new BigDecimal(myHashMap.get(i));
            roundDec = roundDec.divide(new BigDecimal("1000000")).setScale(0, RoundingMode.HALF_UP);
            int pop = roundDec.intValue() * 1000000;
            myHashMap.replace(i, pop);
        }
        return myHashMap;
    }
    public static double[] otherSides(int side){
        double scale = Math.pow(10, 2);
        return new double[]{Math.ceil(side * 2 * scale) / scale,Math.ceil(side * Math.sqrt(3) * scale) / scale};
    }
    public static String rps(String firstPlayer, String secondPlayer){
        //variants var;
        ArrayList<variants> variantsArrayList = new ArrayList<variants>();
        variantsArrayList.add(variants.rock);
        variantsArrayList.add(variants.paper);
        variantsArrayList.add(variants.scissors);
        int index1 = 0, index2 = 0;
        /*
        * if else условие, для проверки, что там выбрал первый игрок
        * */
        if(firstPlayer.equals("rock"))
            index1 = variantsArrayList.indexOf(variants.rock);
        else if(firstPlayer.equals("paper"))
            index1 = variantsArrayList.indexOf(variants.paper);
        else if(firstPlayer.equals("scissors"))
            index1 = variantsArrayList.indexOf(variants.scissors);
        /*
         * if else условие, для проверки, что там выбрал второй игрок
         * */
        if(secondPlayer.equals("rock"))
            index2 = variantsArrayList.indexOf(variants.rock);
        else if(secondPlayer.equals("paper"))
            index2 = variantsArrayList.indexOf(variants.paper);
        else if(secondPlayer.equals("scissors"))
            index2 = variantsArrayList.indexOf(variants.scissors);
        //Проверка кто победил
        if (index1 == index2) {
            return "TIE";
        }
        if ((index1 - index2) == 1 || (index1 - index2) == -2) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }
    public static int warOfNumbers(int[] warriors){
        int sumOfEvens = 0, sumOfOdds = 0;
        for (int warrior:warriors) {
            if((warrior & 1) == 0)
                sumOfEvens+= warrior;
            else
                sumOfOdds+= warrior;
        }
        return Math.abs(sumOfEvens - sumOfOdds);
    }
    public static String reverseCase(String str){
        String strNew = "";
        for (int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                strNew = strNew + Character.toUpperCase(str.charAt(i));
            else
                strNew = strNew + Character.toLowerCase(str.charAt(i));
        }
        return strNew;
    }

    private static boolean isVowel(char ch){
        String vowels = "aeiouy";
        if(vowels.indexOf(Character.toLowerCase(ch)) != -1)
            return true;
        else
            return false;
    }
    public static String inatorInator(String str){
        int len = str.length();
        if(isVowel(str.charAt(len - 1)))
            str += "-inator";
        else
            str += "inator";
        return str + " " + len * 1000;
    }

    public static boolean doesBrickFit(int brickheight, int brickwidth, int brickdepth, int holewidth, int holeheight){
        return !(((brickheight>holeheight || brickwidth>holewidth) &&
                (brickwidth>holeheight || brickwidth>holewidth)) ||
                ((brickdepth>holeheight || brickdepth>holewidth) &&
                (brickwidth>holeheight || brickwidth>holewidth)) ||
                ((brickdepth>holeheight || brickdepth>holewidth) &&
                (brickheight>holeheight || brickheight>holewidth)));
    }

    public static double totalDistance(double liters, double lkm, int passenger, boolean cond){
        if(cond)
            return (liters / (lkm * ((0.05 * passenger) + 1) * 1.1)) * 100;
        else
            return (liters / (lkm * ((0.05 * passenger) + 1))) * 100;
    }
    public static double mean(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
    public static boolean parityAnalysis(int num){
        int sum = 0;
        int _num = num;
        while (_num/10 > 0){
            sum = sum + (_num % 10);
            _num /= 10;
        }
        sum = sum + (_num % 10);
        if ((num & 1) == (sum & 1))
            return true;
        else
            return false;
    }
}
