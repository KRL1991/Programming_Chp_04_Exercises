package Exercise_4_5;

import java.util.Scanner;

public class Exercise_5_Calculations {

    public static void areaOfPolygn(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of sides");

        double numberOfSides = input.nextDouble();

        System.out.println("Please enter length of the side");

        double s = input.nextDouble();

        double area = (numberOfSides * Math.pow(s,2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of the polygon is " + area);
    }
}
