import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static Scanner scanner = new Scanner(System.in);

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
            throw new ArithmeticException("Error matemático: No se puede dividir por 0"); //TODO: Requiere un manejo de excepcion
        }
        return num1 / num2;
    }

    public static double mayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return -1;//TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
    }

    public static double menor(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else if (num1 > num2) {
            return num2;
        }
        return -1;//TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
    }

    public static double potencia(double num1, double potencia) {
        // Potencia a 0
        if (num1 == 0 && potencia == 0) {
            return Double.NaN;
        }
        // Potencia negativa
        if (num1 == 0 && potencia < 0) {
            throw new ArithmeticException("0 no es posible a elevar por un exponente negativo.");
        }
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
            return null; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        // Manejo errores por usar división
        try {
            double sqrtDiscriminante = Math.sqrt(discriminante);
            double denominador = 2 * num1;

            double sol1 = dividir(-num2 + sqrtDiscriminante, denominador);
            double sol2 = dividir(-num2 - sqrtDiscriminante, denominador);

            return new double[] {sol1, sol2};
        } catch (ArithmeticException e) {
            // Ocurre solo si hay un error inesperado.
            throw new ArithmeticException("Error al calcular raíces.");
        }

    }

    public static double perimetroCirculo(double radio) {
        if (radio < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return Math.PI*2*radio;
    }

    public static double areaCirculo(double radio) {
        if (radio < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return Math.PI*radio*radio;
    }

    public static double perimetroRectangulo(double alto, double ancho) {
        if (alto < 0 || ancho < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return 2*alto+2*ancho;
    }

    public static double areaRectangulo(double alto, double ancho) {
        if (alto < 0 || ancho < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return alto*ancho;
    }

    public static double perimetroRectangulo(double lado) { //Perimetro de un cuadrado
        if (lado < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return 4*lado;
    }

    public static double areaRectangulo(double lado) { //Area de un cuadrado
        if (lado < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return lado*lado;
    }

    public static double volumenEsfera(double radio) {
        if (radio < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return Math.PI*radio*radio*4;

    }

    public static double areaEsfera(double radio) {
        if (radio < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return Math.PI*radio*radio*radio*(4.0/3);
    }

    public static double areaCubo(double lado) {
        if (lado < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return lado*lado*6;
    }

    public static double volumenCubo(double lado) {
        if (lado < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return lado*lado*lado;
    }

    public static double areaCono(double radio, double altura) {
        if (radio < 0 || altura < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        double pitagoras = Math.sqrt(Math.pow(radio, 2)+Math.pow(altura, 2));
        return Math.PI*radio*(radio+pitagoras);
    }

    public static double volumenCono(double radio, double altura) {
        if (radio < 0 || altura < 0) {
            System.out.println("La medida no puede ser negativa.");
            return -1; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
        return (Math.PI*radio*radio*altura)/3;
    }

    public static double[] resolverEcuacionSegundoGrado(double a, double b, double c, double d, double e, double f) {
        double determinante = a * e - b * d;
        double determinanteX = c*e-b*f;
        double determinanteY = a*f-c*d;

        if (determinante != 0) {
            double x = determinanteX / determinante;
            double y = determinanteY / determinante;
            return new double[]{x, y};
    } else {
        return null; //TODO: Cuando el otro metodo reciba este valor, debe reconocer que es un valor invalido
        }
    }

    public static double validarNum(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingresar número válido.");
                scanner.nextLine();
            }
        }
    }


}

