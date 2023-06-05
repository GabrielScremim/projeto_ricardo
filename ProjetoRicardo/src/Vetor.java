public class Vetor<T> {

    private int tamanho;
    private T[] vetor;

    private int hash;

    public Vetor(int capacidade) {
        this.tamanho = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    public void inserir(T string) {
        this.vetor[hash] = string;
        System.out.print("Time: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void inseririInt(T pont) {
        this.vetor[hash] = pont;
        System.out.println("");
        System.out.print("Pontuação: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void inserirFloat(T media) {
        this.vetor[hash] = media;
        System.out.println("");
        System.out.print("Média gols: ");
        //mostrando o vetor
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " , ");
        }
    }

    public void mostrar() {
        System.out.println(this.vetor[hash]);
    }

    public void mostrarInt() {
        System.out.println(this.vetor[hash]);
    }


    public void mostrarFloat(){
        System.out.println(this.vetor[hash]);
    }
    public void buscar(T chave) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.vetor[i] != null && this.vetor[i].equals(chave)) {
                System.out.println("Elemento encontrado:  ");
                return;
            }
        }
        System.out.println("Elemento não encontrado na tabela hash.");
    }

    public void remove() {
        if (this.vetor[hash] != null) {
            this.vetor[hash] = null;
            System.out.println("Elemento removido com sucesso.");
            //mostrando o vetor após remoção
            for (int i = 0; i < this.tamanho; i++) {
                System.out.print(this.vetor[i] + " , ");
            }
        } else {
            System.out.println("Elemento não encontrado na posição " + hash);
        }
    }

    public int hash(String string) {
        int a = 31; // qualquer numero primo
        for (int i = 0; i < string.length(); i++) {
            hash = (a * hash + string.charAt(i));
        }
        hash %= this.tamanho;
        return hash;
    }
}



