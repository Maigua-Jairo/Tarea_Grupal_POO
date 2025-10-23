public class SobreCargaMetodos {
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Para " + destinatario + ": " + mensaje);
    }
}
