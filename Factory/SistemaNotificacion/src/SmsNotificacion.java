public class SmsNotificacion implements Notificacion {

    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
