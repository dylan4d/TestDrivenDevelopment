public class Colour {
    double red;
    double green;
    double blue;

    public Colour(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        if ((red < 0 || red > 1) || (green < 0 || green > 1) || (blue < 0 || blue > 1)){
            throw new IllegalArgumentException();
        }
    }

}
