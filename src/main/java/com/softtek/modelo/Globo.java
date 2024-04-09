package com.softtek.modelo;

public class Globo {
         private static int contadorGlobos = 0;
        private int id;

        public Globo() {
            contadorGlobos++;
            this.id = contadorGlobos;
        }

        public int getId() {
            return id;
        }
    }

