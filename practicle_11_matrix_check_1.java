import java .util.*;
public class practicle_11_matrix_check_1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a[][] = new int[6][6];
       System.out.println("filled with 0’s and 1’s element of 6x6 Matrix");
       for(int i = 0;i < 6;i++){
           for(int j = 0;j < 6;j++){
               System.out.print("a["+i+"]["+j+"]:");
               a[i][j] = sc.nextInt();
           }
       }
       for(int i = 0;i < 6;i++){
           for(int j = 0;j < 6;j++){
               if(a[i][j] == 1){
                   System.out.println("check every "+i+" column and "+j+" row have an odd number’s of 1’s.");
               }
           }
       }
    }
}
