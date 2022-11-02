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
    public void no_too_long_array() {
        Colour no_longer_array = new Colour(new int[25]);
    }
    @Test
    public void convert_from_int_array_to_correct_int(){

        int[] white_val = new int[24];

        for (int i = 0; i < 24; i++) {
            white_val[i] = 1;
        }

        Colour white2 = new Colour(white_val);
        Assert.assertEquals(255.0, white2.getRed(), 0.01);
    }

}