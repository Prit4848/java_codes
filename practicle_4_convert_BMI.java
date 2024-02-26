package pritjava;

import java.util.Scanner;

public class practicle_4_convert_BMI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pound(kg):");
        double pound = sc.nextDouble();

        System.out.print("Enter the inches(meter):");
        double inch = sc.nextDouble();

        double BMI = (double)((pound/*0.45359237*/)/((inch/*0.0254*/)*(inch/*0.0254*/)));
        System.out.print("Body Mass Index (BMI) is:");
        System.out.println(BMI);

    }
}
