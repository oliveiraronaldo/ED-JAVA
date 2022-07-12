import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Contato> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            Contato c = new Contato(nome, telefone, email);
            lista.add(c);
        }
        System.out.println(lista);
        sc.close();

    }
    
}
