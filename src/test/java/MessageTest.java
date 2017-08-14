
/**
 * Created by Viktor on 14.08.17.
 */

import com.viktor.yurlov.creator.WMCreator;
import org.junit.Test;

import java.util.Locale;

import static junit.framework.Assert.assertEquals;

public class MessageTest {
    private static final String WORLD_EN = "World";
    private static final String WORLD_RU = "Мир";
    private static final String WORLD_UA = "Світ";
    private static final String END = "!";

    @Test
    public void testMorning() throws Exception {
        WMCreator welcomeMessageCreator = new WMCreator();
        String result;
        String lang = Locale.getDefault().getLanguage();
        for (int i = 6; i < 9; i++) {
            result = welcomeMessageCreator.getWelcomeMessage(i).getMessage();
            if (lang.equals("ua")) {
                assertEquals("Доброго ранку, " + WORLD_UA + END, result);
            } else if (lang.equals("ru")) {
                assertEquals("Доброе утро, " + WORLD_RU + END, result);
            } else {
                assertEquals("Good morning, " + WORLD_EN + END, result);
            }
        }
    }

    @Test
    public void testDay() throws Exception {
        WMCreator wMCreator = new WMCreator();
        String lang = Locale.getDefault().getLanguage();
        String result;
        for (int i = 9; i < 19; i++) {
            result = wMCreator.getWelcomeMessage(i).getMessage();
            if (lang.equals("ua")) {
                assertEquals("Добрий день, " + WORLD_UA + END, result);
            } else if (lang.equals("ru")) {
                assertEquals("Добрый день, " + WORLD_RU + END, result);
            } else {
                assertEquals("Good day, " + WORLD_EN + END, result);
            }
        }
    }

    @Test
    public void testEvening() throws Exception {
        WMCreator welcomeMessageCreator = new WMCreator();
        String lang = Locale.getDefault().getLanguage();
        String result;
        for (int i = 19; i < 23; i++) {
            result = welcomeMessageCreator.getWelcomeMessage(i).getMessage();
            if (lang.equals("ua")) {
                assertEquals("Добрий вечір, " + WORLD_UA + END, result);
            } else if (lang.equals("ru")) {
                assertEquals("Добрый вечер, " + WORLD_RU + END, result);
            } else {
                assertEquals("Good evening, " + WORLD_EN + END, result);
            }
        }
    }

    @Test
    public void testNight() throws Exception {
        WMCreator wMCreator = new WMCreator();
        String lang = Locale.getDefault().getLanguage();
        String result;
        int[] hours = {23, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < hours.length; i++) {
            result = wMCreator.getWelcomeMessage(hours[i]).getMessage();
            if (lang.equals("ua")) {
                assertEquals("Доброї ночі, " + WORLD_UA + END, result);
            } else if (lang.equals("ru")) {
                assertEquals("Доброй ночи, " + WORLD_RU + END, result);
            } else {
                assertEquals("Good night, " + WORLD_EN + END, result);
            }
        }
    }

    @Test(expected = Exception.class)
    public void testCrash() throws Exception {
        int invalidHour = 125;
        WMCreator wmCreator = new WMCreator();
        wmCreator.getWelcomeMessage(invalidHour).getMessage();
    }

}
