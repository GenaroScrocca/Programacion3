import java.util.Scanner;

public class MainCubo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el número de filas: ");
	        int filas = scanner.nextInt();
	        System.out.print("Ingrese el número de columnas: ");
	        int columnas = scanner.nextInt();
	        System.out.print("Ingrese la profundidad: ");
	        int profundidad = scanner.nextInt();

	        CuboTridimensional cubo = new CuboTridimensional(filas, columnas, profundidad);
	        cubo.llenarCuboAleatoriamente();

	        int opcion;
	        do {
	            System.out.println("\n--- Menú ---");
	            System.out.println("1.Mostrar cubo");
	            System.out.println("2.Verificar si la posición está vacía");
	            System.out.println("3.Anular posición");
	            System.out.println("4.Cargar valor al cubo");
	            System.out.println("5.Modificar valores ");
	            System.out.println("6.Mostrar posiciones anuladas");
	            System.out.println("7.Obtener valor en coordenada");
	            System.out.println("8.Sumar datos para cada capa de profundidad");
	            System.out.println("9.Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    cubo.imprimirCubo();
	                    break;
	                case 2:
	                    System.out.print("Ingrese fila: ");
	                    int fila = scanner.nextInt();
	                    System.out.print("Ingrese columna: ");
	                    int columna = scanner.nextInt();
	                    System.out.print("Ingrese profundidad: ");
	                    int prof = scanner.nextInt();
	                    boolean vacia = cubo.esPosicionVacia(fila, columna, prof);
	                    System.out.println("La posición está vacía: " + vacia);
	                    break;
	                case 3:
	                    System.out.print("Ingrese fila: ");
	                    int filaAnular = scanner.nextInt();
	                    System.out.print("Ingrese columna: ");
	                    int columnaAnular = scanner.nextInt();
	                    System.out.print("Ingrese profundidad: ");
	                    int profAnular = scanner.nextInt();
	                    cubo.anularPosicion(filaAnular, columnaAnular, profAnular);
	                    break;
	                case 4:
	                    System.out.print("Ingrese fila: ");
	                    int filaCargar = scanner.nextInt();
	                    System.out.print("Ingrese columna: ");
	                    int columnaCargar = scanner.nextInt();
	                    System.out.print("Ingrese profundidad: ");
	                    int profCargar = scanner.nextInt();
	                    System.out.print("Ingrese valor: ");
	                    int valor = scanner.nextInt();
	                    cubo.cargarValor(filaCargar, columnaCargar, profCargar, valor);
	                    break;
	                case 5:
	                    System.out.print("Ingrese fila: ");
	                    int filaModificar = scanner.nextInt();
	                    System.out.print("Ingrese columna: ");
	                    int columnaModificar = scanner.nextInt();
	                    System.out.print("Ingrese profundidad: ");
	                    int profModificar = scanner.nextInt();
	                    System.out.print("Ingrese nuevo valor: ");
	                    int valorModificar = scanner.nextInt();
	                    cubo.modificarValor(filaModificar, columnaModificar, profModificar, valorModificar);
	                    break;    
	                case 6:
	                    cubo.mostrarPosicionesAnuladas();
	                    break;
	                case 7:
	                    cubo.obtenerValorEnCoordenada();
	                    break;
	                case 8:
	                    cubo.calcularSumatoriasPorCapa();
	                    break;    
	            }  
	        }while(opcion!=9);          
	 }
}