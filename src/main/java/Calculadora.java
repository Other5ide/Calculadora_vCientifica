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

    public static double menor(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else if (num1 > num2) {
            return num2;
        }
        return -1;
    }

    public static double potencia(double num1, double potencia) {
        return Math.pow(num1, potencia);
    }

    public static double porcentaje(double num1, double porcentaje) {
        if (porcentaje < 0) {
            System.out.println("El porcentaje no puede ser negativo.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return num1*(porcentaje/100);
    }

    public static double[] resolverCuadratica(double num1, double num2, double num3) {
        double discriminante = Math.pow(num2, 2) - (4 * num1 * num3);
        if (discriminante < 0) {
            System.out.println("El resultado da un numero imaginario.");
            return null;
        }

        double sol1 = dividir((-num2 + (Math.sqrt(Math.pow(num2,2)-4*num1*num3))), 2*num1);
        double sol2 = dividir((-num2 - (Math.sqrt(Math.pow(num2,2)-4*num1*num3))), 2*num1);

        return new double[]{sol1, sol2};
    }

    public static double perimetroCirculo(double radio) {
        return Math.PI*2*radio;
    }

    public static double areaCirculo(double radio) {
        return Math.PI*radio*radio;
    }

    public static double perimetroRectangulo(double alto, double ancho) {
        return 2*alto+2*ancho;
    }

    public static double areaRectangulo(double alto, double ancho) {
        return alto*ancho;
    }

}

