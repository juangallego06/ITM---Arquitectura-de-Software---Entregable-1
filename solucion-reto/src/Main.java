/*
EJERCICIO A REFACTORIZAR
class Calculadora {
    public void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar(int a, int b) {
        int resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.sumar(5, 3);
        calc.restar(10, 4);
    }
}
 */

import Classes.Calculadora;
import Classes.Resta;
import Classes.ResultadoPrinter;
import Classes.Suma;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        ResultadoPrinter printer = new ResultadoPrinter();

        int suma = calc.calcular(5, 3, new Suma());
        printer.imprimir("suma", suma);

        int resta = calc.calcular(10, 4, new Resta());
        printer.imprimir("resta", resta);
    }
}