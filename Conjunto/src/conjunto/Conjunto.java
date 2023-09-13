package conjunto;

import java.util.ArrayList;

public class Conjunto {

	// CREACION DE ARRAYLIST
	private ArrayList<Integer> elementos;
	
	// CONSTRUCTOR
	public Conjunto() {
		
		elementos = new ArrayList<>();
	}
	
	// VERIFICAR SI EL CONJUNTO ESTA VACIO
	public boolean estaVacio() {
        return elementos.isEmpty();
    }
	
	// AÑADIR ELEMENTOS AL ARREGLO
	public void agregarElementos(int elemento) {
		
		if(!elementos.contains(elemento)) {
			elementos.add(elemento);
		}
	}
	
	// SI UN ELEMENTO PERTENECE
	public void perteneceElemento(int elemento) {
		
		if(elementos.contains(elemento)) {
			System.out.println("El elemento " + elemento + " esta en el arreglo");
		}
		else {
			System.out.println("El elemento " + elemento + " no esta en el arreglo");
		}
	}
	
	// RETIRAR UN ELEMENTO DEL ARREGLO
	public void eliminarElemento(int elemento) {
        elementos.remove(Integer.valueOf(elemento));
    }
	
	// METODO QUE DETERMINA EL NUMERO DE ELEMENTOS QUE CONTIENE EL CONJUNTO
	public int nElementos() {
		return elementos.size();
	}
	
	// MUESTRA TODOS LOS ELEMENTOS DEL CONJUNTO
	public void mostrarElementos() {
	    String resultado = "";

	    for (int i = 0; i < elementos.size(); i++) {
	        resultado += elementos.get(i);

	        // Si no es el último elemento, agregar un guión
	        if (i < elementos.size() - 1) {
	            resultado += "-";
	        }
	    }

	    System.out.println(resultado);
	}
}
