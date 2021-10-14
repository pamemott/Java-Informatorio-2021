package EjerciciosComplementariosNivel1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
          System.out.println("Ingrese el primer Número: ");
          Scanner scan = new Scanner(System.in);
          int nro1= scan.nextInt();
          System.out.println("Ingrese el segundo Número: ");
          int nro2= scan.nextInt();

          System.out.println("LA SUMA ES: " + suma(nro1, nro2));
          System.out.println("LA RESTA ES: " + resta(nro1, nro2));
          System.out.println("LA MULTIPLICACION ES: " + multi(nro1, nro2));
          System.out.println("LA DIVISION ES: " + div(nro1, nro2));
          System.out.println("EL MODULO ES: " + mod(nro1, nro2));
          scan.close();
    }

    
public static int suma(int nro1, int nro2){
    return (nro1 + nro2);
}

public static int resta(int nro1, int nro2){
    return (nro1 - nro2);
}

public static int multi(int nro1, int nro2){
    return (nro1 * nro2);
}

public static int div(int nro1, int nro2){
    return (nro1 / nro2);
}

public static int mod(int nro1, int nro2){
    return (nro1 % nro2);
}
}
