import org.junit.Test;

import static org.junit.Assert.*;

public class ColourTest {

    @Test(expected = IllegalArgumentException.class)
    public void no_negative_values(){
        Colour no_neg = new Colour(-0.6, 0.5, 0.4);
    }

}