package lab02exer02;

/**
 *
 * @author luana
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação da classe Televisao
        Televisao tv = new Televisao();

        // Pergunta ao usuário sobre os parâmetros da TV
        System.out.print("Digite o modelo da TV: ");
        String modelo = scanner.nextLine();
        tv.setModelo(modelo);

        System.out.print("Digite o preço da TV: ");
        float preco = scanner.nextFloat();
        tv.setPreco(preco);

        System.out.print("Digite o tamanho da TV (em polegadas): ");
        float tamanho = scanner.nextFloat();
        tv.setTamanho(tamanho);

        System.out.print("Digite o volume inicial da TV (0 a 100): ");
        int volume = scanner.nextInt();
        tv.setVolume(volume);

        System.out.print("Digite o canal inicial da TV: ");
        int canal = scanner.nextInt();
        tv.setCanal(canal);

        System.out.print("A TV está ligada? (true/false): ");
        boolean ligada = scanner.nextBoolean();
        tv.setLigada(ligada);

        // Exemplo de uso dos métodos
        if (ligada) {
            System.out.print("Digite o valor para alterar o volume: ");
            int alteracaoVolume = scanner.nextInt();
            tv.alteraVolume(alteracaoVolume);

            System.out.print("Digite o valor para alterar o canal (+1 ou -1): ");
            int alteracaoCanal = scanner.nextInt();
            tv.alteraCanal(alteracaoCanal);
        } else {
            System.out.println("A TV está desligada. Não é possível alterar o volume ou canal.");
        }

        // Desligar a TV
        tv.desligar();
        System.out.println("A TV foi desligada.");

        scanner.close();
    }
}
