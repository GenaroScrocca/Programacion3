package colas;

public class COLAND<S>{

	// PRIMER NODO DE LA COLA Y ULTIMO CON SUS CARACTERISTICAS DE LA CLASE NODO
	private Nodo<S> primero;
	private Nodo<S> ultimo;
	private int largo;

	// CONSTRUCTOR CON LOS VALORES DE LOS NODOS VACIOS EN UN PRINCIPIO
	public COLAND() {
		primero = null;
		ultimo = null;
		largo = 0;
	}
   
	// METODO QUE RETORNA TRUE SI LA COLA NODO ESTA VACIA
	public boolean estaVacio() {
	
		return primero == null;
	}

	// METODO PARA REMOVER EL CONTENIDO DE LA COLA
	public void vaciar() {
		
		primero = null;
		ultimo = null;
		largo = 0; // reiniciar el tamaño de la cola
	}
	
	// RETORNA EL VALOR DEL CONTENIDO DEL PRIMER NODO EN LA COLA
	public S verPrimero() {
		if(estaVacio()) {
			return null;
		}
		return primero.getDato();
	}
	
	// VER EL CONTENIDO DEL NODO EN LA ULTIMA POSICION
	public S verUltimo() {
		if(estaVacio()) {
			return null;
		}
		return ultimo.getDato();
		
	}
	
	// AÑADE UN NODO QUE CONTIENE UN NUEVO OBJETO AL FINAL DE LA COLA, SE INCREMENTA CADA VEZ Q SE ENFILA
	public void enfilar(S dato) {
		// Creamos nuevo nodo con el dato proporcionado
		Nodo<S> nuevoNodo = new Nodo<>(dato);
		// Si la cola esta vacia
		if(estaVacio()) {
			// el nuevo nodo sera el primero y ultimo a la vez
			primero = nuevoNodo;
			ultimo = nuevoNodo;
		}
		else {
			// si no esta vacia establecemos el siguiente del último nodo al nuevo nodo
			ultimo.setSiguiente(nuevoNodo);
			// actualizamos el ultimo nodo para que sea el nuevo nodo
			ultimo = nuevoNodo;
		}
		// incrementamos el largo de la cola
		largo++;
	}
	
	// SACAR EL PRIMER ELEMENTO DE LA COLA
	// Método para desencolar un elemento
	public S sacar() {
	    // Verificamos si la cola está vacía
	    if (estaVacio()) {
	        return null; // Si está vacía, no hay nada para sacar, así que retornamos null
	    }
	    
	    // Guardamos el contenido del primer nodo en la variable 'elemento'
	    S elemento = primero.getDato();
	    
	    // Avanzamos el puntero 'primero' al siguiente nodo
	    primero = primero.getSiguiente();
	    
	    // Verificamos si después de avanzar 'primero', la cola queda vacía
	    if (primero == null) {
	        ultimo = null; // Si es así, el último nodo también debe ser nulo
	    }
	    
	    // Decrementamos el tamaño de la cola
	    largo--;
	    
	    // Retornamos el contenido del nodo que fue desencolado
	    return elemento;
	}
	// DETERMINAR EL LARGO DE LA COLA
	public long largo() {
		
		return largo;
	}
	
	// METODO PARA MOSTRAR COLA
	public void mostrarCola() {
	    Nodo<S> nodoActual = primero; // Empezamos desde el primer nodo

	    if (nodoActual == null) {
	        System.out.println("La cola está vacía.");
	    } else {
	        System.out.print("Cola: ");
	        while (nodoActual != null) {
	            System.out.print(nodoActual.getDato());
	            
	            nodoActual = nodoActual.getSiguiente();
	            
	            if (nodoActual != null) {
	                System.out.print(" - ");
	            }
	        }
	        System.out.println();
	    }
	}
}
