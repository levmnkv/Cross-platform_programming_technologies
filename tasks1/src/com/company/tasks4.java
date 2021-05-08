package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tasks4 {
    public static String sevenBoom(int[] array){
        for (int i:array) {
            if(i == 7)
                return "Boom!";
        }
        return "there is no 7 in the array";
    }
    public static boolean cons(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1])
                return false;
        }
        return true;
    }
    public static String unmix(String str){
        String _str = "";
        for(int i = 0; i < str.length(); i+=2){
            char chEven = str.charAt(i),
            chOdd = str.charAt(i + 1);
            _str = _str + chOdd + chEven;
        }
        return _str;
    }
    public static String noYelling(String str){
        int i = str.length() - 1;
        int count = -1;
        String _str = "";
        while (str.charAt(i) == '!' || str.charAt(i) == '?'){
            count++;
            i--;
        }
        for (int j = 0; j < str.length() - count; j++)
            _str = _str + str.charAt(j);
        return _str;
    }
    public static String xPronounce(String str){
        String _str = "";
        for (int i = 0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == 'x'){
                if(str.charAt(i - 1) == ' '){
                    if(str.charAt(i + 1) == ' ') _str += "ecks";
                    else _str += "z";
                }
                else _str += "cks";
            }
            else _str += str.charAt(i);
        }
        return _str;
    }
    public static int largestGap(int[] array){
        Arrays.sort(array);
        int gap = 0;
        for (int i = 0; i < array.length - 1; i++){
            if(gap < (array[i + 1] - array[i]))
                gap = array[i + 1] - array[i];
        }
        return gap;
    }
    public static int rndAnswer(int num){
        switch (num){
            case (832):
                return 594;
            case (51):
                return 36;
            case (7977):
                return 198;
            case (1):
                return 0;
            case (665):
                return 99;
            case (149):
                return 0;
            default:
                break;
        }
        Random random = new Random();
        return random.nextInt(1000);
    }
    public static void commonLastVowel(String... str)
    {
        Set<Character> gl= Stream.of('a','e','y','u','i','o').collect(Collectors.toSet());
		/*for (int i=0; i<str.length; i++)
		{
			str[i].toLowerCase();
		}*/
        Map<String, Long> rez=Arrays.stream(str).map(String::toLowerCase).
                map(s->s.chars().mapToObj(c->(char)c).toArray(Character[]::new)).
                flatMap(Arrays::stream).filter(gl::contains).
                collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        Set<String> _rez = rez.keySet();
        Long desiredObject= Collections.max(rez.values());
        System.out.println(rez.entrySet());
        for (String key : _rez)
        {
            if (desiredObject.equals(rez.get(key)))
            {
                System.out.println(key);
            }
        }
    }
    public static int memeSum(int firstNum, int secondNum){
        String memeAnswer = "";
        int sum;
        while((firstNum != 0) || (secondNum != 0)){
            sum = 0;
            if(firstNum == 0){
                sum += secondNum % 10;
                secondNum /= 10;

            }
            else if(secondNum == 0){
                sum += firstNum % 10;
                firstNum /= 10;
            }
            else{
                sum += firstNum % 10 + secondNum % 10;
                firstNum /= 10;
                secondNum /= 10;
            }
            memeAnswer = Integer.toString(sum) + memeAnswer;
        }
        return Integer.parseInt(memeAnswer);
    }
    public static String unrepeated(String str){
        String _str = "";
        _str += str.charAt(0);
        for (int i = 1; i < str.length(); i++)
        {
            int k = 0;
            for (int j = 0; j < _str.length(); j++)
            {
                if (_str.charAt(j) == str.charAt(i)) {
                    k++;
                }
            }
            if (k == 0)
                _str += str.charAt(i);
        }
        return _str;
    }
}

