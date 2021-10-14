package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("INGRESE UN NUMERO: ");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        System.out.println("");
        scan.close();

        for (int i = 1; i<=nro; i++){

            for (int j = 1; j<=i; j++){
                System.out.print(j + " ");
    
            }
            System.out.println("");
        }
    }

    
}
