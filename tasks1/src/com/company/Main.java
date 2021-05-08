package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        System.out.println(remainder(3,4));
//        System.out.println(triArea(3,4));
//        System.out.println(animals(3,4, 4));
//        System.out.println(profitableGamble(3,4,1));
//        System.out.println(operation(3,4, 1));
//        System.out.println(ctoa('a'));
//        System.out.println(addUpTo(3));
//        System.out.println(addUpToR(3));
//        System.out.println(nextEdge(8,10));
//        int[] array = {1, 5, 9};
//        System.out.println(sumOfCubes(array));
//        System.out.println(abcmath(42, 5, 10));
//        System.out.println(divisibleByFive(10));
//        System.out.println(howManyWalls(100, 4, 5));
//        System.out.println(frames(10, 25));
//        System.out.println();
//        System.out.println("Вторая группа задач");
//        System.out.println(tasks2.nameShuffle("Donald Trump"));
//        System.out.println(tasks2.discount(1500, 50));
//        System.out.println(tasks2.equal(1,2,2));
//        System.out.println(tasks2.getXO("xoXoo"));
//        System.out.println(tasks2.sameAscii("AA", "Bb"));
//        HashMap<String, Integer> Cities = new HashMap<>();
//        Cities.put("Moscow", 12332160);
//        Cities.put("Tokyo", 19991456);
//        Cities.put("Vatican City", 572);
//        System.out.println(tasks3.millionsRounding(Cities));
//        System.out.println(tasks3.rps("paper", "rock"));
//        System.out.println(tasks3.inatorInator("Doom"));
//        System.out.println(tasks3.doesBrickFit(1,1,1,1,1));
//        System.out.println(tasks3.totalDistance(36.1, 8.6, 3, true));
//        System.out.println(tasks3.mean(array));
//        System.out.println(tasks3.parityAnalysis(243));
//        System.out.println(tasks4.unmix("123456"));
//        System.out.println(tasks4.noYelling("Hello!!!! world???!?"));
//        System.out.println(tasks4.xPronounce("OMG x box unboxing video x D"));
//        System.out.println(tasks4.largestGap(array));
//        System.out.println(tasks4.memeSum(122,81));
//        System.out.println(tasks4.unrepeated("call 911"));
        System.out.println(tasks2.bomb("hello man is not here"));
    }
    public static int remainder(int first, int second){
        return first % second;
    }
    public static double triArea(double base, double height){
        return (base*height)/2;
    }
    public static int animals(int chickens, int cows, int pigs){
        return chickens*2+cows*4+pigs*4;
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob * prize > pay;
    }
    public static String operation(int N, int a, int b){
        String answer = "none";
        if(N == a+b){
            answer = "Added";
        }
        else if (N == a-b){
            answer = "Subtracted";
        }
        else if (N == a*b){
            answer = "Multiplied";
        }
        else if (N == a/b){
            answer = "Division";
        }
        return answer;
    }
    public static int ctoa(char ch){
        return (int) ch;
    }
    public static int addUpTo(int n){
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return  res;
    }
    public static int addUpToR(int n){
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n + addUpToR(n-1);
        return result;
    }
    public static int nextEdge(int a, int b){
        return a+b-1;
    }
    public static int sumOfCubes(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i*i*i;//или Math.Pow(i,3);
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){
        for (int i = 1; i <= b; i++){
            a += a;

        }
        boolean div = false;
        if(a % c == 0)
            div = true;
        return div;
    }
    // Новые первые задачи
    public static int convert(int minutes){ return minutes * 60;}
    public static int points(int two_point, int three_point){ return two_point * 2 + three_point * 3;}
    public static int footballPoint(int wins, int draws, int defeats){ return wins * 3 + draws;}
    public static boolean divisibleByFive(int value){ return value % 5 == 0;}
    public static boolean and(boolean a, boolean b){ return a && b;}
    public static int howManyWalls(int n, int w, int h){return n / (w*h);}
    /*
    * public class Challenge {
    *   public static int squaed (int b){  тут ошибка в название метода
    *       return a * a тут возвращаем произведение двух переменных а, которые не были объявлены, так же нет ;
    *   }
    * }
    */
    public static int squared(int value){
        return value * value;
    }
    public static int frames(int minutes, int fps){return minutes*60*fps;}
    public static int mod(int a, int b){return a - a / b * b;}
}

