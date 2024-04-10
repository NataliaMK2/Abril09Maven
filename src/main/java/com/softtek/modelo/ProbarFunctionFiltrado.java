package com.softtek.modelo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

    public class ProbarFunctionFiltrado {

        private void filtrarPares() {
            List<Integer> numeros = Arrays.asList(1, 3,2,5,3,7,6,9,8,10);

            Function<List<Integer>, List<Integer>> fx = lista -> lista.stream()
                    .filter(num -> {
                        Function<Integer, Boolean> esPar = n -> n % 2 == 0;
                        return esPar.apply(num);
                    })
                    .collect(Collectors.toList());

            List<Integer> pares = fx.apply(numeros);

            System.out.println(pares);
        }

        public static void main(String[] args) {
            ProbarFunctionFiltrado app = new ProbarFunctionFiltrado();
            app.filtrarPares();
        }
    }
