package day18Nestedloop;



public class Divide2numbers {
    public static void main(String[] args) {
       int a=300;
       int b=5;
        int count=0;

        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count);
    }
}
