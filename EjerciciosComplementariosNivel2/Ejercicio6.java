package EjerciciosComplementariosNivel2;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Boolean option = false;
        Set<Employee> empSet = new HashSet<Employee>();

        while (option == false){
            empSet.add(loadEmployees(scan));
            System.out.print("¿Desea ingresar otro empleado? 1 / 0: ");
            int opt = scan.nextInt();
            if (opt == 0){
                option = true;
            }
        }

        Map<Integer, Integer> empMap =  new HashMap<Integer, Integer>();
        for (Employee emp: empSet){
            empMap.put(emp.getDni(), (emp.getValue()*emp.getHours()));
            System.out.println("Emmpleado: " + emp.getDni() + " - Sueldo: " + (emp.getValue()*emp.getHours()));
        }

        scan.close();
    }

    public static Employee loadEmployees(Scanner scan){
            Employee emp = new Employee();
            System.out.print("Ingrese DNI: ");
            emp.setDni(scan.nextInt());
            System.out.print("Ingrese Nombre: ");
            scan.nextLine();
            emp.setName(scan.nextLine());
            System.out.print("Ingrese cantidad de horas trabajadas: ");
            emp.setHours(scan.nextInt());
            System.out.print("Ingrese valor por hora: ");
            emp.setValue(scan.nextInt());

        return emp;
    }
}