package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        int nro2 = scan.nextInt();
        System.out.println("LA POTENCIA ENTRE: " + nro1 + " y "+ nro2 + " ES: " + potencia(nro1, nro2));
        scan.close();
    }

    public static int potencia (int nro1, int nro2){
        int valor=1;
        if (nro1 <= nro2){
            for (int i=1; i<=nro1; i++){

                valor=valor*nro2;
            }

        }
        else{
            for (int i=1; i<=nro2; i++){
                valor=valor*nro1;
            }

        }
        return valor;
    }
}
    
