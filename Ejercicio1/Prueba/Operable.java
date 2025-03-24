package Ejercicio1.Prueba;

//Clase GENERICA Operable
    //Que DECLARA las operaciones basicas
public interface Operable<E>
{
    E suma(E objeto);
    E resta(E objeto);
    E producto(E objeto);
    E division(E objeto);
    E potencia(E objeto);
    E raizCuadrada(E objeto);
    E raizCubica(E objeto);
}
