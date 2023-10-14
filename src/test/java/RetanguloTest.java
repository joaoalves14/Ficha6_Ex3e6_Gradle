import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testAreaCaso1() {
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(3,5);
        int testAreaCaso1 = 15;
        assertEquals (area, testAreaCaso1, "Erro no cálculo da área!");
    }

    @Test
    public void testPerimetroCaso1() {
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(3,5);
        int testPerimetroCaso1 = 16;
        assertEquals (perimetro, testPerimetroCaso1, "Erro no cálculo do perimetro!");
    }

    @Test
    public void testAreaCaso2() {
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(5, 8);
        int testAreaCaso2 = 40;
        assertEquals(area, testAreaCaso2, "Erro no cálculo da área!");
    }

    @Test
    public void testPerimetroCaso2() {
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(5,8);
        int testPerimetroCaso2 = 26;
        assertEquals (perimetro, testPerimetroCaso2, "Erro no cálculo do perimetro!");
    }

    @Test
    public void testAreaCaso3() {
        Retangulo retangulo = new Retangulo();
        int area = retangulo.area(2, 4);
        int testAreaCaso3 = 8;
        assertEquals(area, testAreaCaso3, "Erro no cálculo da área!");
    }

    @Test
    public void testPerimetroCaso3() {
        Retangulo retangulo = new Retangulo();
        int perimetro = retangulo.perimetro(2,4);
        int testPerimetroCaso3 = 12;
        assertEquals (perimetro, testPerimetroCaso3, "Erro no cálculo do perimetro!");
    }

    @Test
    public void testIsTriangle() {
        Retangulo retangulo = new Retangulo();
        assertTrue(retangulo.isTriangle(5, 12, 13)); // Triângulo possível
        assertFalse(retangulo.isTriangle(4, -3, 5)); // Triângulo impossível
    }
}