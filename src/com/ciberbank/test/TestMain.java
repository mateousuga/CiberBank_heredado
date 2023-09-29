package com.ciberbank.test;

public class TestMain {
    public static void main(String[] args) {
        int[] edades = new int[5];
        edades[2] = 30;

        System.out.println(edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
    }
}
