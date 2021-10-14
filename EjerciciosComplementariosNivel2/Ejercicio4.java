package EjerciciosComplementariosNivel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
    ArrayList<String> alumnos = new ArrayList<String>();
    Scanner scan= new Scanner(System.in);

    
    for(int i=0; i<=11;i++){
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO: ");
         String alu = scan.nextLine();
         alumnos.add(alu);
            
     }
    ArrayList<String> curso1 = new ArrayList<String>(alumnos.subList(0, 4));
    ArrayList<String> curso2 = new ArrayList<String>(alumnos.subList(4, 8));
    ArrayList<String> curso3 = new ArrayList<String>(alumnos.subList(8, 12));
    mostrarCurso(curso1,1);
    mostrarCurso(curso2,2);
    mostrarCurso(curso3,3);
    scan.close();
    
}


public static void mostrarCurso(ArrayList<String> curso, Integer numero){
    System.out.println("LISTA DE ALUMNOS: " + "CURSO: " + numero);
    for (String alumno : curso){
        System.out.println(alumno);   
    } 
}
} 