package Ejercicio1.InterfacesClasesGenericas;

public class OperacionesMatDoubleGenerica<T extends Number> implements Operable<Double> {
    @Override
    public Double suma(Double operando1, Double operando2) {
        return operando1 + operando2;
    }

    @Override
    public Double resta(Double operando1, Double operando2) {
        return operando1 - operando2;
    }

    @Override
    public Double producto(Double operando1, Double operando2) {
        return operando1 * operando2;
    }

    @Override
    public Double division(Double operando1, Double operando2){
        return operando1 / operando2;
    }


    @Override
    public Double potencia(Double operando1, int operando2) {
        return Math.pow(operando1, operando2);
    }

    @Override
    public Double raizCuadrada(Double operando){
        return Math.sqrt(operando);
    }

    @Override
    public Double raizCubica(Double operando){
        return Math.cbrt(operando);
    }
}
