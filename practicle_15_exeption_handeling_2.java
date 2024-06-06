package pritjava;

public class practicle_15_exeption_handeling_2 {
    public static void main(String[] args)
    {
        try
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        try
        {
            String str = "abc";
            int num = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
