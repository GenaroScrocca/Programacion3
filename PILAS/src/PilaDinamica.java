import java.util.ArrayList;
import java.util.Scanner;

public class PilaDinamica {
	
	//CREACION DEL ARRAY
	private ArrayList<Integer> pila;
	private ArrayList<Integer> ordenApilado;
	
	//CONSTRUCTOR
	public PilaDinamica() {
		pila= new ArrayList<>();
		ordenApilado= new ArrayList<>();
	}
	
	//METODOS AUXILIARES
	public boolean pilaVacia() {
        return pila.isEmpty();
    }
	public PilaDinamica crearCopia() {
	        PilaDinamica copia = new PilaDinamica();
	        copia.pila = new ArrayList<>(this.pila);
	        return copia;
	    } 
	
	
	//1.METODO PARA CREAR LA PILA
    public void crearPila() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la pila: ");
        String nombre = scanner.nextLine();

        pila = new ArrayList<>();
        System.out.println("Pila '" + nombre + "' creada.");
    }
  
    //2.METODO PARA APILAR ELEMENTO
    public void apilarElemento(int elemento) {
        pila.add(elemento);
        ordenApilado.add(ordenApilado.size() + 1); // Orden empieza en 1
        System.out.println("Elemento " + elemento + " apilado correctamente.");
    }
  
    //3.METODO PARA DESAPILAR ELEMENTO
    public int desapilarElemento() {
        if (!pilaVacia()) {
            int elementoDesapilado = pila.remove(pila.size() - 1);
            System.out.println("Elemento " + elementoDesapilado + " desapilado correctamente.");
            return elementoDesapilado;
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
            return -1; // Valor de error
        }
    }
    
    //4.METODO PARA DEVOLVER EL VALOR EN EL TOPE DE LA PILA
    public int topePila() {
        if (!pilaVacia()) {
            return pila.get(pila.size() - 1);
        } else {
            System.out.println("La pila está vacía. No hay elemento en el tope.");
            return -1; // Valor de error
        }
    }
  //5.METODO PARA COMPROBAR SI TIENE EL ELEMENTO
    public boolean contieneElemento(int elemento) {
        return pila.contains(elemento);
    }
  //6.METODO DESAPILAR ORDEN
    public int desapilarOrden() {
        if (!pilaVacia()) {
            int orden = ordenApilado.get(ordenApilado.size() - 1);
            ordenApilado.remove(ordenApilado.size() - 1);
            return orden;
        } else {
            return -1; // Valor de error
        }
    }
  //7.NUEVO METODO: MOSTRAR
    public void mostrar() {
        if (!pilaVacia()) {
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println(pila.get(i));
            }
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}
