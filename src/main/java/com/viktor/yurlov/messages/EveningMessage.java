package com.viktor.yurlov.messages;

/**
 * Created by Viktor on 14.08.17.
 */
public class EveningMessage extends Message {

    private static final String EVENING = "evening";

    @Override
    public String getTimeOfDay() {
        return EVENING;
    }

}
