package Ejercicio1.InterfacesClasesGenericas;
import java.util.Scanner;
//Clase PRINCIPAL para PROBAR
public class Prueba
{
    public static void main(String[] args)
    {
        boolean sw = true;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        double num1_Double;
        double num2_Double;
        double num_Double;
        int num;

        //Menu de Operaciones Clases GENERICAS
        while(sw == true){
            System.out.println("Menu de Operaciones Clases Genericas");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Raiz Cubica");
            System.out.println("8. Salir");
            System.out.println("Elija una opcion: ");
            opcion = entrada.nextInt();
            
                if(opcion == 1){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num1 = entrada.nextInt();
                        num2 = entrada2.nextInt();
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.suma(num1,num2));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num1_Double = entrada.nextDouble();
                        num2_Double = entrada2.nextDouble();
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.suma(num1_Double,num2_Double));
                    }
                }
                if(opcion == 2){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num1 = entrada.nextInt();
                        num2 = entrada2.nextInt();
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.resta(num1,num2));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num1_Double = entrada.nextDouble();
                        num2_Double = entrada2.nextDouble();
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.resta(num1_Double,num2_Double));
                    }
                }
                if(opcion == 3){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num1 = entrada.nextInt();
                        num2 = entrada2.nextInt();
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.producto(num1,num2));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num1_Double = entrada.nextDouble();
                        num2_Double = entrada2.nextDouble();
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.producto(num1_Double,num2_Double));
                    }
                }
                if(opcion == 4){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num1 = entrada.nextInt();
                        num2 = entrada2.nextInt();
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.division(num1,num2));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num1_Double = entrada.nextDouble();
                        num2_Double = entrada2.nextDouble();
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.division(num1_Double,num2_Double));
                    }
                }
                if(opcion == 5){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num1 = entrada.nextInt();
                        num2 = entrada2.nextInt();
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.potencia(num1,num2));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num1_Double = entrada.nextDouble();
                        num2 = entrada2.nextInt();
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.potencia(num1_Double,num2));
                    }
                }
                if(opcion == 6){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num = entrada.nextInt();
                        
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.raizCuadrada(num));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num_Double = entrada.nextDouble();
                        
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.raizCuadrada(num_Double));
                    }
                }
                if(opcion == 7){
                    System.out.println("Ingrese el tipo: 1.Integer    2.Double");
                    int tipo = entrada.nextInt();
                    if(tipo == 1){
                        System.out.print("Ingrese num1: ");
                        num = entrada.nextInt();
                        
                        OperacionesMatIntegerGenerica<Integer> operacionesMatB = new OperacionesMatIntegerGenerica<>();    
                        System.out.println(operacionesMatB.raizCubica(num));
                    }
                    if(tipo == 2){
                        System.out.print("Ingrese num1: ");
                        num_Double = entrada.nextDouble();
                        
                        OperacionesMatDoubleGenerica<Double> operacionesMatB = new OperacionesMatDoubleGenerica<>();    
                        System.out.println(operacionesMatB.raizCubica(num_Double));
                    }
                }
                if(opcion == 8){
                    sw = false;
                }
            
        }
        
        System.out.println("Fin del programa");
    }
}
