package day8_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=40, b=20, c=30;
        boolean aIsMedian = (a>b && a<c)||(a>c && a<b);
        boolean bIsMedian= (b>c && b<a) ||(b>a && b<c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        if(aIsMedian){
            System.out.println(a+ " Is a median number");}
        if(bIsMedian){
            System.out.println(b+ " Is a median number");}
        if(cIsMedian){
            System.out.println(c+ " Is a median number");}
        }
        }



