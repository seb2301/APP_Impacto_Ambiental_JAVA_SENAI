import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    private String nome;
    private String descricao;

    private List<Voluntario> voluntarios;

    private RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    @Override
    public abstract void calcularImpacto();
}
