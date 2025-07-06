package midia;

public class Filme extends Midia {
    private double duracao;

    public Filme() {
        super();
    }

    public Filme(String titulo, int anoLancamento, double duracao) {
        super(titulo, anoLancamento);
        this.duracao = duracao;
    }

    public double calculaPontuacaoFinal() {
        if (getQuantiadeAvaliacao() == 0)
            return 0;

        return getSomaNotas() / getQuantiadeAvaliacao();
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
