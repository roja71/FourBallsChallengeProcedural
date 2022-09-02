import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RGBWhite = 255;
    public static final int widthOfCircle = 10;
    public static final int heightOfCircle = 10;
    public int xAxisForTwo = 0;
    public int xAxisForThree = 0;
    public int xAxisForFour = 0;
    public int xAxisForFive = 0;

    public static void main(String[] args){
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
//        drawWhiteBackground();
        drawCircle();
        incrementXAxis();
    }

    private void drawCircle() {
        ellipse(xAxisForTwo,height/5, widthOfCircle, heightOfCircle);
        ellipse(xAxisForThree,2*height/5,widthOfCircle,heightOfCircle);
        ellipse(xAxisForFour,3*height/5,widthOfCircle,heightOfCircle);
        ellipse(xAxisForFive, 4*height/5, widthOfCircle, heightOfCircle);

    }

    private void incrementXAxis() {
        xAxisForTwo += 1;
        xAxisForThree += 2;
        xAxisForFour += 3;
        xAxisForFive += 4;
    }

    private void drawWhiteBackground() {
        background(RGBWhite);
    }
}