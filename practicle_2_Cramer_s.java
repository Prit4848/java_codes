package pritjava;

import java.util.Scanner;

public class practicle_2_Cramer_s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of  Equation-1 ");
        System.out.print("enter the a:");
        double a = input.nextDouble();
        System.out.print("enter the b:");
        double b = input.nextDouble();
        System.out.print("enter the e:");
        double e = input.nextDouble();

        System.out.println("enter the values of Equation-2");
        System.out.print("enter the c:");
        double c = input.nextDouble();
        System.out.print("enter the d:");
        double d = input.nextDouble();
        System.out.print("enter the f:");
        double f = input.nextDouble();

        double x =((e*d)-(b*f))/((a*d)-(b*c));
        double y =((a*f)-(e*c))/((a*d)-(b*c));

        System.out.print("x:"+x);
       // System.out.print(x);
        System.out.println();
        System.out.print("y:"+y);
       // System.out.print(y);


    }
}
