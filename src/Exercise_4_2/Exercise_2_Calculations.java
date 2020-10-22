package Exercise_4_2;


import java.util.Scanner;

public class Exercise_2_Calculations {

    public static void circleDistance() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double radius = 637101;

        double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        System.out.println("The distance between the two points is " + d + " km");


    }
}
