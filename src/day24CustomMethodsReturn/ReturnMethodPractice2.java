package day24CustomMethodsReturn;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
      int maxNumb=  max(10,20);
        System.out.println(maxNumb);
        int multiplication=maxNumb*2;
        System.out.println(multiplication);
    }
    public static int max(int a, int b){
        int result= 0;
        if(a>b){
            result=a;} else{
            result=b;
        }
        return result;}
    }

