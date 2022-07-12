import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            if(numero == 0) {
                if (pilhaPar.estaVazia()) {
                    System.out.println("Pilha dos números pares vazia");
                } else {
                    pilhaPar.desempilhar();
                }

                if (pilhaImpar.estaVazia()) {
                    System.out.println("Pilha dos números impares vazia");
                } else {
                    pilhaImpar.desempilhar();
                }
            }else if(numero % 2 == 0){
                pilhaPar.empilhar(numero);
            }else{
                    pilhaImpar.empilhar(numero);
            }
        }
        System.out.println("Pilha Par");
        while (!pilhaPar.estaVazia()){
            System.out.println(pilhaPar.desempilhar());
        }

        System.out.println("Pilha Impar");
        while (!pilhaImpar.estaVazia()){
            System.out.println(pilhaImpar.desempilhar());
        }
    }
    
}
