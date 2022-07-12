import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class principal {
    public static void main(String[] args) throws Exception {
        pilha<Integer> pilha = new pilha<>();

        System.out.println("Pilha");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pilha.empilhar(numero);
            }else{
                if (pilha.estaVazia()) {
                    System.out.println("Pilha vazia");
                }else{
                    pilha.desempilhar();
                }
            }
        }
        System.out.println(pilha.toString());
        if(!pilha.estaVazia()){
            while(pilha.tamanho() > 0){
                System.out.println("Desempilhando: " + pilha.desempilhar());
            }
        }
        System.out.println(pilha.toString());
        sc.close();


    }
}
