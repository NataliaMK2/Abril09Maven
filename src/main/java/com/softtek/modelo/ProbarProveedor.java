package com.softtek.modelo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProbarProveedor {
        public static int numeroAleatorio(int min, int max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        }

        public static List<String> listaPredefinida() {
            return Arrays.asList("silla", "mesa", "ordenador");
        }

        public static LocalDateTime fechaHoraActual() {
            return LocalDateTime.now();
        }

        public static String obtenerStringVacio() {
            return new String();
        }

        public static Configuracion obtenerConfiguracion() {
            return new Configuracion("IntelliJ/configuracion");
        }

        static class Configuracion {
            String rutaArchivo;

            public Configuracion(String rutaArchivo) {
                this.rutaArchivo = rutaArchivo;
            }

        }

        public static void main(String[] args) {
            System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio(1, 10));
            System.out.println("Lista predefinida: " + listaPredefinida());
            System.out.println("Fecha y hora actual: " + fechaHoraActual());
            System.out.println("objeto String vacío: '" + obtenerStringVacio() + "'");
            Configuracion config = obtenerConfiguracion();
            System.out.println("ruta " + config.rutaArchivo);

    }
}
