import java.util.Arrays;
public class Colour {
    private double red;
    private double green;
    private double blue;
    private int[] rgb = new int[24];
    private int[] convert_red;
    private int[] convert_green;
    private int[] convert_blue;

    public Colour(double r, double g, double b) {
        this.setRed(Math.round(r * 255));
        this.setGreen(Math.round(g * 255));
        this.setBlue(Math.round(b * 255));

        if ((this.getRed() < 0 || this.getRed() > 255) || (this.getGreen() < 0 || this.getGreen() > 255) || (this.getBlue() < 0 || this.getBlue() > 255)){
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

        this.setRgb(rgb);

        this.setConvert_blue(Arrays.copyOfRange(rgb, 0, 8));
        this.setConvert_green(Arrays.copyOfRange(rgb, 8, 16));
        this.setConvert_red(Arrays.copyOfRange(rgb, 16, 24));

        // how to convert int[] to num between 0 and 255
        StringBuilder toParseBlue = new StringBuilder();
        for (int i: getConvert_blue()) {
            toParseBlue.append(i);
        }

        StringBuilder toParseGreen = new StringBuilder();
        for (int i: getConvert_green()) {
            toParseGreen.append(i);
        }

        StringBuilder toParseRed = new StringBuilder();
        for (int i: getConvert_red()) {
            toParseRed.append(i);
        }

        this.setRed(Integer.parseInt(toParseRed.toString(), 2));
        this.setBlue(Integer.parseInt(toParseBlue.toString(), 2));
        this.setGreen(Integer.parseInt(toParseGreen.toString(), 2));

        if ((this.getRed() < 0 || this.getRed() > 255) || (this.getGreen() < 0 || this.getGreen() > 255) || (this.getBlue() < 0 || this.getBlue() > 255)){
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
            return (col1.getRed() == this.getRed() && col1.getGreen() == this.getGreen() && col1.getBlue() == this.getBlue());
        }

        return false;
    }

    public void setRed(double red) {
        this.red = red;
    }

    public void setGreen(double green) {
        this.green = green;
    }

    public void setBlue(double blue) {
        this.blue = blue;
    }

    public int[] getConvert_red() {
        return convert_red;
    }

    public void setConvert_red(int[] convert_red) {
        this.convert_red = convert_red;
    }

    public int[] getConvert_green() {
        return convert_green;
    }

    public void setConvert_green(int[] convert_green) {
        this.convert_green = convert_green;
    }

    public int[] getConvert_blue() {
        return convert_blue;
    }

    public void setConvert_blue(int[] convert_blue) {
        this.convert_blue = convert_blue;
    }

    public int[] getRgb() {
        return rgb;
    }

    public void setRgb(int[] rgb) {
        this.rgb = rgb;
    }
}
