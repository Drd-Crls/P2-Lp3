import midia.Filme;
import midia.Serie;
import midia.Documentario;

public class Main {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme("O Senhor dos Anéis", 2001, 178.0);
        filme.adicionarNota(8.5);
        filme.adicionarNota(9.0);
        filme.adicionarNota(9.5);

        Serie serie = new Serie("Breaking Bad", 2008, 5);
        serie.adicionarNota(9.0);
        serie.adicionarNota(9.5);

        Documentario documentario = new Documentario("Planet Earth", 2006);
        documentario.adicionarNota(9.8);
        documentario.adicionarNota(9.6);

        System.out.println("Filme: " + filme.getTitulo() 
                           + "\nAno de Lançamento: " + filme.getAnoLancamento() 
                           + "\nDuração: " + filme.getDuracao() + " minutos"
                           + "\nPontuação Final: " + filme.calculaPontuacaoFinal());

        System.out.println("\nSérie: " + serie.getTitulo()
                           + "\nAno de Lançamento: " + serie.getAnoLancamento()
                            + "\nTemporadas: " + serie.getTemporadas()
                            + "\nPontuação Final: " + serie.calculaPontuacaoFinal());
        System.out.println("\nDocumentário: " + documentario.getTitulo()
                           + "\nAno de Lançamento: " + documentario.getAnoLancamento()
                            + "\nPontuação Final: " + documentario.calculaPontuacaoFinal());
    }
}
