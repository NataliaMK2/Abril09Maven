package com.softtek.modelo;

public class Calculadora {
        public static int suma(int a, int b) {
            return a+b;
        }

        public static int resta(int a, int b) {
            return a-b;
        }

        public static int multiplica(int a, int b) {
            return a*b;
        }

        public static double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("El divisor no puede ser cero");
            }
            return (double) a / b;
        }
    }


