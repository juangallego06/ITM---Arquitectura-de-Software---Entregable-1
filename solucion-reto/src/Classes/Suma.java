package Classes;

import Interfaces.IOperacion;

public class Suma implements IOperacion {
    @Override
    public int ejecutar(int a, int b) {
        return a + b;
    }
}
