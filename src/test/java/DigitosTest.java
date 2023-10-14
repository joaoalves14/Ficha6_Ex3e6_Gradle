import org.example.Digitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitosTest {
    private Digitos digitos;

    @BeforeEach
    public void setUp() {
        digitos = new Digitos();
    }

    @Test
    public void testCalcularMediaDigitosNumeroPositivo() {
        double media = Digitos.calcularMediaDigitos(12345);
        assertEquals(3.0, media, 0.001);
    }
    @Test
    public void testCalcularMediaDigitosNumeroUnicoDigito() {
        double media = Digitos.calcularMediaDigitos(7);
        assertEquals(7.0, media, 0.001);
    }
}
