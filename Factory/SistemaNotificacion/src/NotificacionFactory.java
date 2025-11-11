public class NotificacionFactory {
   public static Notificacion createNotificacion(String type){
    Notificacion notificacion = null;
    if (type.equals("SMS")){
        notificacion = new SmsNotificacion();
    } else if (type.equals("Email")){
        notificacion = new EmailNotificacion();
    } else if (type.equals("Whatsapp")){
        notificacion = new WhatsNotificacion();
    }
    return notificacion;

   }
}
