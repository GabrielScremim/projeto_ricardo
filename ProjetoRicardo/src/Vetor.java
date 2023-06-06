public class Vetor<T> {

    private int tamanho;
    private T[] vetor;

    private int hash;

    public Vetor(int capacidade) {
        this.tamanho = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    public void inserir(T elemento) {
        this.vetor[hash] = elemento;
        System.out.println(hash);
    }

    public void mostrar(int i) {
        System.out.print(this.vetor[i] + ", ");
    }

    public void pesquisar() {
        System.out.print(this.vetor[hash] + ", ");
    }

    public void buscar(T chave) {
        int h = hash(chave.toString());
        if (this.vetor[h] != null && this.vetor[h].equals(chave)) {
            System.out.println("Elemento encontrado na posição " + h);
            System.out.println(this.vetor[h]);
        } else {
            System.out.println("Elemento não encontrado na tabela hash.");
        }
    }


    public void remove() {
        if (this.vetor[hash] != null) {
            this.vetor[hash] = null;
        } else {
            System.out.println("Elemento não encontrado na posição " + hash);
        }
    }

    public int hash(String string) {
        int p = 31; // número primo para calcular o hash
        int a = 17; // fator de multiplicação adicional
        for (int i = 0; i < string.length(); i++) {
            hash = (hash * p + (string.charAt(i) - 'a' + 1)) % this.tamanho;
            p = (p * a) % this.tamanho;
        }
        return hash;
    }
}
