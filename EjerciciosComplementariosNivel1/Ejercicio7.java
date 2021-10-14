package EjerciciosComplementariosNivel1;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[]args){
        System.out.print("Por favor ingrese una palabra escrita en minúsculas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        char[] caracterArray = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++){
            caracterArray[i] &= 0x5f;
        }

        palabra = String.valueOf(caracterArray);

        System.out.println(palabra);
        scan.close();
    }
   
    
}
