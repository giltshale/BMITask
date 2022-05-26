import java.awt.*;
import java.util.Random;

public class BmiModel {
    public static Random random = new Random();
    public static final Color RANDOM_LIGHT_COLORS1 = new Color(random.nextInt(200 - 70) + 70,
            random.nextInt(200 - 70) + 70, random.nextInt(200 - 70) + 70);
    public static final Color RANDOM_LIGHT_COLORS2 = new Color(random.nextInt(200 - 70) + 70,
            random.nextInt(200 - 70) + 70, random.nextInt(200 - 70) + 70);


    public static final int BODY_CHOICE_RADIO_X=300;
    public static final int BODY_CHOICE_RADIO_Y =10 ;
    public static final int RADIO_SMALL_CHOICE_Y =30;
    public static final int RADIO_MEDIUM_CHOICE_Y =50;
    public static final int RADIO_LARGE_CHOICE_Y =70 ;
    public static final int BODY_CHOICE_WIDTH = 80;
    public static final int BODY_CHOICE_HEIGHT = 25;
    public static final int BODY_CHOICE_WIDTH_LABEL =150;
    public static final int BODY_CHOICE_HEIGHT_LABEL = 25;

    public static final int ACTUAL_WEIGHT_LABEL_WIDTH=200;
    public static final int ACTUAL_WEIGHT_LABEL_HEIGHT =25;
    public static final int ACTUAL_WEIGHT_LABEL_X=15;
    public static final int ACTUAL_WEIGHT_LABEL_Y=125;
    public static final int ACTUAL_WEIGHT_HEIGHT=25;
    public static final int ACTUAL_WEIGHT_Y=155;
    public static final int FRAME_Y =155;






    public static final int HEIGHT_SLIDER_MIN_VAL=140;
    public static final int HEIGHT_SLIDER_MAX_VAL=180;
    public static final int BIG_LINES_ON_SLIDER = 10;
    public static final int SMALL_LINES_ON_SLIDER = 5;
    public static final int HEIGHT_SLIDER_LABEL=100;
    public static final int WIDTH_SLIDER_LABEL=180;

    public static final int HEIGHT_SLIDER_LABEL_X=300;
    public static final int HEIGHT_SLIDER_LABEL_Y=180;
    public static final int SLIDER_LABEL_X=300;
    public static final int SLIDER_LABEL_Y=175;



    //public static final int
public static final int BMI_LABEL_X=50;
    public static final int WEIGHT_LABEL =50;
    public static final int WEIGHT_LABEL_X =300;





    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int SLIDER_LOW_VAL=140;
    public static final int SLIDER_HIGH_VAL=140;

    public static final int SLIDER_WIDTH = 180;
    public static final int SLIDER_HEIGHT = 180;

    public static final int PANEL_WIDTH = WIDTH / 3;

    public static final int LABEL_WIDTH = 80;
    public static final int LABEL_HEIGHT = 25;

    public static final double SMALL = 0.9;
    public static final double MEDIUM = 1;
    public static final double LARGE = 1.1;

    public static final int START_X = 5;
    public static final int START_Y = 10;
    public static final int SPACE = 30;

    public static final int TEXT_WIDTH = 165;
    public static final int TEXT_HEIGHT = 165;
    public static final int PICTURE_WIDTH = 120;
    public static final int PICTURE_HEIGHT = 120;



}
