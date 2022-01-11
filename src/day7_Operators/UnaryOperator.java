package day7_Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;
        System.out.println( num1<0 );
        System.out.println( num2<0);
        int a=25;
        System.out.println(++a);//increaesing value by1 incremental operator
        System.out.println(--a);//decreasing value by 1 decremental  operator

        int c =5;
        ++c;//increases value by 1 right away
        System.out.println("c = " + c);// 6
        --c;
        System.out.println(c);// will print 5
        //when you use post increment or decrement it will not do it immideatly
        // post is ++ or -- AFTEr the number . Pre is before number;
        int d=100;
        System.out.println(d++);//post increment will not be printed right away
        //its just passes the current value ,eventually it will icreases the value
        //but the next step
        System.out.println(d);//now it increases the value by 1
        int x=200;
        System.out.println(--x);//pre decreases by 1
        int y=200;
        System.out.println(y--);//post decrement: 1 step will pass the current value
        // then only next spet it will decrease the value by 1
        System.out.println(y);//but now when you print it it decreased by 1 =199
        System.out.println("______________________");

        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//28









    }
}
