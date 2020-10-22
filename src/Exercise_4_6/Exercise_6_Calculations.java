package Exercise_4_6;

import java.util.Scanner;

public class Exercise_6_Calculations {


    public static void randomPointsOnACircle(){

        double r = 40;

        double angle = Math.random() * 360;
        double x = r * Math.cos(angle * Math.PI / 180);
        double y = r * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");

        angle = Math.random() * 360;
        x = r * Math.cos(angle * Math.PI / 180);
        y = r * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");

        angle = Math.random() * 360;
        x = r * Math.cos(angle * Math.PI / 180);
        y = r * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");


    }
}
