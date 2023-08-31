package com.sid.gl.Facade;

public class NotificationFacade {
    public static final String SMS="sms";
    public static final String EMAIl="email";

    public static Notification checkNotification(String notificationType){
        if(notificationType.equalsIgnoreCase(SMS)){
            return new NotificationSms();
        }
        if(notificationType.equalsIgnoreCase(EMAIl)){
            return new NotificationEmail();
        }
        return null;
    }
}
