package Exercise_4_1;

import java.util.Scanner;

public class Exercise_1_Calculations {

    public static void Area(){

        Scanner input = new Scanner(System.in);

        //Promt the user to enter the length from the center to a vertex

        System.out.println("Please enter the lenght from the center to a vertex");

        double r = input.nextDouble();

        //Compute the length of the pentagon

        double s = (2 * r) * (Math.sin(Math.PI / 5 ));

        //Compute the area of the pentagon

        double area = (5 * Math.pow(s, 2 )) / (4 * Math.tan(Math.PI / 5 ));

        System.out.printf("The area of the pentagon is %5.2f\n", area);



    }
}
