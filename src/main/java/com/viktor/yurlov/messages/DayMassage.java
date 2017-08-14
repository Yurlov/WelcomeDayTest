package com.viktor.yurlov.messages;

/**
 * Created by Viktor on 14.08.17.
 */
public class DayMassage extends Message {
    private static final String DAY = "day";

    @Override
    public String getTimeOfDay() {
        return DAY;
    }

}
