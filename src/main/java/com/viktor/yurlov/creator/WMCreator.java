package com.viktor.yurlov.creator;
import com.viktor.yurlov.messages.*;
import java.util.logging.Logger;

/**
 * Created by Viktor on 14.07.17.
 */

public class WMCreator implements MessageCreator {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(WMCreator.class));

    @Override
    public Message getWelcomeMessage(int hours) {
        if ((hours >= 6) && (hours < 9)) {
            return new MorningMessage();
        } else if ((hours >= 9) && (hours < 19)) {
            return new DayMassage();
        } else if ((hours >= 19) && (hours < 23)) {
            return new EveningMessage();
        } else {
            if ((hours == 23) || ((hours < 6) && (hours >= 0))) {
                return new NightMessage();
            } else {
                LOGGER.warning("Invalid time:  "+hours);
                return null;
            }
        }
    }
}
