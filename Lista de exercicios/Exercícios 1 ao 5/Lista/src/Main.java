public class Main {
    public static void main(String[] args) throws Exception {
        

        
        Lista<Integer> lista = new Lista<>(5);
        lista.adiciona(23);
        lista.adiciona(24);
        lista.adiciona(26);
        lista.adiciona(26);
        lista.adiciona(27);
        System.out.println(lista.toString());
        System.out.println(lista.contem(23));  // exercicio 1
        System.out.println(lista.ultimaOcorrencia(26));  //exercicio 2
        lista.removerUltimo();
        System.out.println(lista.toString());       //exercicio 3
        lista.removerPrimeiro();
        System.out.println(lista.toString());       //exercicio 4
        lista.limpar();
        System.out.println(lista.toString());       //exercicio 5
       
    }
}
