package pritjava;

import java.util.Scanner;

public class practicle_10_reverse_number {
   public static void rev(int n,int[] num1){
        for(int i = n-1;i >= 0;i--){
            System.out.println(num1[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practicle_10_reverse_number p1 = new practicle_10_reverse_number();
        System.out.println("enter the 10 numbers:");
        int n = 10;
        int[] a = new int[10];
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            System.out.println("reverse numbers");
            p1.rev(n,a);
    }

}


