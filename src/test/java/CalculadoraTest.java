import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void suma() {
        double resultado = Calculadora.sumar(1, 2);
        assertEquals(3, resultado);
    }

    @Test
    void resta() {
        double resultado = Calculadora.restar(10, 2);
        assertEquals(8, resultado);
    }

    @Test
    void producto() {
        double resultado = Calculadora.producto(4, 5);
        assertEquals(20, resultado);
    }

    @Test
    void dividir() {
        double resultado = Calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void divPor0() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(6.0, 0.0);
        });
    }

    @Test
    void mayor() {
        double resultado = Calculadora.mayor(10, 5);
        assertEquals(10, resultado);
    }

    @Test
    void mayorIguales() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.mayor(4, 4);
        });
        assertEquals("Los números son iguales", exception.getMessage());
    }

    @Test
    void menor() {
        double resultado = Calculadora.menor(10, 5);
        assertEquals(5, resultado);
    }

    @Test
    void menorIguales() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.menor(4, 4);
        });
        assertEquals("Los números son iguales", exception.getMessage());
    }

    @Test
    void potencia() {
        double resultado = Calculadora.potencia(2, 3);
        assertEquals(8, resultado);
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
    void porcentaje() {
        double resultado = Calculadora.porcentaje(100, 40);
        assertEquals(40, resultado);
    }

    @Test
    void porcentajeNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.porcentaje(100, -40);
        });
        assertEquals("El porcentaje no puede ser negativo.", exception.getMessage());
    }

    @Test
    void resolverCuadratica() {
        double[] resultado = Calculadora.resolverCuadratica(1, -5, 6);
        assertEquals(3, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    void resolverCuadraticaDeterminanteNegativo() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.resolverCuadratica(1, 2, 5);
        });
        assertEquals("El resultado da un numero imaginario.", exception.getMessage());
    }

    @Test
    void perimetroCirculoRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.perimetroCirculo(-4);
        });
        assertEquals("El radio no puede ser negativo.", exception.getMessage());
    }

    @Test
    void areaCirculoRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaCirculo(-4);
        });
        assertEquals("El radio no puede ser negativo.", exception.getMessage());
    }

    @Test
    void perimetroRectangulo() {
        double resultado = Calculadora.perimetroRectangulo(4, 5);
        assertEquals(18, resultado);
    }

    @Test
    void perimetroRectanguloAltoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.perimetroRectangulo(-4, 5);
        });
        assertEquals("El alto y/o ancho no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void perimetroRectanguloAnchoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.perimetroRectangulo(4, -5);
        });
        assertEquals("El alto y/o ancho no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void areaRectangulo() {
        double resultado = Calculadora.areaRectangulo(4, 5);
        assertEquals(20, resultado);
    }

    @Test
    void areaRectanguloAltoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaRectangulo(-4, 5);
        });
        assertEquals("El alto y/o ancho no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void areaRectanguloAnchoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaRectangulo(4, -5);
        });
        assertEquals("El alto y/o ancho no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void perimetroCuadrado() {
        double resultado = Calculadora.perimetroCuadrado(4);
        assertEquals(16, resultado);
    }

    @Test
    void perimetroCuadradoLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.perimetroCuadrado(-4);
        });
        assertEquals("El lado no puede ser negativo.", exception.getMessage());
    }

    @Test
    void areaCuadrado() {
        double resultado = Calculadora.areaCuadrado(4);
        assertEquals(16, resultado);
    }

    @Test
    void areaCuadradoLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaCuadrado(-4);
        });
        assertEquals("El lado no puede ser negativo.", exception.getMessage());
    }

    @Test
    void volumenEsferaRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.volumenEsfera(-4);
        });
        assertEquals("El radio no puede ser negativo.", exception.getMessage());
    }

    @Test
    void areaEsferaRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaEsfera(-4);
        });
        assertEquals("El radio no puede ser negativo.", exception.getMessage());
    }

    @Test
    void areaCubo() {
        double resultado = Calculadora.areaCubo(4);
        assertEquals(96, resultado);
    }

    @Test
    void areaCuboLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaCubo(-4);
        });
        assertEquals("El lado no puede ser negativo.", exception.getMessage());
    }

    @Test
    void volumenCubo() {
        double resultado = Calculadora.volumenCubo(4);
        assertEquals(64, resultado);
    }

    @Test
    void volumenCuboLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.volumenCubo(-4);
        });
        assertEquals("El lado no puede ser negativo.", exception.getMessage());
    }

    @Test
    void areaConoRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaCono(-4, 5);
        });
        assertEquals("El radio y/o altura no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void areaConoAlturaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.areaCono(4, -5);
        });
        assertEquals("El radio y/o altura no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void volumenConoRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.volumenCono(-4, 5);
        });
        assertEquals("El radio y/o altura no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void volumenConoAlturaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.volumenCono(4, -5);
        });
        assertEquals("El radio y/o altura no pueden ser negativos.", exception.getMessage());
    }

    @Test
    void resolverSistemaEcuacionesLineales() {
        double[] resultado = Calculadora.resolverSistemaEcuacionesLineales(1, 2, 3, 4, 5, 6);
        assertEquals(-1, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    void resolverSistemaEcuacionesLinealesDeterminanteCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.resolverSistemaEcuacionesLineales(2, 4, 10, 1, 2, 5);
        });
        assertEquals("El sistema de ecuaciones no tiene solución única.", exception.getMessage());
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