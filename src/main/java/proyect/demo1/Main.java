package proyect.demo1;
import proyect.demo1.Personas.ArbolPersona;

public class Main {

    public static void main(String[] args) {
        ArbolPersona arbol = new ArbolPersona();
        arbol.insertar("Juan", 504023);
        arbol.insertar("Pedro", 504024);
        arbol.insertar("Maria", 504025);
        arbol.insertar("Ana", 504026);


        System.out.println("Fin");


}
}

