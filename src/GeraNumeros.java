import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeraNumeros {
    static List<Integer> gerarNumerosAleatorios(int quantidade, int min, int max) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = min; i <= max; i++){
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        return numeros.subList(0, quantidade);
    }
}
