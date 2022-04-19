package basichw1Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char operator;
        double num1, num2;
        System.out.println("Enter the operator (+,-,*,/)");
        operator = input.next().charAt(0);

        System.out.println("Enter the two number one by one");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        input.close();
        switch (operator){
            case '+':
                System.out.printf("%.2f+%.2f=%.2f",num1,num2,(num1+num2));
            break;
            case '-':
                System.out.printf("%.2f-%.2f=%.2f",num1,num2,(num1-num2));
                break;

            case '*':
                System.out.printf("%.2f*%.2f=%.2f",num1,num2,(num1*num2));
                break;
            case '/':
                System.out.printf("%.2f/%.2f=%.2f",num1,num2,(num1/num2));
                break;

        }


    }


}

