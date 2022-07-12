import java.lang.reflect.Array;
@SuppressWarnings("unchecked")
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista (int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;     
    }

    public Lista (int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        this.aumentarCapacidade();
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;

    }
    
    public boolean adiciona (int posicao, T elemento)throws IllegalAccessException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao invalida!");
        }
        this.aumentarCapacidade();
        for (int i = tamanho-1; i >= posicao; i--) {
            elementos[i+1] = elementos[i]; 
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;

    }

    public void remover (int posicao)throws IllegalAccessException{
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }
        for (int i = posicao; i < tamanho-1; i++) {
           elementos[i] = elementos[i+1]; 
        }
        tamanho--;
    }

    public boolean contem(Object elemento){         //exercicio 1
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)){
                return true;
            }   
        }
        return false;

    }

    public int tamanho(){
        return tamanho;
    }

    public int ultimaOcorrencia(Object elemento){       //exercicio 2
        for (int i = tamanho-1; i >= 0; i--) {
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    } 

    public void removerUltimo() throws IllegalAccessException{      //exercicio 3
        if (this.tamanho() != 0) {
            this.remover(tamanho-1);
            
        }
    }

    public void removerPrimeiro() throws IllegalAccessException{        //exercicio 4
        if (this.tamanho() != 0) {
            this.remover(0);
        }
    }

    public void limpar(){                           //exercicio 5
        for (int i = tamanho; i >= 0; i--) {
            elementos[i] = null;
        }
        tamanho = 0;
    }
    private void aumentarCapacidade(){
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[])new Object[elementos.length*2];
            for (int i = 0; i < elementosNovos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }   

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho-1; i++) {
            s.append(elementos[i]);
            s.append(",");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho-1]);
            
        }
        s.append("]");
        return s.toString();
    }

    
}
