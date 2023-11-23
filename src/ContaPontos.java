import java.util.List;

public class ContaPontos {
    static int contarPontos(List<Integer> numerosAleatorios, List<Integer> numerosDoUsuario) {
        int pontos = 0;
        for (int numero : numerosDoUsuario){
            if (numerosAleatorios.contains(numero)){
                pontos++;
            }
        }
        return pontos;
    }
}
