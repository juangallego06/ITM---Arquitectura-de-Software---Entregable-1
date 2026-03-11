package Classes;

import Interfaces.IOperacion;

public class Calculadora {
    public int calcular(int a, int b, IOperacion iOperacion) {
        return iOperacion.ejecutar(a, b);
    }
}
