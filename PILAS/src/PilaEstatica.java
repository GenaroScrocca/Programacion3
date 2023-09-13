import java.util.Arrays;
import java.util.Scanner;

public class PilaEstatica {
	
	//DECLARACION DE VECTOR Y VARIABLES
	private int[] pila;
	private int capacidad;
	private int tope;
	private int[] ordenApilado;
	private String nombre;
	
	//CONSTRUCTORES
	public PilaEstatica() {
		//constructor vacio
	}
	public PilaEstatica(String nombre,int capacidad) {
		this.nombre= nombre;
		this.capacidad= capacidad;
		pila= new int[capacidad];
		ordenApilado=new int[capacidad];
		tope= 0;
	}
	
	//METODOS AUXILIARES
	public boolean pilaLlena() {
        return tope == capacidad;
    }	
	public boolean pilaVacia() {
		return tope== 0;
	}
	/* public PilaEstatica crearCopia() {
	        PilaEstatica copia = new PilaEstatica();
	        copia.pila = Arrays.copyOf(this.pila, this.pila.length);
	        copia.tope = this.tope;
	        return copia; 
	    } */
	//
	
	//1.METODO PARA CREAR PILA
	public void crearPila() {
		this.nombre= nombre;
        this.capacidad = capacidad;
        pila = new int[capacidad];
        tope = -1; // Inicializamos tope en 0
        System.out.println("Pila '" + nombre + "' creada con capacidad máxima de " + capacidad);
    }
	
	//2.METODO PARA APILAR ELEMENTO
	public void apilarElemento(int elemento) {
		if(!pilaLlena()) {
			tope++;
			pila[tope]= elemento;
			ordenApilado[tope] = tope + 1; // Orden empieza en 1
			System.out.println("Elemento: "+elemento+" apilado correctamente.");
		}else {
			System.out.println("La pila esta llena. No es posible seguir apilando.");
		}
	}
	
	//3.METODO PARA DESAPILAR ELEMENTO
	public int desapilarElemento() {
		if(!pilaVacia()) {
			int elementoDesapilado= pila[tope];
			tope--; //Necesario para no sobreescribir la posicion en la que estaba el elemento que acaba de ser desapilado. 
			System.out.println("Elemento: "+elementoDesapilado+" desapilado correctamente.");
			return elementoDesapilado;
		}else {
			System.out.println("La pila esta vacia. No es posible seguir desapilando.");
			return -1; //valor de error.
		}
	}
	
	//4.METODO PARA DEVOLVER EL VALOR EN EL TOPE DE LA PILA
	public int topePila() {
		if(!pilaVacia()) {
			return pila[tope];
		}else {
			System.out.println("La pila esta vacia.");
			return -1;
		}
	}
	//5.METODO PARA SEÑALAR QUE LA PILA ESTA VACIA
	public void señalarPilaVacia() {
		if(!pilaVacia()) {
			System.out.println("La pila no esta vacia.");
		}else {
			System.out.println("La pila esta vacia.");
		}
	}
	//6.METODO PARA COMPROBAR SI TIENE EL ELEMENTO
	public boolean contieneElemento(int elemento) {
	    for (int i = 0; i < tope; i++) {
	        if (pila[i] == elemento) {
	            return true;
	        }
	    }
	    return false;
	}
	
	//7.METODO PARA MOSTRAR LOS ELEMENTOS DENTRO DE LA PILA. 
	public void mostrar() {
	    if (!pilaVacia()) {
	        for (int i = 1; i <= tope; i++) {
	            System.out.println(pila[i]);
	        }
	    } else {
	        System.out.println("La pila está vacía.");
	    }
	}
	
/*	//7.METODO DESAPILAR ORDEN
	public int desapilarOrden() {
        if (!pilaVacia()) {
            int orden = ordenApilado[tope];
            tope--;
            return orden;
        } else {
            return -1; // Valor de error
        }
    } */
}	

