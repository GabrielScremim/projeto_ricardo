import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, pont, gols, jogos, pesq = 0;
        String string, chave;
        float media;
        // Definindo o tamanho do vetor
        System.out.print("Tamanho Vetor: ");
        tamanho = scanner.nextInt();

        //instanciando e definindo o tamanho do vetor
        Vetor<String> vetor = new Vetor(tamanho);
        Vetor<Integer> vetorInt = new Vetor(tamanho);
        Vetor<Float> vetorFloat = new Vetor(tamanho);
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
            media = gols / jogos;
            vetor.hash(string);
            vetor.inserir(string);

            vetorInt.hash(string);
            vetorInt.inserir(pont);

            vetorFloat.hash(string);
            vetorFloat.inserir(media);
        }
        while (pesq != 4) {
            System.out.println(" ");
            System.out.println("1-Buscar");
            System.out.println("2-Remover");
            System.out.println("3-Mostrar Tabela Completa");
            System.out.println("4-Sair");
            pesq = scanner.nextInt();

            if (pesq == 1) {
                System.out.print("Time a ser buscado: ");
                chave = scanner.next();
                vetor.buscar(chave);

            } else if (pesq == 2) {
                System.out.println("Time a ser removido");
                chave = scanner.next();

                System.out.print("Time = ");
                vetor.hash(chave);
                vetor.remove();

                System.out.print("Pontuação = ");
                vetorInt.hash(chave);
                vetorInt.remove();

                System.out.print("Média de gols = ");
                vetorFloat.hash(chave);
                vetorFloat.remove();

            }else if (pesq ==3){
                System.out.print("Time: ");
                for (int i = 0; i < tamanho; i++) {
                    vetor.mostrar(i);
                }
                System.out.println(" ");
                System.out.print("Pontuação: ");
                for (int i = 0; i < tamanho; i++) {
                    vetorInt.mostrar(i);
                }
                System.out.println(" ");
                System.out.print("Média de gols: ");
                for (int i = 0; i < tamanho; i++) {
                    vetorFloat.mostrar(i);
                }
            } else {
                System.out.println("thanks!");
            }
        }
    }
}