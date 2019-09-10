package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int num){
        int remainder = num % 2;
        if(remainder == 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a whole number and see if it is odd");
        int num = sc.nextInt();
        if(isOdd(num) == true){
            System.out.println("Wow, that's odd!");
        }
    }
}
