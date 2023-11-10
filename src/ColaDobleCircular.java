public class ColaDobleCircular {
    private int limite;
    private int[] cola;
    private int inicio;
    private int fin;

    public ColaDobleCircular(int limite) {
        this.limite = limite;
        this.cola = new int[limite];
        this.inicio = -1;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return inicio == -1;
    }

    public boolean estaLlena() {
        return (fin + 1) % limite == inicio;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        System.out.println("Elementos en la cola:");
        int current = inicio;
        do {
            System.out.println(cola[current]);
            current = (current + 1) % limite;
        } while (current != (fin + 1) % limite);
    }

    public void insertarInicio(int valor) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede insertar.");
            return;
        }

        if (estaVacia()) {
            inicio = 0;
            fin = 0;
        } else {
            inicio = (inicio - 1 + limite) % limite;
        }

        cola[inicio] = valor;
    }

    public void insertarFin(int valor) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede insertar.");
            return;
        }

        if (estaVacia()) {
            inicio = 0;
            fin = 0;
        } else {
            fin = (fin + 1) % limite;
        }

        cola[fin] = valor;
    }

    public void eliminarInicio() {
        if (estaVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        if (inicio == fin) {
            inicio = -1;
            fin = -1;
        } else {
            inicio = (inicio + 1) % limite;
        }
    }

    public void eliminarFin() {
        if (estaVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        if (inicio == fin) {
            inicio = -1;
            fin = -1;
        } else {
            fin = (fin - 1 + limite) % limite;
        }
    }

    public void MostrarCreditos(){
        System.out.println("Creditos: ");
        System.out.println("Materia: Estructura de datos");
        System.out.println("Nombre: Marco Antonio Chavez Baltierrez || 4C || 22170149");
        System.out.println("Nombre: Jesus Alberto Ramirez Gonzalez  || 4C || 22170147");
    }
}
