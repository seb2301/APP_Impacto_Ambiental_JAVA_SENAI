public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao) {
        super(nome, descricao);
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto (Energia Renovável): " + energiaGerada + " kWh gerados.");
    }
}
