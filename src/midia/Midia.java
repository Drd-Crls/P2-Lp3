package midia;

abstract public class Midia {
    private String titulo;
    private int anoLancamento;
    private int quantiadeAvaliacao;
    private double somaNotas;

    public Midia(){

    }

    public Midia(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public abstract double calculaPontuacaoFinal();

    public void adicionarNota(double nota) {
        this.somaNotas += nota;
        this.quantiadeAvaliacao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQuantiadeAvaliacao() {
        return quantiadeAvaliacao;
    }

    public void setQuantiadeAvaliacao(int quantiadeAvaliacao) {
        this.quantiadeAvaliacao = quantiadeAvaliacao;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }
}