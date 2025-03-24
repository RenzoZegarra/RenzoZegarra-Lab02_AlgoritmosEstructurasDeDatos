package Ejercicio1.InterfacesClasesGenericas;

//Interfaz Operable GENERICA
    //Metodos que reciben TIPO E
                //devuelven TIPO E
public interface Operable<N extends Number>
{
    public N suma(N operando1, N operando2);
    public N resta(N operando1, N operando2);
    public N producto(N operando1, N operando2);
    public N division(N operando1, N operando2);
    public N potencia(N operando1, int operando2);
    public N raizCuadrada(N operando);
    public N raizCubica(N operando);
    
}
