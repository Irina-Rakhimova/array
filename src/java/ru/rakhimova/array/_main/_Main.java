package ru.rakhimova.array._main;

import java.util.Arrays;

public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{-6, 3, 8, 2, -4, 5, -1, 9, 7, -4};
        evenNumbers(arr);
        oddNumbers(arr);
        primeNumbers(arr);
        sumNumbers(arr);
        subtractNumbers(arr);
        zeroInArray(arr);
    }

    public static void evenNumbers(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                n++;
            }
        }
        System.out.println("Четные числа: " + n);
    }

    public static void oddNumbers(int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                m++;
            }
        }
        System.out.println("Нечетные числа: " + m);
    }

    public static void primeNumbers(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (chekPrime(arr[i])) {
               k++;
            }
        }
        System.out.println("Простые числа: " + k);
    }

    public static boolean chekPrime(int i) {
        if(i <= 1) {
            return false;
        }
        else if(i <= 3) {
            return true;
        }
        else if(i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        for(int t = 5; t <= (int) Math.sqrt(i); t = t + 6){
            if(i % t == 0 || i % (t + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumNumbers(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("Сумма чисел: " + sum);
    }

    public static void subtractNumbers(int[] arr) {
        int sumEvenIndex = 0;
        int sumOddIndex = 0;
        int subtract = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            sumEvenIndex += arr[i];
        }
        for (int i = 1; i < arr.length; i = i + 2) {
            sumOddIndex += arr[i];
        }
        subtract = sumEvenIndex - sumOddIndex;
        System.out.println("Разность между суммой четных и нечетных индексов: " + subtract);
    }

    public static void zeroInArray(int[] arr) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero += 1;
            }
        }
        System.out.println("Количество нулей в массиве: " + zero);
    }
}
