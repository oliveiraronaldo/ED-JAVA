public class No {

    private String data;
    private No ant;
    private No prox;

    public No(String data) {
        this.data = data;
    }

    public No(String data, No ant, No prox) {
        this.data = data;
        this.ant = ant;
        this.prox = prox;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
