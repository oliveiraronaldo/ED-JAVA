import java.util.Arrays;
import java.util.Random;

public class TesteTempoExecucao {

    public static void main(String[] args) {

        int tamanho = 100000;

        int[] vetorDesordenado = new int[tamanho];
        
        Random rand = new Random();

        for (int i = 0; i < vetorDesordenado.length; i++) {
            vetorDesordenado[i] = rand.nextInt(tamanho);
        }

        //copia o vetor de elementos desordenados para um outro vetor
        int[] vetorBolha = Arrays.stream(vetorDesordenado).toArray();
        //pega o tempo que algoritmo inicia
        long tempoInicialBolha = System.currentTimeMillis();
        AlgoritmoSimplesOrd.bubbleSort(vetorBolha);
        //pega o tempo que algoritmo termina
        long tempoFinalBolha = System.currentTimeMillis();

        long tempoExecucaoBolha = tempoFinalBolha - tempoInicialBolha;

        System.out.printf("Tempo de execução do algoritmo Bolha: %.3f ms%n\n",tempoExecucaoBolha/1000d);
        /*System.out.println("Vetor do Algoritmo bolha");
        for (int valor : vetorBolha) {
            System.out.print(valor + ",");
        }*/

        int[] vetorSelection = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialselection = System.currentTimeMillis();
        AlgoritmoSimplesOrd.selectionSort(vetorSelection);
        long tempoFinalSelection = System.currentTimeMillis();
        long tempoExecucaoSelection = tempoFinalSelection - tempoInicialselection;
        System.out.printf("Tempo de execução do algoritmo SelectionSort: %.3f ms%n\n",tempoExecucaoSelection/1000d);

        int[] vetorInsertion = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialInsertion = System.currentTimeMillis();
        AlgoritmoSimplesOrd.insertionSort(vetorInsertion);
        long tempoFinalInsertionn = System.currentTimeMillis();
        long tempoExecucaoInsertion = tempoFinalInsertionn - tempoInicialInsertion;
        System.out.printf("Tempo de execução do algoritmo InsertionSort: %.3f ms%n\n",tempoExecucaoInsertion/1000d);

        int[] vetorQuickSort = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialQuickSort = System.currentTimeMillis();
        AlgoritmosSofisticadosOrd.quicksort(vetorQuickSort);
        long tempoFinalQuickSort = System.currentTimeMillis();

        long tempoExecucaoQuickSort = tempoFinalQuickSort - tempoInicialQuickSort;

        System.out.printf("Tempo de execução do algoritmo quickSort: %.3f ms%n\n",tempoExecucaoQuickSort/1000d);
        /*System.out.println("Vetor do Algoritmo QuickSort");
        for (int valor : vetorBolha) {
            System.out.print(valor + ",");
        }*/

        int[] vetorMergeSort = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialMergeSort = System.currentTimeMillis();
        AlgoritmosSofisticadosOrd.mergesort(vetorMergeSort);
        long tempoFinalMergeSort = System.currentTimeMillis();

        long tempoExecucaoMergeSort = tempoFinalMergeSort - tempoInicialMergeSort;

        System.out.printf("Tempo de execução do algoritmo MergeSort: %.3f ms%n\n",tempoExecucaoMergeSort/1000d);

    }
}
