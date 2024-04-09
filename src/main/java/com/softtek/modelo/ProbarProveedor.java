import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ProbarProveedor {
    public static Supplier<Integer> numeroAleatorio = () -> {
        Random random = new Random();
        int min = 1, max = 10;
        return random.nextInt(max - min + 1) + min;
    };

    public static Supplier<List<String>> listaPredefinida = () -> {
        return Arrays.asList("silla", "mesa", "ordenador");
    };

    public static Supplier<LocalDateTime> fechaHoraActual = () -> {
        return LocalDateTime.now();
    };

    public static Supplier<String> obtenerStringVacio = () -> {
        return new String();
    };

    public static Supplier<Configuracion> obtenerConfiguracion = () -> {
        return new Configuracion("IntelliJ/configuracion");
    };

    static class Configuracion {
        String rutaArchivo;

        public Configuracion(String rutaArchivo) {
            this.rutaArchivo = rutaArchivo;
        }
    }

    public static void main(String[] args) {
        System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio.get());
        System.out.println("Lista predefinida: " + listaPredefinida.get());
        System.out.println("Fecha y hora actual: " + fechaHoraActual.get());
        System.out.println("objeto String vacío: '" + obtenerStringVacio.get() + "'");
        Configuracion config = obtenerConfiguracion.get();
        System.out.println("ruta " + config.rutaArchivo);
    }
}
