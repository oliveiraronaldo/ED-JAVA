public class pricipal {
    public static void main(String[] args) {


    pilha<String> pilha = new pilha<>(3);   
    
    System.out.println("pilha");
    pilha.empilhar("A");
    pilha.empilhar("B");
    pilha.empilhar("C");
    pilha.empilhar("D");
    pilha.empilhar("E");
    pilha.empilhar("F");
    System.err.println("O topo da pilha é " + pilha.topo());
   // String elem = pilha.desempilhar();
    System.out.println("O elemento removido da pilha foi: " + pilha.desempilhar());
    System.out.println("O topo da pilha agora é " + pilha.topo());
    System.out.println(pilha.toString());
    pilha.empilhar("Z");
    System.out.println("O topo da pilha agora é " + pilha.topo());
    System.out.println(pilha.toString());

    }
    
}
