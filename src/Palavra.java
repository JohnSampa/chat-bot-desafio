public class Palavra {

    private String palavra;

    private int peso;

    private Setor setor;

    public Palavra(String palavra, int peso,Setor setor) {
        this.palavra = palavra;
        this.peso = peso;
        this.setor = setor;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}

