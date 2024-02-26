package pritjava;

import java.util.Scanner;

public class practicle_3_meter_into_feet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Meter:");
        float meter = sc.nextFloat();

        float feet =(float)(meter*3.28);

        System.out.print("the value convert in feet:"+feet);
        //System.out.print(feet);


    }
}
