package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        int nro2 = scan.nextInt();
        System.out.println("EL PRODUCTO ENTRE: " + nro1 + " y "+ nro2 + " ES: " + suma(nro1, nro2));
        scan.close();
    }

    public static int suma (int nro1, int nro2){
        int valor=0;
        if (nro1 <= nro2){
            for (int i=1; i<=nro1; i++){

                valor=valor+nro2;
            }

        }
        else{
            for (int i=1; i<=nro2; i++){
                valor=valor+nro1;
            }

        }
        return valor;
    }
}
