public class pilha<T> {

    private T[] elementos;
    private int tamanho;

    public pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public pilha() {
        this(10);
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    public boolean empilhar(T elemento) {
        this.aumentarCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public T desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return null;
        }
        return this.elementos[--tamanho];

    }

    public T vazia() {
        if (estaVazia()) {
            return null;
        } else {
            while (tamanho > 0) {
                System.out.println("Desempilhando: " + elementos[tamanho - 1]);
                desempilhar();
            }
        }
        return (T) toString();

    }

    public int tamanho (){
        return tamanho;
    }

    private void aumentarCapacidade(){
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

}
