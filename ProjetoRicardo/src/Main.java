import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, pont, gols, jogos, pesq = 0;
        String string, chave;
        float media;

        // Definindo o tamanho do vetor
        System.out.print("Quantidade de times: ");
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
        //menu para buscar, remover ou mostrar a tabela
        while (pesq != 4) {
            System.out.println(" ");
            System.out.println("1-Buscar");
            System.out.println("2-Remover");
            System.out.println("3-Mostrar Tabela Completa");
            System.out.println("4-Sair");
            pesq = scanner.nextInt();

            //buscar time
            if (pesq == 1) {
                System.out.print("Time a ser buscado: ");
                chave = scanner.next();
                vetor.hash(chave);
                vetor.buscar(chave);

            // remover time
            } else if (pesq == 2) {
                System.out.println("Time a ser removido: ");
                chave = scanner.next();

                for (int i = 0; i < 1; i++) {
                    System.out.println(" ");
                    System.out.println("Elemento a ser removido:");
                    System.out.print("Time = ");
                    vetor.hash(chave);
                    vetor.consultar();
                    vetor.remove();

                    System.out.print("Pontuação = ");
                    vetorInt.hash(chave);
                    vetorInt.consultar();
                    vetorInt.remove();

                    System.out.print("Média de gols = ");
                    vetorFloat.hash(chave);
                    vetorFloat.consultar();
                    vetorFloat.remove();
                }
            //mostrar tabela completa
            }else if (pesq ==3){
                System.out.println("Time | " + "Pontuação | " + "Média de gols |");
                for (int i = 0; i < tamanho; i++) {
                    vetor.tabela(i);
                    vetorInt.tabela(i);
                    vetorFloat.tabela(i);
                    System.out.println("");
                }
            //finalizar
            }else if(pesq == 4){
                System.out.println("Thanks");
            } else {
                System.out.println("Tente novamente!");
            }
        }
    }
}