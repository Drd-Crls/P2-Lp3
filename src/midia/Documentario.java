package midia;

public class Documentario extends Midia{

    public Documentario() {
        super();
    }

    public Documentario(String titulo, int anoLancamento) {
        super(titulo, anoLancamento);
    }

    public double calculaPontuacaoFinal() {
        if (getQuantiadeAvaliacao() == 0)
            return 0;

        return getSomaNotas() / getQuantiadeAvaliacao();
    }
}
