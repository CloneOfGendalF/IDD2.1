package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        yourCode();

        int[] reformatArray = {1, 2, 4, 5, 1, 2, 4, -1, -1, -3};
        int[] simpleArray = {1, 2, 4, 5, 1, 2, 4, -1, -1, -3};

        print(reformatArray);

        int n = reformatArray.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (reformatArray[j] != reformatArray[i]) {
                    if (m != j) reformatArray[m] = reformatArray[j];
                    m++;
                }
            }
        }

        if (n != reformatArray.length) {
            int[] b = new int[n];
            System.arraycopy(reformatArray, 0, b, 0, n);

            reformatArray = b;
        }

        print(reformatArray);

        int[] allNumbs2 = new int[reformatArray.length];

        for (int i = 0; i < reformatArray.length; i++) {
            int lengthArray = 0;
            for (int k : simpleArray) {
                if (reformatArray[i] == k) {
                    lengthArray++;
                    allNumbs2[i] = lengthArray;
                }
            }
            System.out.println("цифра: " + reformatArray[i] + " = " + allNumbs2[i] + " шт ");
        }
    }

    private static void print(int[] a) {
        for (int x : a) System.out.print(x + " ");

        System.out.println();
    }

    public static void yourCode() {
        int[] allNumbs = new int[]{1, 3, -4, 2, 4, -2, 6, -8};
        int pNumbs = 0;
        int mNumbs = 0;
        int negSum = 0;
        int plSum = 0;

        for (int allNumb : allNumbs) {
            if (allNumb > 0) {
                plSum += allNumb;
                pNumbs++;
            }
            if (allNumb < 0) {
                negSum += allNumb;
                mNumbs++;
            }
        }
        double sAN = (double) negSum / mNumbs;
        double sPN = (double) plSum / pNumbs;
        System.out.println("Среднеарифметическое значение положительных чисел: "
                + sPN + "\n" + "Среднеарифметическое значение отрицательных чисел: " + sAN);
        System.out.println("______________________________________________________________________");


    }
    /*public static void main(String[] args){
        String[] third = {"hello", "tewre", "Eldar", "HELLLLOOOOL"};
        for (int i = 100; i > 0; i--) {
            System.out.println("9 * " + i + " = " + (9 * i));*/
        }
    }



}
