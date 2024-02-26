package pritjava;



import java.util.Scanner;

public class practicle_6_vowel_or_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the charecter:");

        char y = sc.next().charAt(0);

        if(y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U'){
            System.out.println("enter value is vowel ");
        } else {
            System.out.println("enter value is normal");
        }
    }
}
