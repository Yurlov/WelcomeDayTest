package com.viktor.yurlov.messages;

/**
 * Created by Viktor on 14.08.17.
 */
public class NightMessage extends Message {
    private static final String NIGHT = "night";

    @Override
    public String getTimeOfDay() {
        return NIGHT;
    }

}
