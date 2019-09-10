package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2){
        double hypotenuse = (length1 * length1) + (length2 * length2);
        return Math.sqrt(hypotenuse);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first side length");
        double side1 = sc.nextDouble();
        System.out.println("Input second side length");
        double side2 = sc.nextDouble();
    }
}
