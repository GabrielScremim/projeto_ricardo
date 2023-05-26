import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho,mod,pont,gols,jogos;
        String string;
        float media;
        // Definindo o tamanho do vetor
        System.out.println("Tamanho Vetor: ");
        tamanho = scanner.nextInt();

        //instanciando e definindo o tamanho do vetor
        Vetor <String> vetor = new Vetor(tamanho);
        Vetor <Integer> vetorInt = new Vetor(tamanho);
        Vetor <float> vetorFloat = new Vetor(tamanho);

        //inserindo dados
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Nome equipe: ");
            string = scanner.next();
            mod = string.length();
            System.out.println("Pontuação: ");
            pont = scanner.nextInt();
            vetor.inserir(string, mod);
            vetorInt.inseririInt(pont,mod);
            System.out.println("Quantidade gols: ");
            gols = scanner.nextInt();
            System.out.println("Total de jogos: ");
            jogos = scanner.nextInt();
            media = gols/jogos;
            vetor.inserir(string, mod);
            vetorInt.inseririInt(pont,mod);
            vetorFloat.inserirFloat(media,mod);
        }
    }
}