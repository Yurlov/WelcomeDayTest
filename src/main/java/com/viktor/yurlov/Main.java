package com.viktor.yurlov;

import com.viktor.yurlov.creator.WMCreator;
import com.viktor.yurlov.messages.Message;

import java.time.LocalDateTime;

/**
 * Created by Viktor on 14.08.17.
 */

public class Main {
    public static void main(String[] args) {
        WMCreator WMCreator = new WMCreator();
        Message msg = WMCreator.getWelcomeMessage(LocalDateTime.now().getHour());
        msg.showMassage();
    }
}
