public class TesteFilaEstatica {
    public static void main(String[] args) {
        FilaEstatica<String> fila = new FilaEstatica<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        System.out.println(fila);
        fila.inverter();
        System.out.println(fila);

    }
}
