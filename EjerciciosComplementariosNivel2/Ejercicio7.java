package EjerciciosComplementariosNivel2;
import java.util.Scanner;
import java.util.ArrayList;



public class Ejercicio7 {
    public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese el valor Inicial:");
    Integer base= scan.nextInt();
    System.out.print("Ingrese el valor Final:");
    Integer tope= scan.nextInt();
    scan.close();
    if (base < tope){
        ArrayList<String> salida = new ArrayList<String>();
       salida = fizzBuzzFuncion(base,tope);
        
        System.out.println(salida);
    }else{System.out.print("EL PRIMER NUMERO: " + base + " DEBE SER MAYOR AL SEGUNDO: "+ tope);}
    
    }
    public static ArrayList<String> fizzBuzzFuncion  (Integer base, Integer tope){
        ArrayList<String> salida = new ArrayList<String>();
        for (int i=base;i<tope;i++){
             if(i % 2 == 0 && i % 3 ==0){
                salida.add("FIZZBUZZ");
            }else if(i % 2 == 0){
                salida.add("FIZZ");
            }else if(i % 3 == 0){
                salida.add("BUZZ");
            }else {salida.add(String.valueOf(i));
        }
        }
        return salida;
    }
}
