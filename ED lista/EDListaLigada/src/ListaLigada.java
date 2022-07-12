public class ListaLigada {

    private No cabeca;
    private No cauda;

    

    
    public void adicionar(No novoElemento){     // metodo adiciona no fim da lista
        if(cabeca == null){             //adiciona o primeiro elemento da lista
            this.cabeca = novoElemento;
            this.cauda = cabeca;
        }
        else{                       //adiciona caso a lista não esteja vazia
            cauda.setProx(novoElemento);
            this.cauda = novoElemento;
        }
        
    }

    public void adicionar(int posicao, No novoElemento){
        No aux = this.cabeca;       //auxiliar para nao mexer na "cabeça"
        int i = 0;
        while (aux.getProx() !=null && i < posicao-1) {        //verifica de cabeça esta vazia --- vai varrer a lista para achar a posição de inserir
            aux = aux.getProx();                            
            i++;
        }
        novoElemento.setProx(aux.getProx());
        aux.setProx(novoElemento);
    }

    public void removeUltimo(){
        No aux = this.cabeca;
        while(aux.getProx().getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(null);
        this.cauda = aux;
    }

    public void removePrimeiro(){
        this.cabeca = cabeca.getProx();
    }

    public void remove(int posicao){
        No aux = cabeca;
        int i = 0;
        while (aux.getProx() != null && i < posicao-1) {           //move o nó para a posicao anterior a que deseja excluir
            aux = aux.getProx();                    
            i++;
        }
        No temp = aux.getProx();            //no extra temporario ---- vai receber o No a ser removido que é o proximo do aux -- n é importante para o processo-- questao de formalidade
        aux.setProx(aux.getProx().getProx());      // seta o proximo do aux para ser o proximo do proximo dele, ou seja, pulou o elemento 
        temp.setProx(null);     // nao e importante para o processo -- questao de formalidade
    }


    public void imprimir(){
        No aux = cabeca;
        while(aux != null){
            System.out.print(aux.getDado() + " -> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n");
    }
    
}
