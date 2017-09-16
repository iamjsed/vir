package com.asurion.paops.hackaton.vir;

/**
 * Created by iamjsed on 16/09/2017.
 */

public class NotificationData {

    public static final String TEXT = "TEXT";
    public static final String DATA = "DATA";

    private int id;
    private String notificationTitle;
    private String notificationBody;
    private String soundName;
    private String iconName;
    private String data;

    public NotificationData(int id, String notificationTitle, String notificationBody, String soundName, String iconName, String payload) {
        this.id = id;
        this.notificationTitle = notificationTitle;
        this.notificationBody = notificationBody;
        this.soundName = soundName;
        this.iconName = iconName;
        this.data = payload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationBody() {
        return notificationBody;
    }

    public void setNotificationBody(String notificationBody) {
        this.notificationBody = notificationBody;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
