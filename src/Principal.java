public class Principal {
    public static void main(String[] args) {
        ControleAcademicoService service = new ControleAcademicoService();
        
        System.out.println("Testes de Controle Acadêmico:");

        // TESTE 1 (Chamado 2)
        double media = service.calcularMedia(7.0, 9.0);
        System.out.println("Media (7.0 e 9.0) -> Esperado: 8.0 | Obtido: " + media + (media == 8.0 ? " [PASSOU]" : " [FALHOU]"));

        // TESTE 2 (Chamado 1)
        String situacao = service.verificarSituacao(7.0, 75);
        System.out.println("Situacao (7.0 e 75) -> Esperado: Aprovado | Obtido: " + situacao + ("Aprovado".equals(situacao) ? " [PASSOU]" : " [FALHOU]"));

        // TESTE 3 (Chamado 3)
        boolean freqValida = service.frequenciaValida(100);
        System.out.println("Frequencia (100) -> Esperado: true | Obtido: " + freqValida + (freqValida ? " [PASSOU]" : " [FALHOU]"));

        // TESTE 4 (Chamado 4)
        double notaFinal = service.calcularNotaFinal(6.0, 8.0);
        System.out.println("Nota Final (6.0 e 8.0) -> Esperado: 7.0 | Obtido: " + notaFinal + (notaFinal == 7.0 ? " [PASSOU]" : " [FALHOU]"));
    }
}