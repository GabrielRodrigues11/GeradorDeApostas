import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeradorDeApostas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numerosAleatorios = GeraNumeros.gerarNumerosAleatorios(10, 1, 60);

        System.out.println("Os numeros aleatorios foram gerados\n");

        List<Integer> numerosDoUsuario = new ArrayList<>();

        System.out.println("Faça sua aposta de 10 numeros de 1 a 60");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            if (numero > 60 || numero < 1) {
                i = i-1;
                System.out.println("O numero deve ser maior que 1 e menor que 60");
            } else if (numerosDoUsuario.contains(numero)) {
                i = i-1;
                System.out.println("Numero ja digitado, insira outro número");
            }else {
                numerosDoUsuario.add(numero);
            }
        }

        System.out.println("\nOs 10 numeros foram inseridos com sucesso");

        int pontos = ContaPontos.contarPontos(numerosAleatorios,numerosDoUsuario);

        if (pontos == 10){
            System.out.println("\nParabéns! Você fez 10 pontos e faturou o grande prêmio!!");
        } else {
            System.out.println("\nSua pontuação foi: " + pontos);
        }
        Collections.sort(numerosAleatorios);
        Collections.sort(numerosDoUsuario);
        System.out.println(numerosAleatorios);
        System.out.println(numerosDoUsuario);
    }
}