package Exercise_4_4;

import java.util.Scanner;

public class Exercise_4_Calculations {

    public static void areaOfAHexagon(){

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter the side of the hexagon");

        double s = input.nextDouble();

        double area = (6 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %5.2f\n", area);


    }
}
