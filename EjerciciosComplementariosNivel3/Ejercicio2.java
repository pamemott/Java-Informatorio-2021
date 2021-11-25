import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(1,2,3,4,5);
        List<Integer> potenciaStream = numeros.stream()
        .map(nro -> nro * nro).collect(Collectors.toList());
        System.out.println(potenciaStream);
    }
}
