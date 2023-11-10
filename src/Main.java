import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limite = 10;
        ColaDobleCircular cola = new ColaDobleCircular(limite);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Inicializar / Borrar Cola");
            System.out.println("2. Mostrar Cola");
            System.out.println("3. Insertar");
            System.out.println("4. Eliminar");
            System.out.println("5. Créditos");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cola = new ColaDobleCircular(limite);
                    System.out.println("Cola inicializada.");
                    break;
                case 2:
                    cola.mostrarCola();
                    break;
                case 3:
                    if (!cola.estaLlena()) {
                        System.out.println("1. Insertar por el inicio");
                        System.out.println("2. Insertar por el final");
                        int seleccion = scanner.nextInt();
                        System.out.println("Ingrese el valor a insertar: ");
                        int valor = scanner.nextInt();

                        if (seleccion == 1) {
                            cola.insertarInicio(valor);
                        } else if (seleccion == 2) {
                            cola.insertarFin(valor);
                        } else {
                            System.out.println("Opción no válida");
                        }
                    } else {
                        System.out.println("La cola está llena. No se puede insertar.");
                    }
                    break;
                case 4:
                    if (!cola.estaVacia()) {
                        System.out.println("1. Eliminar por el inicio");
                        System.out.println("2. Eliminar por el final");
                        int seleccion = scanner.nextInt();

                        if (seleccion == 1) {
                            cola.eliminarInicio();
                        } else if (seleccion == 2) {
                            cola.eliminarFin();
                        } else {
                            System.out.println("Opción no válida");
                        }
                    } else {
                        System.out.println("Cola Vacía");
                    }
                    break;
                case 5:
                    cola.MostrarCreditos();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}