import org.junit.Assert;
import org.junit.Test;


public class ColourTest {

    @Test(expected = IllegalArgumentException.class)
    public void no_negative_values(){

        Colour no_below_one = new Colour(-0.6, 0.5, 0.4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void no_values_over_one(){

        Colour no_over_one = new Colour(1.4, 1.5, 0.2);
    };

    @Test(expected = IllegalArgumentException.class)
    public void too_long_array() {
        Colour no_longer_array = new Colour(new int[25]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void not_binary_array() {
        int[] wrong_input = new int[24];
        wrong_input[18] = 6;

        Colour white = new Colour(wrong_input);
    }
    @Test
    public void convert_from_int_array_to_correct_int(){

        int[] white_val = new int[24];

        for (int i = 0; i < 24; i++) {
            white_val[i] = 1;
        }

        Colour white = new Colour(white_val);
        Assert.assertEquals(255.0, white.getRed(), 0.01);
    }

    @Test
    public void colours_can_be_compared() {
        Colour raspberry1 = new Colour(1,0.325,0.286);

        int[] raspberry2_binary = {0,1,0,0,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1};
        Colour raspberry2 = new Colour(raspberry2_binary);

        Assert.assertEquals(raspberry1, raspberry2);
    }
}