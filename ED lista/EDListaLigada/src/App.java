public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        No novoElemento = new No("A", null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null));
        lista.adicionar(new No("C", null));
        lista.adicionar(new No("D", null));
        lista.imprimir();
        lista.remove(1);
        lista.imprimir();
        novoElemento = new No("E", null);
        lista.adicionar(2, novoElemento);       // a partir da posição 1 no caso ele vai inserir novo elemento
        lista.imprimir();
        lista.remove(2);
        lista.imprimir();
        lista.removeUltimo();
        lista.imprimir();
        lista.removePrimeiro();
        lista.imprimir();
        

    }
}
