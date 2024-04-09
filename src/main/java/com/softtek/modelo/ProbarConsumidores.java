package com.softtek.modelo;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarConsumidores {
    static Consumer<String> mayusculas = s -> System.out.println(s.toUpperCase());
    static Consumer<Integer> numeroYCuadrado = n -> System.out.println(n + " al cuadrado es " + (n * n));
    static Consumer<Producto> detallesProducto = p -> System.out.println("Nombre: " + p.getNombre() + ", Precio: " + p.getPrecio());
    static Consumer<String> mensajeEnDialogo = s -> JOptionPane.showMessageDialog(null, s);
    static Consumer<String> escribirArchivoRegistro = s -> {
        try (FileWriter writer = new FileWriter("registro.txt", true)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    };

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
    }

    public static void main(String[] args) {
        mayusculas.accept("Hola mundo");
        numeroYCuadrado.accept(2);
        detallesProducto.accept(new Producto("Camiseta", 19.95));
        mensajeEnDialogo.accept("¡Hola, mundo!");
        escribirArchivoRegistro.accept("Evento: el usuario ejecutó este archivo");
    }
}
