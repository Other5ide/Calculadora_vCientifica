import java.util.Scanner;

public class CalculadoraUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int option;
        do {
            mostrarOpciones();
            option = obtenerOpcion(1, 6);
            ejecutarOpcion(option);
        } while (option != 6);
    }

    private static void mostrarOpciones() {
        System.out.println("[1] Operaciones aritméticas");
        System.out.println("[2] Ecuación cuadrática");
        System.out.println("[3] Figuras geométricas");
        System.out.println("[4] Sistema de ecuaciones lineales");
        System.out.println("[5] Ecuación de la recta");
        System.out.println("[6] Salir");
    }

    private static int obtenerOpcion(int min, int max) {
        System.out.print("Ingrese una opción: ");
        int option;
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                option = Integer.parseInt(input);
                if (option >= min && option <= max) {
                    return option;
                }
            } catch (Exception e) {}
            System.out.print("Ingrese un número entero entre " + min + " y " + max + ": ");
        }
    }

    private static void ejecutarOpcion(int option) {
        switch (option) {
            case 1:
                operacionesAritmeticas();
                break;
            case 2:
                ecuacionCuadratica();
                break;
            case 3:
                figurasGeometricas();
                break;
            case 4:
                sistemaEcuacionesLineales();
                break;
            case 5:
                ecuacionRecta();
                break;
        }
    }

    private static void operacionesAritmeticas() {
        mostrarOperacionesAritmeticas();
        int option = obtenerOpcion(1, 9);
        ejecutarOperacionAritmetica(option);
    }

    private static void mostrarOperacionesAritmeticas() {
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Producto");
        System.out.println("[4] Dividir");
        System.out.println("[5] Mayor");
        System.out.println("[6] Menor");
        System.out.println("[7] Potencia");
        System.out.println("[8] Porcentaje");
        System.out.println("[9] Regresar al menú principal");
    }

    private static void ejecutarOperacionAritmetica(int option) {
        switch (option) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 5:
                mayor();
                break;
            case 6:
                menor();
                break;
            case 7:
                potencia();
                break;
            case 8:
                porcentaje();
                break;
        }
    }

    private static void suma() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        double resultado = Calculadora.sumar(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    private static void resta() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        double resultado = Calculadora.restar(num1, num2);
        System.out.println("El resultado de la resta es: " + resultado);
    }

    private static void multiplicacion() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        double resultado = Calculadora.producto(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    private static void division() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        try {
            double resultado = Calculadora.dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mayor() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        try {
            double resultado = Calculadora.mayor(num1, num2);
            System.out.println("El número mayor es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void menor() {
        double num1 = obtenerNumero("Ingrese el primer número: ");
        double num2 = obtenerNumero("Ingrese el segundo número: ");
        try {
            double resultado = Calculadora.menor(num1, num2);
            System.out.println("El número menor es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void potencia() {
        double num1 = obtenerNumero("Ingrese la base: ");
        double potencia = obtenerNumero("Ingrese el exponente: ");
        try {
            double resultado = Calculadora.potencia(num1, potencia);
            System.out.println("El resultado de la potencia es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void porcentaje() {
        double num1 = obtenerNumero("Ingrese el número: ");
        double porcentaje = obtenerNumero("Ingrese el porcentaje: ");
        try {
            double resultado = Calculadora.porcentaje(num1, porcentaje);
            System.out.println("El " + porcentaje + "% de " + num1 + " es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static double obtenerNumero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (Exception e) {}
        }
    }

    private static void ecuacionCuadratica() {
        System.out.println("Ingrese los coeficientes de la ecuación cuadrática (ax^2 + bx + c = 0):");
        double a = obtenerNumero("a: ");
        double b = obtenerNumero("b: ");
        double c = obtenerNumero("c: ");
        try {
            double[] resultados = Calculadora.resolverCuadratica(a, b, c);
            System.out.println("Las soluciones son: x1 = " + resultados[0] + ", x2 = " + resultados[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void figurasGeometricas() {
        mostrarOpcionesFigurasGeometricas();
        int option = obtenerOpcion(1, 13);
        ejecutarOpcionFigurasGeometricas(option);
    }

    private static void mostrarOpcionesFigurasGeometricas() {
        System.out.println("[1] Perímetro de un círculo");
        System.out.println("[2] Área de un círculo");
        System.out.println("[3] Perímetro de un rectángulo");
        System.out.println("[4] Área de un rectángulo");
        System.out.println("[5] Perímetro de un cuadrado");
        System.out.println("[6] Área de un cuadrado");
        System.out.println("[7] Volumen de una esfera");
        System.out.println("[8] Área de una esfera");
        System.out.println("[9] Área de un cubo");
        System.out.println("[10] Volumen de un cubo");
        System.out.println("[11] Área de un cono");
        System.out.println("[12] Volumen de un cono");
        System.out.println("[13] Regresar al menú principal");
    }

    private static void ejecutarOpcionFigurasGeometricas(int option) {
        switch (option) {
            case 1:
                perimetroCirculo();
                break;
            case 2:
                areaCirculo();
                break;
            case 3:
                perimetroRectangulo();
                break;
            case 4:
                areaRectangulo();
                break;
            case 5:
                perimetroCuadrado();
                break;
            case 6:
                areaCuadrado();
                break;
            case 7:
                volumenEsfera();
                break;
            case 8:
                areaEsfera();
                break;
            case 9:
                areaCubo();
                break;
            case 10:
                volumenCubo();
                break;
            case 11:
                areaCono();
                break;
            case 12:
                volumenCono();
                break;
        }
    }

    private static void perimetroCirculo() {
        System.out.println("Perímetro de un círculo.");
    }

    private static void areaCirculo() {
        System.out.println("Área de un círculo.");
    }

    private static void perimetroRectangulo() {
        System.out.println("Perímetro de un rectángulo.");
    }

    private static void areaRectangulo() {
        System.out.println("Área de un rectángulo.");
    }

    private static void perimetroCuadrado() {
        System.out.println("Perímetro de un cuadrado.");
    }

    private static void areaCuadrado() {
        System.out.println("Área de un cuadrado.");
    }

    private static void volumenEsfera() {
        System.out.println("Volumen de una esfera.");
    }

    private static void areaEsfera() {
        System.out.println("Área de una esfera.");
    }

    private static void areaCubo() {
        System.out.println("Área de un cubo.");
    }

    private static void volumenCubo() {
        System.out.println("Volumen de un cubo.");
    }

    private static void areaCono() {
        System.out.println("Área de un cono.");
    }

    private static void volumenCono() {
        System.out.println("Volumen de un cono.");
    }

    private static void sistemaEcuacionesLineales() {
        System.out.println("Sistema de ecuaciones lineales.");
    }

    private static void ecuacionRecta() {
        System.out.println("Ecuación de la recta.");
    }
}
