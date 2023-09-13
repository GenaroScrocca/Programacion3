import java.util.Scanner;

public class MainPila {
	PilaDinamica pilaDinamica = null;
	PilaEstatica pilaEstatica = null;
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Trabajar con Pila Estática");
            System.out.println("2. Trabajar con Pila Dinámica");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuPilaEstatica();
                    break;
                case 2:
                    menuPilaDinamica();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }

    public static void menuPilaEstatica() {

        PilaDinamica pilaDinamica = null;
        PilaEstatica pilaEstatica = null; // Crea la instancia de PilaEstatica
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elija una opción para la Pila Estática:");
            System.out.println("1. Crear Pila");
            System.out.println("2. Apilar Elemento");
            System.out.println("3. Desapilar Elemento");
            System.out.println("4. Mostrar Tope");
            System.out.println("5. Verificar si la Pila está vacía");
            System.out.println("6. Ver elementos dentro de la pila");
            System.out.println("7. Volver al menu principal");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	 if (pilaEstatica == null) {
                         scanner.nextLine(); // Consumir el salto de línea
                         System.out.print("Ingrese el nombre de la pila: ");
                         String nombre = scanner.nextLine();

                         System.out.print("Ingrese la capacidad de la pila: ");
                         int capacidad = scanner.nextInt();

                         pilaEstatica = new PilaEstatica(nombre, capacidad);
                         System.out.println("Pila '" + nombre + "' creada con capacidad máxima de " + capacidad);
                     } else {
                         System.out.println("Ya existe una pila estática. Por favor, elija otra opción.");
                     }
                     break;
                case 2:
                	if (pilaEstatica != null) {
                        System.out.print("Ingrese el elemento a apilar: ");
                        int elemento = scanner.nextInt();
                        pilaEstatica.apilarElemento(elemento);
                    } else {
                        System.out.println("Primero debe crear una pila estática. Seleccione la opción 1.");
                    }
                    break;             
                case 3:
                	  if (pilaEstatica != null) {
                          if (!pilaEstatica.pilaVacia()) {
                              int elementoDesapilado = pilaEstatica.desapilarElemento();
                              System.out.println("Elemento desapilado: " + elementoDesapilado);
                          } else {
                              System.out.println("La pila está vacía. No es posible desapilar.");
                          }
                      } else {
                          System.out.println("Primero debe crear una pila estática. Seleccione la opción 1.");
                      }
                    break;
                case 4:
                	if (pilaEstatica != null) {
                        int topePila = pilaEstatica.topePila();
                        if (topePila != -1) {
                            System.out.println("Elemento en el tope de la pila: " + topePila);
                        }
                    } else {
                        System.out.println("Primero debe crear una pila estática. Seleccione la opción 1.");
                    }
                    break;
                case 5:
                	  if (pilaEstatica != null) {
                          pilaEstatica.señalarPilaVacia();
                      } else {
                          System.out.println("Primero debe crear una pila estática. Seleccione la opción 1.");
                      }
                    break;
                case 6:
                	pilaEstatica.mostrar();
                case 7:
                	  System.out.println("Volviendo al menú principal...");
                	  break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }

        } while (opcion != 7);

      
    }

    public static void menuPilaDinamica() {
       
        PilaDinamica pilaDinamica= null;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elija una opción para la Pila Dinámica:");
            System.out.println("1. Crear Pila");
            System.out.println("2. Apilar Elemento");
            System.out.println("3. Desapilar Elemento");
            System.out.println("4. Mostrar Tope");
            System.out.println("5. Verificar si la Pila está vacía");
            System.out.println("6. Ver elementos en la Pila");
            System.out.println("7. Volver al menu principal");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	if (pilaDinamica == null) {
                        pilaDinamica = new PilaDinamica();
                        System.out.println("Pila Dinámica creada.");
                    } else {
                        System.out.println("Ya existe una Pila Dinámica. No es posible crear otra.");
                    }             
                    break;
                case 2:
                	if (pilaDinamica != null) {
                        System.out.print("Ingrese el elemento a apilar: ");
                        int elemento = scanner.nextInt();
                        pilaDinamica.apilarElemento(elemento);
                    } else {
                        System.out.println("Primero debe crear una Pila Dinámica. Seleccione la opción 1.");
                    }
                    break;
                case 3:
                	if (pilaDinamica != null) {
                        int elementoDesapilado = pilaDinamica.desapilarElemento();
                        
                    } else {
                        System.out.println("Primero debe crear una Pila Dinámica. Seleccione la opción 1.");
                    }
                    break;
                case 4:
                	if (pilaDinamica != null) {
                        int valorTope = pilaDinamica.topePila();
                        if (valorTope != -1) {
                            System.out.println("Valor en el tope de la pila: " + valorTope);
                        }
                    } else {
                        System.out.println("Primero debe crear una Pila Dinámica. Seleccione la opción 1.");
                    }
                    break;
                case 5:
                	 if (pilaDinamica != null) {
                         System.out.print("Ingrese el elemento a buscar: ");
                         int elementoBuscar = scanner.nextInt();
                         boolean contieneElemento = pilaDinamica.contieneElemento(elementoBuscar);
                         if (contieneElemento) {
                             System.out.println("La pila contiene el elemento " + elementoBuscar);
                         } else {
                             System.out.println("La pila no contiene el elemento " + elementoBuscar);
                         }
                     } else {
                         System.out.println("Primero debe crear una Pila Dinámica. Seleccione la opción 1.");
                     }
                    break;
                case 6:
                	pilaDinamica.mostrar();
                    break;
                case 7: 
                	 System.out.println("Volviendo al menú principal...");
                	break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }

        } while (opcion != 7);

    
    }
  /*//METODO PARA BUSCAR ELEMENTO
  	public static void buscarElemento(int elemento, PilaEstatica pilaEstatica, PilaDinamica pilaDinamica) {
          boolean estaEnPilaEstatica = pilaEstatica.contieneElemento(elemento);
          boolean estaEnPilaDinamica = pilaDinamica.contieneElemento(elemento);

          if (estaEnPilaEstatica && estaEnPilaDinamica) {
              System.out.println("El elemento está en ambas pilas.");
          } else if (estaEnPilaEstatica) {
              System.out.println("El elemento está en la Pila Estática.");
          } else if (estaEnPilaDinamica) {
              System.out.println("El elemento está en la Pila Dinámica.");
          } else {
              System.out.println("El elemento no está en ninguna de las pilas.");
          }
      }
  	
  	//METODO PARA PRESENTAR POR PANTALLA TODOS LOS ELEMENTOS QUE SE ENCUENTRAN EN LAS PILAS.
  	private static void presentarPila(PilaEstatica pilaEstatica, PilaDinamica pilaDinamica) {
  	    PilaEstatica pilaCopiaEstatica = pilaEstatica.crearCopia();
  	    PilaDinamica pilaCopiaDinamica = pilaDinamica.crearCopia();

  	    System.out.println("Elementos en la Pila Estática:");
  	    while (!pilaCopiaEstatica.pilaVacia()) {
  	        int elemento = pilaCopiaEstatica.desapilarElemento();
  	        int orden = pilaCopiaEstatica.desapilarOrden();
  	        System.out.println(elemento);
  	    }

  	    System.out.println("\nElementos en la Pila Dinámica:");
  	    while (!pilaCopiaDinamica.pilaVacia()) {
  	        int elemento = pilaCopiaDinamica.desapilarElemento();
  	        System.out.println(elemento);
  	    }
  	}*/
}