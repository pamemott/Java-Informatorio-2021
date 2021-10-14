package EjerciciosComplementariosNivel2;
import java.util.ArrayList;


public class Ejercicio5 {
    public static void main(String[]args){
       
        ArrayList<Integer> horasTrab = new ArrayList<Integer>();
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();
        cargarValorHora(valorHora);
        cargarHoras(horasTrab);

        System.out.print("VALOR POR HORA TRABAJADA: ");
        System.out.println(valorHora);
        System.out.print("CANTIDAD DE HORAS TRABAJADAS EN LA SEMANA:");
        System.out.println(horasTrab); 
        
        int total=0;
        for (int i=0;i<5;i++){
            int subtotal= horasTrab.get(i)*valorHora.get(i);
            totales.add(subtotal);
            total=total+subtotal;
        }  
        System.out.print("TOTALES POR DIA:");   
        System.out.println(totales);
        System.out.println("TOTAL A COBRAR POR EL EMPLEADO: "+ "$ " + total);
        
    }

    public static ArrayList<Integer> cargarHoras(ArrayList<Integer> horasTrab){
        horasTrab.add(6);
        horasTrab.add(7);
        horasTrab.add(8);
        horasTrab.add(4);
        horasTrab.add(5);
        return horasTrab;
        
    }
    public static ArrayList<Integer> cargarValorHora(ArrayList<Integer> valorHora){
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);
        return valorHora;
        
    }
    
}
