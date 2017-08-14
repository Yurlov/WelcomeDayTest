package com.viktor.yurlov.creator;
import com.viktor.yurlov.messages.Message;
/**
 * Created by Viktor on 14.08.17.
 */

public interface MessageCreator {
    Message getWelcomeMessage(int hours);
}
