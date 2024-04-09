package presentacion;
import com.softtek.modelo.Persona;
import com.softtek.modelo.EstadoCivil;


public class ProbarPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marta", EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Celia", EstadoCivil.CASADO);
        Persona p3 = new Persona("Bryan", EstadoCivil.DIVORCIADO);
        Persona p4 = new Persona("Marcos", EstadoCivil.VIUDO);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}