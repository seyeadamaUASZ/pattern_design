package com.sid.gl.Facade;

public class NotificationSms implements Notification{
    @Override
    public String sendNotification() {
        return "send sms";
    }
}
