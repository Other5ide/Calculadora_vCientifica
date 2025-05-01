import java.util.Scanner;

public class CalculadoraUI {
    private static Scanner scanner = new Scanner(System.in);
    private static Calculadora calculadora = new Calculadora();

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
                System.out.println("Suma.");
                break;
            case 2:
                System.out.println("Resta.");
                break;
            case 3:
                System.out.println("Producto.");
                break;
            case 4:
                System.out.println("División.");
                break;
            case 5:
                System.out.println("Mayor.");
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
