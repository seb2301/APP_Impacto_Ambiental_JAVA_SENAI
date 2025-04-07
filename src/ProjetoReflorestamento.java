public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao) {
        super(nome, descricao);
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto (Reflorestamento): " + arvoresPlantadas + " árvores plantadas.");
    }
}
