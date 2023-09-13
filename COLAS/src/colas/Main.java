package colas;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int op;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Bienvenido al producto colas!!");
			System.out.println("Menu: ");
			System.out.println("1. Implementar una cola con linkedList");
			System.out.println("2. Implementar un cola con nodos");
			System.out.println("3. Salir");
			System.out.print("Ingrese una opcion: ");
			op = sc.nextInt();
			while(op > 3 || op < 1) {
            	System.out.print("Ingrese una opcion nuevamente: ");
            	op = sc.nextInt();
            }
			if(op == 3) {
				break;
			}
            sc.nextLine();
			
            switch(op) {
            
            	case 1:
            		COLALKL<String> cola = new COLALKL<>();
                    Scanner scanner = new Scanner(System.in);
                    int opcion;

                    do {
                        System.out.println("Menú:");
                        System.out.println("1. Agregar elemento");
                        System.out.println("2. Sacar elemento");
                        System.out.println("3. Ver primer elemento");
                        System.out.println("4. Ver último elemento");
                        System.out.println("5. Ver si la cola esta vacia");
                        System.out.println("6. Vaciar cola");
                        System.out.println("7. Ver numero de elementos(largo)");
                        System.out.println("8. Mostrar cola");
                        System.out.println("9. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcion = scanner.nextInt();
                        while(opcion > 9 || opcion < 1) {
                        	System.out.print("Ingrese una opcion nuevamente: ");
                        	opcion = sc.nextInt();
                        }
                        scanner.nextLine();

                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese el elemento a agregar: ");
                                String nuevoElemento = scanner.nextLine();
                                cola.enfilar(nuevoElemento);
                                System.out.println("Elemento agregado correctamente");
                                break;
                            case 2:
                                String elementoSacado = cola.sacar();
                                if (elementoSacado != null) {
                                    System.out.println("Elemento sacado: " + elementoSacado);
                                } else {
                                    System.out.println("La cola está vacía.");
                                }
                                break;
                            case 3:
                                String primerElemento = cola.verPrimero();
                                if (primerElemento != null) {
                                    System.out.println("Primer elemento: " + primerElemento);
                                } else {
                                    System.out.println("La cola está vacía.");
                                }
                                break;
                            case 4:
                                String ultimoElemento = cola.verUltimo();
                                if (ultimoElemento != null) {
                                    System.out.println("Último elemento: " + ultimoElemento);
                                } else {
                                    System.out.println("La cola está vacía.");
                                }
                                break;
                            case 5:
                            	if(cola.estaVacia()) {
                            		System.out.println("La cola esta vacia");
                            	}
                            	else {
                            		System.out.println("La cola contiene elementos");
                            	}
                            	break;
                            case 6:
                            	cola.vaciar();
                            	System.out.println("La cola vaciada con exito");
                            	break;
                            case 7:
                            	long elementos = cola.largo();
                            	System.out.println("La cantidad de elementos de la cola es de: " + elementos);
                            	break;
                            case 8:
                            	cola.mostrarCola();
                            	break;
                            case 9:
                                System.out.println("Saliendo del programa.");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcion != 9);
                    
                    scanner.close();
            		break;
            	case 2:
            		COLAND<String> cola2 = new COLAND<>();
            		Scanner sc2 = new Scanner(System.in);
            		
            		int opcion2;
            		do {
            			System.out.println("Menú:");
            			System.out.println("1. Añadir un nodo al final de la cola");
                        System.out.println("2. Sacar el primer nodo de la cola");
            			System.out.println("3. Ver si la cola esta vacia");
                        System.out.println("4. Vaciar cola");
                        System.out.println("5. Ver primer elemento");
                        System.out.println("6. Ver último elemento");
                        System.out.println("7. Ver numero de elementos(largo)");
                        System.out.println("8. Mostrar cola");
                        System.out.println("9. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcion2 = sc.nextInt();
                        while(opcion2 > 9 || opcion2 < 1) {
                        	System.out.print("Ingrese una opcion nuevamente: ");
                        	opcion2 = sc2.nextInt();
                        }
                       
                        switch(opcion2) {
                        	case 1: 
                        		System.out.print("Ingrese el elemento a enfilar: ");
                                
                                String elemento = sc2.nextLine();
                                
                                cola2.enfilar(elemento);
                                System.out.println("Elemento '" + elemento + "' enfilado.");
                                break;
                        	case 2:
                        		String elementoSacado = cola2.sacar();
                                if (elementoSacado != null) {
                                    System.out.println("Elemento sacado: " + elementoSacado);
                                } else {
                                    System.out.println("La cola está vacía, no se puede sacar elemento.");
                                }
                                break;     		
                        	case 3:
                        		if(cola2.estaVacio()) {
                        			System.out.println("La cola esta vacia");
                        		}
                        		else {
                        			System.out.println("La cola no esta vacia");
                        		}
                        		break;         		 
                        	case 4:
                        		cola2.vaciar();
                        		System.out.println("Cola vaciada");
                        		break;           		
                        	case 5:
                        		String primero = cola2.verPrimero();
                                if (primero != null) {
                                    System.out.println("Primer elemento: " + primero);
                                } else {
                                    System.out.println("La cola está vacía.");
                                }
                                break;
                        	case 6:
                        		String ultimo = cola2.verUltimo();
                                if (ultimo != null) {
                                    System.out.println("Último elemento: " + ultimo);
                                } else {
                                    System.out.println("La cola está vacía.");
                                }
                                break;
                        	case 7:
                        		long largo = cola2.largo();
                        		System.out.println("El tamaño de la cola es: " + largo);
                        		break;
                        	case 8:
                        		cola2.mostrarCola();
                        		break;
                        	case 9:
                        		System.out.println("Saliendo del programa");
                        		break;
                        }
            		}while(opcion2 !=9);
            		
            		sc2.close();
            		break;
            	case 3:
            		break;
            	default:
            		System.out.println("Opcion incorrecta");
            }
            break;
            
		}while(op != 4);
		
		sc.close();
		
		System.out.println("Adios :)");
	}

}