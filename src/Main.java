import java.util.List;

public class Main {
    public static void main(String[] args) {

        ONG ong = new ONG("SOS Natureza");

        ProjetoReflorestamento p1 = new ProjetoReflorestamento(
                "Refloresta 2025",
                "Plantio de mudas nativas em áreas degradadas"
        );
        p1.setArvoresPlantadas(1000);

        ProjetoReciclagem p2 = new ProjetoReciclagem(
                "Recicla +",
                "Coleta seletiva e reciclagem em comunidades"
        );
        p2.setToneladasRecicladas(5.5);

        ProjetoEnergiaRenovavel p3 = new ProjetoEnergiaRenovavel(
                "Solar em Foco",
                "Instalação de painéis solares para geração de energia limpa"
        );
        p3.setEnergiaGerada(2000.0);

        ong.adicionarProjeto(p1);
        ong.adicionarProjeto(p2);
        ong.adicionarProjeto(p3);

        Voluntario v1 = new Voluntario("Alice", "alice@example.com");
        Voluntario v2 = new Voluntario("Paulo", "paulo@example.com");
        Voluntario v3 = new Voluntario("Andre", "andre@example.com");

        v1.participarProjeto(p1);
        v1.participarProjeto(p2);
        v2.participarProjeto(p3);

        p1.gerarRelatorioImpacto(1000, 4.2);
        if (p1.getRelatorioImpacto() != null) {
            p1.getRelatorioImpacto().exibirRelatorio();
        }

        System.out.println("\n--- Cálculo de Impacto de cada projeto ---");
        p1.calcularImpacto();
        p2.calcularImpacto();
        p3.calcularImpacto();

        System.out.println("\n=== Projetos da ONG " + ong.getNome() + " ===");
        ong.listarProjetos();

        System.out.println("\n=== Voluntários do Projeto Refloresta 2025 ===");
        List<Voluntario> voluntariosP1 = p1.getVoluntarios();
        for (Voluntario v : voluntariosP1) {
            System.out.println(" - " + v.getNome() + " (" + v.getEmail() + ")");
        }
    }
}

