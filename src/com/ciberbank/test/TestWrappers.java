package com.ciberbank.test;

public class TestWrappers {
    public static void main(String[] args) {
        Double numeroDoble = 33.0; //autoboxing
        Boolean verdadero = true; //autoboxing

        Double numeroDoble2 = Double.valueOf(33);
        System.out.println(numeroDoble2);

        String numeroString = "43"; //autoboxing
        String numeroStrign2 = new String("43");
        Double stringToDoble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        System.out.println(stringToInteger);
        System.out.println(stringToDoble);

        Number numero = Integer.valueOf(5);
        double numeroDoblePrim = numero.doubleValue(); //unboxing

        boolean falso = Boolean.FALSE;
    }
}
