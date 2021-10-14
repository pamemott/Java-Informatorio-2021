package EjerciciosComplementariosNivel2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
    ArrayList<String> baraja = new ArrayList<String>();

    for (int i=1; i<=10; i++){
        baraja.add(i+" de trébol");
    }
    for (int i=1; i<=10; i++){
        baraja.add(i+" de diamante");
    }
    for (int i=1; i<=10; i++){
        baraja.add(i+" de corazón");
    }
    for (int i=1; i<=10; i++){
        baraja.add(i+" de picas");
    }
    
    
    System.out.println("LOS VALORES DE LA BARAJA SON: ");
    System.out.println("BARAJA FRANCESA EN ORDEN CRECIENTE: ");
    System.out.println(baraja);
    System.out.println("BARAJA FRANCESA EN ORDEN DECRECIENTE: ");
    Collections.reverse(baraja);
    System.out.println(baraja);
    System.out.println("BARAJA FRANCESA DESORDENADA: ");
    Collections.shuffle(baraja);
    System.out.println(baraja);
    
    
}
}
