package pritjava;

public class practicle_7_vehicle_plate {
    public static void main(String[] args){
        int alpha1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha3 = 'A' + (int)(Math.random() * ('Z' - 'A'));

        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);

        System.out.println(""+(char)(alpha1)+((char)(alpha2))+((char)(alpha3))+((int)(digit1))+((int)(digit2))+((int)(digit3))+((int)(digit4)));
    }
}
