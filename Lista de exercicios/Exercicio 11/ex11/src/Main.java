import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
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
            pilha.push(l);
        }
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha.peek());
        System.out.println(pilha.push(new Livro("livro otimo", "ue", 2022, "ronaldo")));
        System.out.println(pilha.pop());
        System.out.println(pilha);
    }
}
