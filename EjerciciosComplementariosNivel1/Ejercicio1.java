package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre por favor");
          Scanner scan = new Scanner(System.in);
          String name= scan.nextLine();
          System.out.println("HOLA " + name + "!");
          scan.close();
    }
    
}
