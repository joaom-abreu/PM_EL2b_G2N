import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.io.TempDir;

public class IngressoTest {
    

    @Test
    public void calcularValorIngressoCorretamente(){
        Clube ingresso = new Clube("Vingadores", LocalDateTime.now(), EClube.PIPOCA);

        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.REFRIGERANTE);
        ingresso.incluir(EAdicional.REFRIGERANTE);

        double total = ingresso.valorIngresso();

        assertEquals(51.6, total, 0.01);
    }
}
