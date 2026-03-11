package Classes;

import Interfaces.IOperacion;

public class Resta implements IOperacion {
    @Override
    public int ejecutar(int a, int b) {
        return a - b;
    }
}
