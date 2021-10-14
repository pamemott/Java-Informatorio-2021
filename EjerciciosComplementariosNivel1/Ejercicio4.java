package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("INGRESE UN NUMERO: ");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        System.out.println("EL FACTORIAL DEL NUMERO INGRESADO ES: " + factorial(nro));
        scan.close();

    }
    
    public static int factorial(int nro){
        if (nro == 0){
            return 1;
        }
        else{
            return nro * factorial(nro - 1);
        }
    }
}
