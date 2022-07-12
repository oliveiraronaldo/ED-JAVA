public class AlgoritmosSofisticadosOrd {

    public static void quicksort(int[] vetor){
            quicksort(vetor,0,vetor.length-1);
    }

    private static void quicksort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indicePivo = dividir(vetor, inicio, fim);
      /* Chamada recursiva para redivisao do vetor de elementos menores
        que o pivô. */
            quicksort(vetor, inicio, indicePivo - 1);
      /* Chamada recursiva para redivisao do vetor de elementos maiores
        que o pivô. */
            quicksort(vetor, indicePivo + 1, fim);
        }
    }

    /**
     * Método que ira dividir o vetor e encontrar o indice do pivô.
     * @param vetor - Vetor de inteiros
     * @param inicio - Indice inicial do vetor.
     * @param fim - Indice final do vetor.
     * @return O indice do pivo.
     */
    private static int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
      /* Vai correr o vetor ate que ultrapasse o outro indice do
      lado esquerdo ou ate que o elemento em questão
      seja menor que o pivô. */
            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

      /* Vai correr o vetor ate que ultrapasse o outro indice do lado direito
        que o elemento em questão seja maior que o pivô. */
            while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

      /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    /**
     * Método para trocar dois elementos de um vetor.
     *
     * @param vetor - Vetor de inteiros que tera seus elementos trocados.
     * @param i - Indice do elemento que sera trocado.
     * @param j - Indice do elemento que sera trocado.
     */
    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }




    public static void mergesort(int[] vetor){
        mergesort(vetor, new int[vetor.length],0, vetor.length-1);
    }

    private static void mergesort(int[] vetor, int[] temp, int esquerda, int direita){
        if(esquerda < direita){
            int meio = (esquerda+direita)/2;
            //divide da esquerda até o meio
            mergesort(vetor,temp,esquerda,meio);
            //divide do meio+1 até a direita
            mergesort(vetor,temp,meio+1,direita);
            //intercalar os elemento de forma ordenada
            merge(vetor,temp, esquerda, meio + 1, direita);
        }

    }

    //Combina duas lista ordenada em uma lista ordenada
    //temp: Vetor temporário
    //esquerda: índice a partir da esqueda
    //direita: indice começando da direita
    //meio: indice final direito
    private static void merge(int[] vetor, int[] temp, int esquerda, int direita, int indiceFinalDireita) {

        int indicefinalEsquerda =direita-1;
        int indiceTemp = esquerda;
        int elementoNumero = indiceFinalDireita-esquerda+1;

        while(esquerda <= indicefinalEsquerda && direita <= indiceFinalDireita){
            if(vetor[esquerda] <= vetor[direita]){
                temp[indiceTemp] = vetor[esquerda];
                //indiceTemp = indiceTemp + 1;
                indiceTemp++;
                esquerda++;
            }else{
                temp[indiceTemp] = vetor[direita];
                indiceTemp++;
                direita++;
            }
        }

        while(esquerda <= indicefinalEsquerda){ //se houve elemento à esquerda
            temp[indiceTemp] = vetor[esquerda];
            indiceTemp++;
            esquerda++;
        }

        while(direita <= indiceFinalDireita){
            temp[indiceTemp] = vetor[direita];
            indiceTemp++;
            direita++;
        }

        for (int i = 0; i < elementoNumero; i++) {
            vetor[indiceFinalDireita] = temp[indiceFinalDireita];
            indiceFinalDireita--;
        }

    }
}
