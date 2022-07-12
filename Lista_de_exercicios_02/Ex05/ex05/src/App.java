public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new No("A", null));
        lista.adicionar(new No("B", null));
        lista.adicionar(new No("C", null));
        lista.adicionar(new No("D", null));
        lista.adicionar(new No("E", null));
        System.out.println(lista.contem("H"));
        lista.imprimir();
    }
}
