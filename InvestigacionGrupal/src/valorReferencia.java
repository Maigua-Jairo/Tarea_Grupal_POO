//Paso por referencia
public class valorReferencia {
    public String nombre;

    public static void cambiarNombre(valorReferencia p) {
        p.nombre = "Carlos";  // Esto SÍ cambia el original
        System.out.println("Dentro del método: " + p.nombre);
    }

}