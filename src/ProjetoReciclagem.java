public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao) {
        super(nome, descricao);
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto (Reciclagem): " + toneladasRecicladas + " toneladas recicladas.");
    }
}
