package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestYou {
    @Test
    public void mustReturnName(){
        You.getInstance().setName("V");
        assertEquals("V", You.getInstance().getName());
    }

    @Test
    public void mustReturnGender(){
        You.getInstance().setGender("Male");
        assertEquals("Male", You.getInstance().getGender());
    }

    @Test
    public void mustReturnFeeling(){
        You.getInstance().setFeeling("Hatred");
        assertEquals("Hatred", You.getInstance().getFeeling());
    }

    @Test
    public void mustReturnRevealFeeling(){
        You.getInstance().setFeeling("Hatred");
        assertEquals(
                "You're now feeling " + You.getInstance().getFeeling(),
                You.getInstance().revealFeeling()
        );
    }
}
