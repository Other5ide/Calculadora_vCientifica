import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double producto(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No puedes dividir entre 0");
        }
        return num1 / num2;
    }

    public static double mayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return -1;
        }
        }

    public static double resolverCuadratica(double num1, double num2, double num3) {
        return dividir((num2 + Math.abs(Math.sqrt(Math.pow(num2,2)-4*num1*num3))), 2*num1);
    }
}

