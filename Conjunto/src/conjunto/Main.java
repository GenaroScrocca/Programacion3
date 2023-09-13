package conjunto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conjunto conjunto = new Conjunto();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar elemento al conjunto");
            System.out.println("2. Verificar si un elemento pertenece al conjunto");
            System.out.println("3. Eliminar un elemento del conjunto");
            System.out.println("4. Mostrar todos los elementos del conjunto");
            System.out.println("5. Verificar si el conjunto está vacío");
            System.out.println("6. Contar el número de elementos en el conjunto");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar al conjunto: ");
                    int elemento = sc.nextInt();
                    conjunto.agregarElementos(elemento);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a verificar: ");
                    int elementoVerificar = sc.nextInt();
                    conjunto.perteneceElemento(elementoVerificar);
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a eliminar del conjunto: ");
                    int elementoEliminar = sc.nextInt();
                    conjunto.eliminarElemento(elementoEliminar);
                    break;
                case 4:
                    System.out.println("Elementos del conjunto:");
                    conjunto.mostrarElementos();
                    break;
                case 5:
                    System.out.println("¿El conjunto está vacío? " + conjunto.estaVacio());
                    break;
                case 6:
                    int numElementos = conjunto.nElementos();
                    System.out.println("Número de elementos en el conjunto: " + numElementos);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        sc.close();
        
        System.out.println("Adios :)");
    }
}