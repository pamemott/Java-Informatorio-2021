package EjerciciosComplementariosNivel2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        cargarCiudades(ciudades);
        scan.close();   

        Integer cont=1;
        for (String ciudad: ciudades) {
            System.out.println("#" + cont + " " + ciudad);
            cont=cont+1;
        }

    }
    public static void cargarCiudades(List<String> ciudades){
        ciudades.add("BARILOCHE");
        ciudades.add("CÓRDOBA");
        ciudades.add("RESISTENCIA");
    }
   
}
