package pritjava;

import java.util.Scanner;

public class practicle_5_decending_order {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt();

        System.out.print("enter the value of b:");
        int b = sc.nextInt();

        System.out.print("enter the value of c:");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            if(b>=c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }

            else{
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b>=a && b>=c) {
            if(a>=b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
            else{
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            if(a>=b){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
            else{
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }


    }
}
