import java.rmi.server.ObjID;
@SuppressWarnings("unchecked")
public class FilaEstatica <T> {

    protected T[] elementos;
    protected int tamanho;

    public FilaEstatica(int capacidade){        //metodo construtor
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;
    }

    public FilaEstatica(){
        this(10);
    }// ate aqui padrão

    public boolean estaVazia(){     //verifica se esta vazia
        return this.tamanho == 0;
    }

    public boolean enfileirar(T elemento){ //metodo para enfileirar
        this.aumentarCapacidade();     
        if(this.tamanho < this.elementos.length){       // verifica se esta cheio
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;                     //incremento ate encher
            return true;
        }
        return false;
    }

    protected boolean enfileirar(int posicao, T elemento){          //fila de prioridades
        if(posicao < 0 || posicao > tamanho){
            throw new IllegalArgumentException("Posição invalida");
        }

        aumentarCapacidade();

        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public T espiar(){          //olha o primeiro elemento da fila caso nao esteja vazia
        if(estaVazia()){
            return null;
        }
        return this.elementos[0];           //retorna o primeiro elemento
    }

    public T desenfileirar(){           //remove um elemento e avança uma posição em cada elemento restante
        final int POS = 0; // valor de POS sempre vai ser 0                

        if(estaVazia()){                // caso não esteja vazia
            return null;
        }
         T elementoRemovido = this.elementos[POS];
        for (int i = 0; i < tamanho-1; i++) {           //muda todos os elementos restantes de posição
            this.elementos[i] = this.elementos[i+1];    
            
        }
        this.tamanho--;     //atualiza o tamanho da fila

        return elementoRemovido;

    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean inverter(){
        int aux = 0;
        this.aumentarCapacidade();
        for (int i = tamanho-1; i != aux; i--) {
            if(this.tamanho < this.elementos.length){       // verifica se esta cheio
                T A = this.elementos[aux];
                this.elementos[aux] = elementos[i];
                this.elementos[i] = A;
                aux++;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho-1; i++) {
            s.append((this.elementos[i]));
            s.append(",");
        }

        if(this.tamanho>0){
            s.append((this.elementos[this.tamanho-1]));

        }
        s.append("]");

        return s.toString();
    }
    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementosNovos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;

        }
    }

}
