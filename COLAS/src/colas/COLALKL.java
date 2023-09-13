package colas;

import java.util.LinkedList;
import java.util.Scanner;

public class COLALKL<C> { // forma de definir una clase, interfaz o método para que funcione con tipos de datos
							//específicos que no se determinan hasta que se utiliza la clase, interfaz o método.

	private LinkedList<C> lista;
	
	// CONSTRUCTOR
	public COLALKL() {
		lista = new LinkedList<>();
	}
	
	// RETORNA TRUE SI LA COLA ESTA VACIA, SINO, FALSE
	public boolean estaVacia() {
		return lista.isEmpty();
	}
	
	// REMUEVE TODO EL CONTENIDO DE LA COLA
	public void vaciar() {
		lista.clear();
	}
	
	// RETORNA EL LARGO(NUMERO DE ELEMENTOS) DE LA COLA
	public long largo() {
		return lista.size();
	}
	
	// RETORNA EL VALOR DEL CONTENIDO DE PRIMERO EN LA COLA
	public C verPrimero() {
		if(!lista.isEmpty()) {
			
			return lista.getFirst();
		}
		return null;
	}
	
	// RETORNA EL VALOR DEL CONTENIDO DE ULTIMO EN LA COLA
	public C verUltimo() {
		if(!lista.isEmpty()) {
			return lista.getLast();
		}
		return null;
	}
	
	// AÑADE UN NODO QUE CONTIENE A NUEVO OBJETO AL FINAL DE LA COLA
	public void enfilar(C nuevoObjeto) {
		lista.addLast(nuevoObjeto);
	}
	
	// SACA EL PRIMER NODO DE LA COLA Y RETORNA SU CONTENIDO
	public C sacar() {
        if (!lista.isEmpty()) {
            return lista.removeFirst();
        }
        return null;
    }
	
	// METODO PARA MOSTRAR LA COLA
	public void mostrarCola() {
	    if (lista.isEmpty()) {
	        System.out.println("La cola está vacía.");
	    } else {
	        System.out.print("Cola: ");
	        for (C elemento : lista) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	}
}
