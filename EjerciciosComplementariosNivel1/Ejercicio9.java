package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = scan.nextLine();
        char[] frase = texto.toCharArray();

        System.out.print("Ingrese la letra a buscar: ");
        String letra = scan.nextLine();
        char [] let = letra.toCharArray();
        char [] let2= letra.toCharArray();
        let2[0] = let[0];
        let2[0] &= 0x5f;

        int count =0;
        for (int i=0; i < texto.length(); i++){
            if (frase[i] == let[0] || frase[i] == let2[0]) {
                count += 1; 
            }
            
        }
        System.out.print("La letra buscada "+ let[0] + " esta presente " + count + " veces en el texto ingresado.");
        scan.close(); 

    }
    
}
