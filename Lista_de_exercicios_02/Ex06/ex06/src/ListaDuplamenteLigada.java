public class ListaDuplamenteLigada {

    private No cabeca;
    private No cauda;

    //metodo que adiciona no final da lista
    public void adicionar(No novoElemento){
        if(this.cabeca == null){
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        }else{
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }
//metodo adiciona onde informamos a posição da inserção
    public void adicionar(int posicao, No novoElemento){
        No aux = cabeca;
        int i = 0;

        //mova o nó para a posição de inserção
        while(aux.getProx() != null && i < posicao-1){
            aux = aux.getProx();
            i++;
        }

        novoElemento.setProx(aux.getProx());
        aux.setProx(novoElemento);
        novoElemento.setAnt(aux);
        novoElemento.getProx().setAnt(novoElemento);
    }

    public void remove(int posicao){
        No aux = cabeca;
        int i = 0;
        //Mova o nó para o nó anterior que deseja excluir
        while (aux.getProx() != null && i <posicao-1){
            aux = aux.getProx();
            i++;
        }

        No temp = aux.getProx();
        aux.setProx((aux.getProx()).getProx());
        aux.getProx().setAnt(aux);
        temp.setProx(null);
        temp.setAnt(null);

        if(aux.getProx() == null){
            cauda = aux;
        }
    }

    public void removeUltimo (){
        No aux = cauda;
        this.cauda.getAnt().setProx(null);
        this.cauda = this.cauda.getAnt();
        aux.setAnt(null);
        aux.setDado(null);


    }

    public void print(){
        No aux = this.cabeca;
        //No fim = null;
        //imprimir do início ao fim
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            //fim = aux;
            aux = aux.getProx();
        }
        System.out.print("Fim\n\n");
        //  aux = cauda;
        // while(aux != null){
        //     String dado = aux.getDado();
        //     System.out.print(dado + "->");
        //     aux = aux.getAnt();
        // }
        // System.out.print("Inicio\n\n");

    }

}
