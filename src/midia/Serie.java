package midia;

public class Serie extends Midia {
    private int temporadas;

    public Serie() {
        super();
    }

    public Serie(String titulo, int anoLancamento, int temporadas) {
        super(titulo, anoLancamento);
        this.temporadas = temporadas;
    }

    public double calculaPontuacaoFinal() {
        if (getQuantiadeAvaliacao() == 0)
            return 0;

        return getSomaNotas() / getQuantiadeAvaliacao();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
