package pritjava;

public class practicle_14_Volume_of_box {
    int length;
    int height;
    int width;

    public  practicle_14_Volume_of_box(){
        this.length=2;
        this.height=3;
        this.width=5;
    }

    public  practicle_14_Volume_of_box(int length,int height,int width){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    int volume(){
        return length*height*width;
    }
    int volume(int l,int b,int h){
        return l*b*h;
    }
    public static void main(String[] args){

        practicle_14_Volume_of_box box1 = new practicle_14_Volume_of_box();
        practicle_14_Volume_of_box box2 = new practicle_14_Volume_of_box(12,13,14);

        System.out.println("Box-1 volume:"+box1.volume());
        System.out.println("Box-2 volume:"+box2.volume());
    }
}
