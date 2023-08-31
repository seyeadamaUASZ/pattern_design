package com.sid.gl.Facade;

public class NotificationEmail implements Notification{
    @Override
    public String sendNotification() {
        return "send notification with email";
    }
}
