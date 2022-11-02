import java.util.ArrayList;
import java.util.Arrays;

public class Colour {
    double red;
    double green;
    double blue;
    int[] rgb;
    int[] convert_red;
    int[] convert_green;
    int[] convert_blue;

    public Colour(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        if ((red < 0 || red > 1) || (green < 0 || green > 1) || (blue < 0 || blue > 1)){
            throw new IllegalArgumentException();
        }
    }

    public Colour(int[] rgb) {
        this.rgb = rgb;

        this.convert_blue = Arrays.copyOfRange(rgb, 0, 7);
        this.convert_green = Arrays.copyOfRange(rgb, 8, 15);
        this.convert_red = Arrays.copyOfRange(rgb, 16, 23);


    }

}
