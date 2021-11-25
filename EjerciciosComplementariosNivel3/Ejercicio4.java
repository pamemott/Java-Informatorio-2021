import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(1,2,4,4,4);
        List<Integer> otrosNumeros = numeros.stream()
            .map(num -> factorial(num))
            .distinct()
            .collect(Collectors.toList());
        System.out.println(otrosNumeros);

    }
    public static int factorial (int num){
        if (num == 0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
