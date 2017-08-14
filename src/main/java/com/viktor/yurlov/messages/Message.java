package com.viktor.yurlov.messages;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Viktor on 14.08.17.
 */
public abstract class Message {
    private static final String MESSAGES_File = "messages";
    private static final String WORLD = "world";
    private static final String END = "end";



    public String getMessage() {
        StringBuilder ms = new StringBuilder();
        ms.append(ResourceBundle.getBundle(MESSAGES_File, Locale.getDefault()).getString(getTimeOfDay()))
                .append(", ")
                .append(ResourceBundle.getBundle(MESSAGES_File, Locale.getDefault()).getString(WORLD))
                .append(ResourceBundle.getBundle(MESSAGES_File, Locale.getDefault()).getString(END));
        return ms.toString();
    }
    public abstract String getTimeOfDay();
    public void showMassage() {
        System.out.println(getMessage());
    }


}
