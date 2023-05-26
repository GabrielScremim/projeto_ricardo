public class Vetor<T> {

    private int tamanho;
    private T[] vetor;

    private int mod;

    public Vetor(int capacidade) {
        this.tamanho = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    public void inserir(T string, int mod) {
        mod = mod%tamanho;
        this.vetor[mod] = string;
        System.out.print("Time: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void inseririInt(T pont, int mod) {
        mod = mod%tamanho;
        this.vetor[mod] = pont;
        System.out.println("");
        System.out.print("Pontuação: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void inserirFloat(T media,int mod) {
        mod = mod%tamanho;
        this.vetor[mod] = media;
        System.out.println("");
        System.out.print("Média gols: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void buscar(String chave) {

    }

    public void remove(int mod, T remove) {

    }
}


