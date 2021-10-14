package EjerciciosComplementariosNivel2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scan  = new Scanner(System.in);

        for (int i=1; i<=5;i++){
            System.out.print("INGRESE UN NUMERO PARA CARGAR: ");
            int nro = scan.nextInt();
            numeros.add(nro);
        }
        int tamaño= numeros.size();
        System.out.println("LOS NUMEROS INGRESADOS SON: ");
        System.out.println(numeros);
       
        System.out.print("INGRESE UN NUMERO PARA CARGAR AL INICIO: ");
        int nroi = scan.nextInt();
        numeros.add(0,nroi);
        System.out.println(numeros);
        System.out.print("INGRESE UN NUMERO PARA CARGAR AL FINAL: ");
        int nrof = scan.nextInt();
        numeros.add(nrof);
        System.out.println(numeros);
        for (Integer numero: numeros){
            System.out.print(numero + " ");
        }
        System.out.println(" ");
        System.out.println("TAMAÑO DE LA LISTA ANTES DE AGREGAR ELEMENTOS: " + tamaño);
        System.out.println("TAMAÑO DE LA LISTA DESPUES DE AGREGAR ELEMENTOS: " + numeros.size());
        
        scan.close();
      
    }  

    
}
