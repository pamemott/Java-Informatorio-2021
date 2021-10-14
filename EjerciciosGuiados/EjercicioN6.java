package EjerciciosGuiados;

import java.util.Scanner;

public class EjercicioN6 {
    
    public static void main (String[] args) {
        //creamos el objeto scanner que tomara los valore por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar ==1){
            System.out.println("Por favor, ingrese un número :");
            nro = scan.nextInt();
            System.out.println("El numero ingresado es: " +nro);

            System.out.println("Si desea continuar presione 1, sino cualquier otro nro");
            continuar = scan.nextInt(); //Escane el nro y lo asigna a la variable para evaluar luego si continua o no

        }
        scan.close();//cerramos el scanner si no lo usamos mas (buena practica)
    }
}
