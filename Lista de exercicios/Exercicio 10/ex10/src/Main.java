import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("isbn: ");
            String isbn = sc.nextLine();
            System.out.println("ano lancamento: ");
            int ano = sc.nextInt();
            sc.nextLine();
            System.out.println("nome autor: ");
            String autor = sc.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.empilhar(l);
        }
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());
        System.out.println(pilha.topo());
        System.out.println(pilha.empilhar(new Livro("livro bom", "ue", 2022, "machado de assis")));
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
    }
}
