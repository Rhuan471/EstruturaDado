import estruturas.Lista;
import estruturas.Interador;
import estruturas.No;
import estruturas.Vetor;
import java.util.ArrayList;
import java.util.List;

public class VetorApp {

    private List<Integer> historico = new ArrayList<>();
    private Vetor vetor = new Vetor();

    public static void main(String[] args) {
        VetorApp app = new VetorApp();

        app.vetor.adicionar(54);
        app.vetor.adicionar(42);
        app.vetor.adicionar(33);
        app.vetor.adicionar(27);
        app.vetor.adicionar(21);
        app.vetor.adicionar(16);
        app.vetor.adicionar(12);
        app.vetor.adicionar(9);
        app.vetor.adicionar(7);
        app.vetor.adicionar(2);

        app.vetor.mostrarElementos();

        System.out.println("-----");

        app.vetor.remover(21);
        app.vetor.mostrarElementos();

        app.add(54);
        app.commit();

        System.out.println("-----");

        System.out.println("Histórico: " + app.getHistorico());
    }

    public void commit() {
        System.out.println("Commit realizado. Mudanças aplicadas.");
        historico.add(vetor.getTamanho()); // Adiciona o tamanho do vetor ao histórico
    }

    public void add(int valor) {
        System.out.println("Mudanças adicionadas. Aguarde o commit.");
        vetor.adicionar(valor);
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
