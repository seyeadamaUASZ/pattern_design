package com.sid.gl.Facade;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFacade.checkNotification("sms");
        System.out.println(notification.sendNotification());
    }
}
