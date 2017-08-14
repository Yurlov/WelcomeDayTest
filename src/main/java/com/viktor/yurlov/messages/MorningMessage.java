package com.viktor.yurlov.messages;

/**
 * Created by Viktor on 14.08.17.
 */
public class MorningMessage extends Message {
    private static final String MORNING = "morning";

    @Override
    public String getTimeOfDay() {
        return MORNING;
    }

}
