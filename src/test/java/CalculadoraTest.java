import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
        InputStream originalSystemIn = System.in;
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

    @Test
    void divPor0() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(6.0, 0.0);
        });
    }


}