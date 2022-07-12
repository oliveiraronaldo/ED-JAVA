public class App {
    public static void main(String[] args) throws Exception {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.empilhar(new No("R", null));
        pilha.empilhar(new No("O", null));
        pilha.empilhar(new No("N", null));
        pilha.empilhar(new No("A", null));
        pilha.empilhar(new No("L", null));
        pilha.empilhar(new No("D", null));
        pilha.empilhar(new No("O", null));
        pilha.imprimir();
    }
}
