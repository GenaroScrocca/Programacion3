package colas;

public class Nodo<S> {

	// ATRIBUTOS DEL NODO
	private S dato;
	private Nodo<S> siguiente;
	
	public Nodo(S dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}

	public S getDato() {
		return dato;
	}

	public void setDato(S dato) {
		this.dato = dato;
	}

	public Nodo<S> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<S> siguiente) {
		this.siguiente = siguiente;
	}
	

}