package proyect.demo1.Personas;

public class NodoPersona {

    private String nombre;
    private int numero;
    private NodoPersona izdo;
    private NodoPersona dcho;

    // Constructor
    public NodoPersona(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.izdo = this.dcho = null;
    }

    // Constructor con subárboles
    public NodoPersona(NodoPersona izdo, String nombre, int numero, NodoPersona dcho) {
        this.nombre = nombre;
        this.numero = numero;
        this.izdo = izdo;
        this.dcho = dcho;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public NodoPersona getSubArbolIzdo() {
        return izdo;
    }

    public NodoPersona getSubArbolDcho() {
        return dcho;
    }

    public void setRamaIzdo(NodoPersona n) {
        this.izdo = n;
    }

    public void setRamaDcho(NodoPersona n) {
        this.dcho = n;
    }

    // Método para imprimir datos del nodo
    public void imprimirDato() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número: " + this.numero);
    }
}
