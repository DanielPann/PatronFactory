public class Main {
    public static void main(String[] args) {
        String tipo = "Whatsapp";

        Notificacion notificacion = NotificacionFactory.createNotificacion(tipo);
        notificacion.send("¡Hola! Este es un mensaje de prueba.");
    }
}
