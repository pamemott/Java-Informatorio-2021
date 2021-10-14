package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.print("Ingrese el Nombre y Apellido de la persona: ");
        String nomyap = scan.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        Integer edad = scan.nextInt();
        System.out.print("Ingrese la dirección de la persona: ");
        String dir = scan.nextLine();
        System.out.print("Ingrese la ciudad de la persona: ");
        String ciudad = scan.nextLine();
        System.out.println(" ");
       
        persona.setCiudad(ciudad);
        persona.setDir(dir);
        persona.setNomyap(nomyap);
        persona.setEdad(edad);

        System.out.println(persona.getCiudad() + " - " + 
                           persona.getDir() + " - " +
                           persona.getEdad() + " - " +
                           persona.getNomyap()); 
        scan.close();
    }
}
