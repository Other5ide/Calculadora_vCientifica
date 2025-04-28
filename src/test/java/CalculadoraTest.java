import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    
    @BeforeEach
    void setUp() {
    }

    @Test
    void testSumar() {
        assertEquals(Calculadora.sumar(3, 4), 7);
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {Calculadora.dividir(3, 0);});
    }

    @Test
    void testPorcentaje() {
        assertEquals(10, Calculadora.porcentaje(100, 10));
    }

    @Test
    void testPorcentajeNegativo() {
        assertEquals(-1, Calculadora.porcentaje(100, -10));
    }

    @Test
    void testResolverCuadraticaNum3Cero() {
        assertThrows(ArithmeticException.class, () -> {Calculadora.resolverCuadratica(0,1,1);});
    }

    @Test
    void testResolverCuadratica() {
        double[] resultado = {-1,-1};
        assertArrayEquals(resultado, Calculadora.resolverCuadratica(1,2,1));
    }

    @Test
    void testResolverCuadraticaImaginario() {
        assertArrayEquals(null, Calculadora.resolverCuadratica(1,2,8000));
    }
}