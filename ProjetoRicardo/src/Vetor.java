public class Vetor<T> {

    private int tamanho;
    private T[] vetor;

    private int hash;

    public Vetor(int capacidade) {
        this.tamanho = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    //método para inserir dados no vetor
    public void inserir(T elemento) {
        this.vetor[hash] = elemento;
    }

    //método para consultar um índice na tabela
    public void consultar() {
        System.out.print(this.vetor[hash] + " | ");
    }

    //método para mostrar a tabela completa
    public void tabela(int i) {
        System.out.print(this.vetor[i] + " | ");
    }

    //método para pesquisar o time na tabela
    public void buscar(T chave) {
            if (this.vetor[hash] != null && this.vetor[hash].equals(chave)) {
                hash += 1;
                System.out.println(chave + " encontrado na posição " + hash);
            }else{
                System.out.println(chave + " não encontrado!");
            }
        }
    
    //método para remover dados de um indice da tabela
    public void remove() {
        if (this.vetor[hash] != null) {
            this.vetor[hash] = null;
        } else {
            System.out.println("Elemento não encontrado");
        }
    }

    //método para calcular o índice 
    public int hash(String string) {
        int a = 31; // qualquer numero primo
        for (int i = 0; i < string.length(); i++) {
            hash = (hash + string.charAt(i) * a);
        }
        hash %= this.tamanho;
        return hash;
    }
}