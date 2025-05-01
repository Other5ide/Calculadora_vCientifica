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
                System.out.println("Menor.");
                break;
            case 7:
                System.out.println("Potencia.");
                break;
            case 8:
                System.out.println("Porcentaje.");
                break;
            case 9:
                System.out.println("Raíz cuadrada.");
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
        System.out.println("Ecuación cuadrática.");
    }

    private static void figurasGeometricas() {
        System.out.println("Figuras geométricas.");
    }

    private static void sistemaEcuacionesLineales() {
        System.out.println("Sistema de ecuaciones lineales.");
    }

    private static void ecuacionRecta() {
        System.out.println("Ecuación de la recta.");
    }
}
