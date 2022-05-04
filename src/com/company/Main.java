package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        method1(new int[]{1, 8, 3, 3, 4, 4, 9, 12});
        method2(new int[]{1, 8, 3, 3, 4, 4, 9, 12});
        }
    public static void method1(int[] massiv1) {
        int minimum = massiv1[0];
        for (int i = 0; i < massiv1.length; i++) {
            minimum = Math.min(minimum, massiv1[i]);
        }
        System.out.println("Массив: "+Arrays.toString(massiv1));
        System.out.println("Минимальный элемент: "+minimum);
    }
    public static void method2(int[] massiv1) {
        int maximum = massiv1[0];
        for (int i = 0; i < massiv1.length; i++) {
            maximum = Math.max(maximum, massiv1[i]);
        }
        System.out.println("Максимальный элемент: "+maximum);
    }
}