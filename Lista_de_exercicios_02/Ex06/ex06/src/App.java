public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        lista.adicionar(new No("A", null, null));
        No novoElemento = new No("B", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("C", null, null));
        lista.adicionar(new No("D", null, null));
        lista.adicionar(new No("E", null, null));
        lista.print();
        lista.removeUltimo();
        lista.print();
    }
}
