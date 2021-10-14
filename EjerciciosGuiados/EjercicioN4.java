package EjerciciosGuiados;

import java.util.Scanner;

public class EjercicioN4 {
    
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara de entrada por consola
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt(); //Escanea el proximo entero que es ingresado
        scan.close(); //cerramos el scanner si no lo usamos mas (buena practica)

        switch (dia) {
            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
}
