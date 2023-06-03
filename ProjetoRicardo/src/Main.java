import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho,hash,pont,gols,jogos;
        String string,busca;
        float media;
        // Definindo o tamanho do vetor
        System.out.println("Tamanho Vetor: ");
        tamanho = scanner.nextInt();

        //instanciando e definindo o tamanho do vetor
        Vetor <String> vetor = new Vetor(tamanho);
        Vetor <Integer> vetorInt = new Vetor(tamanho);
        Vetor <Float> vetorFloat = new Vetor(tamanho);
        //inserindo dados
        for (int i = 0; i < tamanho; i++) {
            System.out.println("");
            System.out.print("Nome equipe: ");
            string = scanner.next();
            System.out.print("Pontuação: ");
            pont = scanner.nextInt();
            System.out.print("Quantidade gols: ");
            gols = scanner.nextInt();
            System.out.print("Total de jogos: ");
            jogos = scanner.nextInt();
            media = gols/jogos;
            vetor.hash(string);
            vetor.inserir(string);
            vetorInt.inseririInt(pont);
            vetorFloat.inserirFloat(media);
        }
        System.out.println("Time a ser buscado");
        busca = scanner.next();
       //3 vetor.buscar();
    }
}