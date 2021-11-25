import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main (String [] args){
        List<Alumno> listaAlumnos = cargarLista();
        Map<String,Integer> mapAlumnos = listaAlumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.nombre + alumno.apellido,
            alumno -> Period.between(alumno.fechaDeNacimiento, LocalDate.now()).getYears()));
        System.out.println(mapAlumnos);
    }

    public static List<Alumno> cargarLista(){
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();
        alumno1.setData("Gimena", "Kut", "1985-08-16");
        alumno2.setData("Paula", "Lopez", "1992-12-18");
        alumno3.setData("Leandro", "Rodriguez", "1998-06-05");
        alumno4.setData("Romina", "Vidal", "1990-05-23");
        alumno5.setData("Juan", "Morante", "1993-01-30");
        List<Alumno> listaAlumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);
        return listaAlumnos;
    }
}
