public class FilaDinamica {

    //Funcionamento da estrutura sempre o primeiro a entrar será o primeiro a sair.
    // FIFO -> First in, First out

    private No cabeca;
    private No cauda;
    private int tamanho; //tamanho da fila

    //estrutura de dados sempre insere no final da final, ou seja na cauda
    public void enfileirar(No novoElemento){
        //se a fila estiver vazia
        if(cabeca == null){
            cabeca = novoElemento; //adicionar o elemento na cabeça
            cauda = cabeca;
        }else{
            novoElemento.setProx(cauda.getProx());
            novoElemento.setAnt(cauda);
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
        //tamanho = tamanho+1
        tamanho++;
    }


    //pegue o primeiro elemento e remove da fila.
    public No desenfileirar(){
        No aux = cabeca;
        if(aux == null){
            return null;
        }

        cabeca = cabeca.getProx();
        cabeca.setAnt(null);
        aux.setAnt(null);
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void imprimir(){
        No aux = cabeca;
        while (aux != null ){
            System.out.print("[" + aux.getData() + "] ");
            aux = aux.getProx();
        }
        System.out.println();
        aux = cauda;
        while(aux != null){
            System.out.print("[" + aux.getData() + "] ");
            aux = aux.getAnt();
        }
    }

}
