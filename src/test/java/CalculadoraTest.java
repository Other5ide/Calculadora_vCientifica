import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final InputStream originalSystemIn = System.in;

    @AfterEach
    void restaurarSystemInput() {
        System.setIn(originalSystemIn);
        Calculadora.scanner = new Scanner(System.in);
    }

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

    @Test
    void divPor0() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(6.0, 0.0);
        });
    }

    @Test
    void valEntradaCorrecta() {
        String input = "42.5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculadora.scanner = new Scanner(System.in);

        double resultado = Calculadora.validarNum("Ingrese un número: ");
        assertEquals(42.5, resultado, 0.0001);
    }


}