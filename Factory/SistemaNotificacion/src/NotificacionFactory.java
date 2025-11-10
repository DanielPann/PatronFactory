public class NotificacionFactory {
   public Notificacion createNotificacion(String type){
    Notificacion notificacion = null;
    if (type.equals("sms")){
        notificacion = new SmsNotificacion();
    } else if (type.equals("Email")){
        notificacion = new EmailNotificaion();
    } else if (type.equals("Whatsapp")){
        notificacion = new WhatsNotificacion();
    }
    return notificacion;

   }
}
