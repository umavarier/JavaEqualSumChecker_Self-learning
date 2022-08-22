//Program to check if the sum of the first and second parameter is equal to the third parameter.

import java.util.Scanner;

public class EqualSumChecker {

    public static void main(String[] args)
    {
        int n1;
        int n2;
        int n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers.");
        System.out.println("Enter the first number ");
        n1=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Second number ");
        n2=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the third number ");
        n3=sc.nextInt();
        sc.nextLine();

        hasEqualSum(n1,n2,n3);
        sc.close();
    }
    public static void hasEqualSum(int a, int b, int c)
    {
        int sum=0;
        if((a+b)==c)
        {
            System.out.println("The sum of first and Second number is equal to the third number");
        }
        else
        {
            System.out.println("The sum of first and Second number is not equal to the third number");
        }
    }

}



