package com.softtek.modelo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

    public class ProbarFunctionCalculo {

         class Stats {
            double min;
            double max;
            double media;

            public Stats(double min, double max, double media) {
                this.min = min;
                this.max = max;
                this.media = media;
            }

            @Override
            public String toString() {
                return "min=" + min + ", max=" + max + ", media=" + media;
            }
        }

        private void calcularEstadisticas() {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            Function<List<Integer>, Stats> fx = lista -> {
                double min = lista.stream().mapToInt(i -> i).min().getAsInt();
                double max = lista.stream().mapToInt(i -> i).max().getAsInt();
                double media = lista.stream().mapToInt(i -> i).average().getAsDouble();

                return new Stats(min, max, media);
            };

            Stats estadisticas = fx.apply(numeros);

            System.out.println(estadisticas);
        }

        public static void main(String[] args) {
            ProbarFunctionCalculo app = new ProbarFunctionCalculo ();
            app.calcularEstadisticas();
        }
    }

