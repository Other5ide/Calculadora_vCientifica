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
            option = obtenerOpcion();
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

    private static int obtenerOpcion() {
        System.out.print("Ingrese una opción: ");
        while (true) {
            String input = scanner.nextLine().trim();
            int option;
            try {
                option = Integer.parseInt(input);
                if (option >= 1 && option <= 6) {
                    return option;
                }
            } catch (Exception e) {}
            System.out.print("Ingrese un número entero entre 1 y 6: ");
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
        System.out.println("Operaciones aritméticas.");
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
