import org.junit.Assert;
import org.junit.Test;


public class ColourTest {

    @Test(expected = IllegalArgumentException.class)
    public void no_negative_values(){
        Colour no_neg = new Colour(-0.6, 0.5, 0.4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void no_values_over_one(){
        Colour no_over_one = new Colour(1.4, 1.5, 0.2);
    }

    @Test
    public void combined_constructor(){
        // Blue[0:7], Green[8:15], Red[7:15]
        int[] rgb_val = new int[24];

        for (int i = 0; i < 24; i++) {
            rgb_val[i] = 1;
        }

        Colour combined_values = new Colour(rgb_val);
    }

}