import java.util.Random;
import java.util.Scanner;

public class CuboTridimensional {
	
	//ATRIBUTOS -declaracion-.
	private int[][][] datos;
	private int filas;
	private int columnas; 
	private int profundidad;
	private int numProfundidades; //utilizada en metodo 7
	
	//CONSTRUCTOR
	public CuboTridimensional(int filas, int columnas, int profundidad) {
		this.filas= filas;
		this.columnas= columnas;
		this.profundidad= profundidad;
		this.numProfundidades= profundidad;
		datos= new int[filas][columnas][profundidad]; //creacion arreglo tridimensional utilizado para almacenar los valores dentro del cubo
		//EXCEPTION
		if(filas <= 0 || columnas <= 0 || profundidad <=0) {
			throw new IllegalArgumentException("Las dimensiones deben ser mayores que 0");
		}	
	}
	
	//METODO PARA LLENAR EL CUBO ALEATORIAMENTE
	public void llenarCuboAleatoriamente() {
		Random rand= new Random();
		
		for(int i=0;i<filas; i++) {
			for(int j=0;j<columnas;j++) {
				for(int k=0;k<profundidad;k++) {
					datos[i][j][k]= rand.nextInt(101); //Valores random entre 0 y 100. 
				}
			}
		}
	}
	
	//1.METODO PARA IMPRIMIR EL CUBO
	public void imprimirCubo() {
		for(int i=0;i<filas;i++) {
			System.out.println("Plano "+ i + ":");
			for(int j=0;j<columnas;j++) {
				for(int k=0;k<profundidad;k++) {
					System.out.println("("+i+","+j+","+k+"):"+datos[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	//2.METODO (BOOLEANO) PARA VERIFICAR SI LA POSICION ESTA VACIA
	public boolean esPosicionVacia(int fila, int columna, int profundidad) {
		return datos[fila][columna][profundidad]== 0; //Compara la el valor de la posicon con 0 
	}
	
	//3.METODO PARA ANULAR POSICION
	public void anularPosicion(int fila,int columna,int profundidad) {
		datos[fila][columna][profundidad]= 0;
		System.out.println("Posicion "+fila+", "+columna+", "+profundidad+ " Ha sido anulada");
	}
	
	//4.METODO PARA CARGAR VALORES AL CUBO
		public void cargarValor(int fila, int columna, int profundidad, int valor) {
			if(valor==0) {
				anularPosicion(fila,columna,profundidad);
				return;
			}
			if(esPosicionVacia(fila,columna,profundidad)) {
				datos[fila][columna][profundidad]= valor;
				System.out.println("El valor "+valor+" ha sido cargado en la posicion: "+fila+", "+columna+", " +profundidad);
			}else {
				System.out.println("Posicion ocupada. Utilizá la operacion Modificar");
			}
		}
		
	//5.METODO PARA MODIFICAR VALOR
		public void modificarValor(int fila, int columna, int profundidad, int valor) {
			if(!esPosicionVacia(fila,columna,profundidad)) { //Si es falso que la posicion esta vacia 
				datos[fila][columna][profundidad]= valor;
				System.out.println("El valor en la posicion "+fila+","+columna+", "+profundidad+" ha sido modificado a: "+valor);
			}else {
				System.out.println("Posición vacia. Utilizá la operacion Cargar");
			}
		}
	
	//6.METODO PARA INDICAR POR PANTALLA TODAS LAS POSICIONES QUE SE ENCUENTRAN ANULADAS
		public void mostrarPosicionesAnuladas() {
			System.out.println("Posiciones anuladas: ");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					for(int k=0;k<profundidad;k++) {
						if(datos[i][j][k]==0) {
							System.out.println("("+i+", "+j+", "+k+")");
						}
					}
				}
			}
		}
	
	//7.METODO VALOR 
		public int obtenerValorEnCoordenada() {
		    Scanner scanner = new Scanner(System.in);

		    int fila, columna, profundidad;
		    do {
		        System.out.print("Ingrese la fila: ");
		        fila = scanner.nextInt();
		        System.out.print("Ingrese la columna: ");
		        columna = scanner.nextInt();
		        System.out.print("Ingrese la profundidad: ");
		        profundidad = scanner.nextInt();

		        if (!esCoordenadaValida(fila, columna, profundidad)) {
		            System.out.println("Coordenada no válida. Intente nuevamente.");
		        }
		    } while (!esCoordenadaValida(fila, columna, profundidad));

		    int valor = datos[fila][columna][profundidad];
		    System.out.println("El valor en la coordenada (" + fila + "," + columna + "," + profundidad + ") es: " + valor);
		    return valor;
		}

		public boolean esCoordenadaValida(int fila, int columna, int profundidad) {
		    return fila >= 0 && fila < filas && columna >= 0 && columna < columnas && profundidad >= 0 && profundidad < numProfundidades;
		}
		

	//8.METODO SUMATORIA
		public void calcularSumatoriasPorCapa() {
		   for (int i = 0; i < profundidad; i++) {
			   int sumatoria = 0;
		      for (int j = 0; j < filas; j++) {
		         for (int k = 0; k < columnas; k++) {
		              sumatoria += datos[i][j][k];
		              }
		          }
		       System.out.println("Sumatoria de la capa " + i + ": " + sumatoria);
		    }
		 }   
}
