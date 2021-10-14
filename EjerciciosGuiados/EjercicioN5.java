package EjerciciosGuiados;

import java.util.Scanner;

public class EjercicioN5 {
    
    public static void main(String[] args) {
        //Creamos un objeto que tomara los valoes de entrada por conola
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt(); //Escanea el prroximo etero que es ingresado
        scan.close(); // Cerramos el scanner si no o usamos mas (buena practica)

        for (int i=1; i<=10; i++) {
            System.out.println(nro + " * " + i + " = " + nro*i);

        }
    }
}
