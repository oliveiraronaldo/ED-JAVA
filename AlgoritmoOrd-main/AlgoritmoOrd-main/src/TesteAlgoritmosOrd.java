public class TesteAlgoritmosOrd {

    public static void main(String[] args) {
        //int[] vetor = {60,50,95,80,70};
        //int[] vetor = {60,80,95,50,70};
        //int[] vetor = {80,70,60,50,95};
        //int[] vetor = {90,60,50,80,70,100};
        int[] vetor = {50,65,99,87,74,63,76,100};
        //int[] temp = new int[8];

        //vetor = new int[15000];

        //AlgoritmoSimplesOrd.bubbleSort(vetor);
        //AlgoritmoSimplesOrd.selectionSort(vetor);
        //AlgoritmoSimplesOrd.insertionSort(vetor);

        AlgoritmosSofisticadosOrd.quicksort(vetor);
        //AlgoritmosSofisticadosOrd.mergesort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ",");
        }
    }
}
