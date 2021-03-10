package com.company;

public class Primes {

    public static void main(String[] args) {
        /*
        * Цикл ниже перебирает числа от 2 до 100 включительно
        */
        for (int i = 2; i <= 100; i++){
            // Проверяем, является ли i простым числом
            if (isPrime(i)){
                System.out.println(i);// Выводим число в консоль
            }
        }
    }
    // Данная функция возвращает истину если число является простым
    public static boolean isPrime (int n){
        // Хоть в методическом материале и сказано, что можно предположить будто n будет больше 2,
        // лучше сделать проверку на всякий случай.
        if(n == 1 || n == 2){
            return true;
        }
        else {
            boolean IsPrime = true;
            for (int i = 2; i < n; i++) {
                // В цикле перебираем все числа от 2 до n и проверяем делится ли наше n без остатка на i
                // Если да, то isPrime присваивается значение false
                if (n % i == 0) {
                    IsPrime = false;
                }
            }
            return IsPrime;
        }
    }
}
