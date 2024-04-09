package presentacion;
import com.softtek.modelo.Calculadora;

public class ProbarCalculadora {
        public static void main(String[] args) {
            int a = 100;
            int b = 2;

            System.out.println("Suma: " + Calculadora.suma(a, b));
            System.out.println("Resta: " + Calculadora.resta(a, b));
            System.out.println("Multiplicación: " + Calculadora.multiplica(a, b));
            System.out.println("División: " + Calculadora.divide(a, b));
        }
    }

