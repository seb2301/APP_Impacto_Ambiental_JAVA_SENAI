import java.util.ArrayList;
import java.util.List;

public class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos; // Composição

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProjetoSustentavel> getListaProjetos() {
        return listaProjetos;
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    public void listarProjetos() {
        System.out.println("Projetos da organização " + this.nome + ":");
        for (ProjetoSustentavel p : listaProjetos) {
            System.out.println(" - " + p.getNome());
        }
    }
}
