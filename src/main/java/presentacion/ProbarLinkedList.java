package presentacion;

    import java.util.Collections;
    import java.util.LinkedList;
public class ProbarLinkedList {

    public static void main(String[] args) {
            LinkedList<String> nombres = new LinkedList<>();

            nombres.add("Ana");
            nombres.addFirst("Marcos");
            nombres.addLast("Carlos");
            nombres.addLast("Pepe");
            nombres.add(1, "David");

            System.out.println("Lista de nombres: " + nombres);

            String primerNombre = nombres.getFirst();
            String ultimoNombre = nombres.getLast();
            System.out.println("Primer nombre: " + primerNombre);
            System.out.println("Último nombre: " + ultimoNombre);

            nombres.set(2, "Eva");
            System.out.println("Lista actualizada: " + nombres);

            nombres.remove("David");
            nombres.removeFirst();
            System.out.println("Lista después de eliminar: " + nombres);

            boolean contieneEva = nombres.contains("Eva");
            System.out.println("¿Contiene Eva? " + contieneEva);
            Collections.sort(nombres);
            System.out.println("Lista después de sort: " + nombres);

    }
    }


