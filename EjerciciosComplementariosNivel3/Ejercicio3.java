import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args){
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "BatGirl", "Wonder Woman", "brainiac");
        Long cont = palabras.stream()
        .filter(palabra -> palabra.startsWith("b")|| palabra.startsWith("B"))
        .count();
        System.out.println(cont);
    }
}
