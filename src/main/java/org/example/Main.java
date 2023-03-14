package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{4,6,1,0};
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*10);
            System.out.println(mas[i]);

        }

}}