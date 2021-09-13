/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        int checker=0;

        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();
        System.out.print("Enter the third number: ");
        int num3=input.nextInt();

        if(num1==num2 || num1==num3 || num2==num3)
        {
            System.out.print("The numbers are not different");
            checker=1;
        }

        if(checker==0)
        {
            if(num1>num2 && num1>num3)
            {
                System.out.printf("The largest number is %d",num1);
            }
            else if(num2>num1 && num2>num3)
            {
                System.out.printf("The largest number is %d",num2);
            }
            else
            {
                System.out.printf("The largest number is %d",num3);
            }
        }

    }
}
