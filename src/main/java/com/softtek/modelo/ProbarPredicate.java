package com.softtek.modelo;

import java.util.function.Predicate;

public class ProbarPredicate {
    static Predicate<Integer> esPositivo = n -> n > 0;
    static Predicate<String> esNoVacia = s -> s != null && !s.isEmpty();
    static Predicate<Integer> esPar = n -> n % 2 == 0;
    static Predicate<Integer> esMayorQueOcho = n -> n > 8;
    static Predicate<Integer> esPrimo = n -> {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    };

    public static void main(String[] args) {
        System.out.println("5 es positivo? " + esPositivo.test(5));
        System.out.println("cadena no vacia? " + esNoVacia.test("Hola"));
        System.out.println("6 es un numero par? " + esPar.test(6));
        System.out.println("10 es mayor que 10? " + esMayorQueOcho.test(10));
        System.out.println("7 es primo? " + esPrimo.test(7));
    }
}
