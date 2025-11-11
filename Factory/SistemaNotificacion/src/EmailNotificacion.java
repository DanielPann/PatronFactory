public class EmailNotificacion implements Notificacion {
    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }
}
