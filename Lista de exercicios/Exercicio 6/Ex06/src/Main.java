import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Lista<Contato> lista = new Lista<>(20);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            Contato c = new Contato(nome, telefone, email);
            lista.adiciona(c);
        }
        System.out.println(lista);
        sc.close();

    }
}
