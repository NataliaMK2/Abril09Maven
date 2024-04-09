package com.softtek.modelo;

public class Persona {
        private String nombre;
        private EstadoCivil estadoCivil;

        public Persona(String nombre, EstadoCivil estadoCivil) {
            this.nombre = nombre;
            this.estadoCivil = estadoCivil;
        }

        @Override
        public String toString() {
            return "nombre=" + nombre +", estadoCivil=" + estadoCivil;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Persona persona = (Persona) o;
            return nombre.equals(persona.nombre) &&
                    estadoCivil == persona.estadoCivil;
        }
    }
