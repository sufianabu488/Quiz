package basichw1Calculator;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int first;
        int second;
        int sum;
        System.out.println("Enter first num here ");
        first = input.nextInt();

        System.out.println("Enter  second  num here ");
        second = input.nextInt();

        sum = first + second;

        System.out.printf("This is the sum: %d",sum);




    }


}
