import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    
    @BeforeEach
    void setUp() {
    }

    @Test
    void testPotencia0() {
        assertTrue(Double.isNaN(Calculadora.potencia(0.0, 0.0)));
    }

    @Test
    void testPotenciaNegB0() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.potencia(0.0, -2.0);
        });
    }
    }