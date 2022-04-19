package basichw1Calculator;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

Addition();
subtraction();
multiplication();
division();

    }


    public static void Addition(){
        Scanner add=new Scanner(System.in);
        System.out.println("Welcome My Calculator");
        System.out.println("Enter three number for (+)");
        System.out.println("Enter the first number");
        double num1=add.nextDouble();
         System.out.println("Enter the Second number");
        double num2=add.nextDouble();
        System.out.println("Enter the Third number");
        double num3=add.nextDouble();
        System.out.println("Your total addition number:=" +(num1+num2+num3));


        }



    public static void subtraction() {
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter three number for  (-) ");
        System.out.println("Enter the first number");
        double num1 = sub.nextDouble();
        System.out.println("Enter the Second number");
        double num2 = sub.nextDouble();
        System.out.println("Enter the Third number");
        double num3 = sub.nextDouble();
        System.out.println("Your total subtraction number:=" + (num1 - num2 - num3));

    }


    public static void division() {
        Scanner div = new Scanner(System.in);
        System.out.println("Enter three number for ( / ) ");
        System.out.println("Enter the first number");
        double num1 = div.nextDouble();
        System.out.println("Enter the Second number");
        double num2 = div.nextDouble();
        System.out.println("Enter the Third number");
        double num3 = div.nextDouble();
        System.out.println("Your total division number:=" + (num1 / num2 / num3));

    }

    public static void multiplication() {
        Scanner mul = new Scanner(System.in);
        System.out.println("Enter three number for (*) ");
        System.out.println("Enter the first number");
        double num1 = mul.nextDouble();
        System.out.println("Enter the Second number");
        double num2 = mul.nextDouble();
        System.out.println("Enter the Third number");
        double num3 = mul.nextDouble();
        System.out.println("Your total multiplication number:=" + (num1 * num2 * num3));


    }
    }

