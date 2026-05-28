import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControleAcademicoServiceTest {

    ControleAcademicoService service = new ControleAcademicoService();

    @Test
    public void testChamado1_AprovacaoNoLimite() {
        assertEquals("Aprovado", service.verificarSituacao(7.0, 75));
    }

    @Test
    public void testChamado2_CalculoDeMedia() {
        assertEquals(8.0, service.calcularMedia(7.0, 9.0));
    }

    @Test
    public void testChamado3_FrequenciaValida() {
        assertTrue(service.frequenciaValida(100));
    }

    @Test
    public void testChamado2_ComDecimais() {
        assertEquals(6.5, service.calcularMedia(5.5, 7.5));
    }
}