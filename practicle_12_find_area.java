package pritjava;
import java.util.*;
public class practicle_12_find_area {
    int area(int l){
        return l*l;
    }
     int area(int l,int w){
        return l*w;
    }

     int area(float pi,int r){
        return (int)pi*r*r;
    }
     int area(float a,int b,int h){
           return (int)(a*b*h);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    practicle_12_find_area p1 =new practicle_12_find_area();
    float pi = 3.14f;
    float a = 0.5f;
    int square = p1.area(10);
    int rectangle = p1.area(10,12);
    int triangle = p1.area(a,15,33);
    int circle = p1.area(pi,12);

    System.out.println("the area of square:"+square);
    System.out.println("the area of rectangle:"+rectangle);
    System.out.println("the area of triangle:"+triangle);
    System.out.print("the area of circle:"+circle);


    }
}
