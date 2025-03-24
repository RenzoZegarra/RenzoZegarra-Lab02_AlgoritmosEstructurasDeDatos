package Ejercicio1.InterfacesClasesGenericas;

public class OperacionesMatIntegerGenerica<T extends Number> implements Operable<Integer> {
    @Override
    public Integer suma(Integer operando1, Integer operando2) {
        return operando1 + operando2;
    }
    
    @Override
    public Integer resta(Integer operando1, Integer operando2) {
        return operando1 - operando2;
    }

    @Override
    public Integer producto(Integer operando1, Integer operando2) {
        return operando1 * operando2;
    }

    @Override
    public Integer division(Integer operando1, Integer operando2) {
        if(operando2 == 0){
            throw new ArithmeticException("No se puede dividir sobre 0.");
        }
        return operando1 / operando2;
    }

    @Override
    public Integer potencia(Integer operando1, int operando2) {
        return (int)Math.pow(operando1, operando2);
    }

    @Override
    public Integer raizCuadrada(Integer operando){
        return (int)Math.round(Math.sqrt(operando));
    }

    @Override
    public Integer raizCubica(Integer operando){
        return (int)Math.round(Math.cbrt(operando));
    }
}
