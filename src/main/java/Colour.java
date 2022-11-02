import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.round;

public class Colour {
    double red;
    double green;
    double blue;
    int[] rgb = new int[24];
    int[] convert_red;
    int[] convert_green;
    int[] convert_blue;

    public Colour(double r, double g, double b) {
        this.red = Math.round(r * 255);
        this.green = Math.round(g * 255);
        this.blue = Math.round(b * 255);

        if ((this.red < 0 || this.red > 255) || (this.green < 0 || this.green > 255) || (this.blue < 0 || this.blue > 255)){
            throw new IllegalArgumentException("Decimal must be between 0 and 255");
        }
    }

    public Colour(int[] rgb) {

        if (rgb.length != 24) {
            throw new IllegalArgumentException("Incorrect Input");
        }

        for (int i: rgb) {
            if (i != 0 && i != 1){
                throw new IllegalArgumentException("Must be binary");
            }
        }

        this.rgb = rgb;

        this.convert_blue = Arrays.copyOfRange(rgb, 0, 8);
        this.convert_green = Arrays.copyOfRange(rgb, 8, 16);
        this.convert_red = Arrays.copyOfRange(rgb, 16, 24);

        // how to convert int[] to num between 0 and 255
        StringBuilder toParseBlue = new StringBuilder();
        for (int i: convert_blue) {
            toParseBlue.append(i);
        }

        StringBuilder toParseGreen = new StringBuilder();
        for (int i: convert_green) {
            toParseGreen.append(i);
        }

        StringBuilder toParseRed = new StringBuilder();
        for (int i: convert_red) {
            toParseRed.append(i);
        }

        this.red = Integer.parseInt(toParseRed.toString(), 2);
        this.blue = Integer.parseInt(toParseBlue.toString(), 2);
        this.green = Integer.parseInt(toParseGreen.toString(), 2);

        if ((this.red < 0 || this.red > 255) || (this.green < 0 || this.green > 255) || (this.blue < 0 || this.blue > 255)){
            throw new IllegalArgumentException("Decimal must be between 0 and 255");
        }

    }

    public double getRed() {
        return red;
    }

    public double getGreen() {
        return green;
    }

    public double getBlue() {
        return blue;
    }
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof Colour) {
            Colour col1 = (Colour) obj;
            return (col1.red == this.red && col1.green == this.green && col1.blue == this.blue);
        }

        return false;
    }
}
