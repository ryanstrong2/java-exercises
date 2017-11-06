package org.launchcode.java.demos.java4python.studio;
import java.util.Scanner;
/**
 * Created by ryanstrong on 2/27/17.
 */
public class Area {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        Double PI = 3.14;
        Double radius =0.0;
        System.out.println("Enter the radius.");
        radius =  scanner.nextDouble();
        Double area = PI * radius * radius;

        if (radius > 0.0); {
            System.out.println("The area: " + area);
            radius = scanner.nextDouble();
//        if(radius < 0) {
//
//        }


//        double a;

//        a = Math.PI * r * r;
        System.out.println ("Area of circle r is " + area);
//
        }
    }
}
