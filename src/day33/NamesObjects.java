package day33;



public class NamesObjects {
    public static void main(String[] args) {


        Names em1 = new Names();
        em1.name = "Ahmet";
        em1.salary=100000;
        Names em2 = new Names();
        em2.name = "Ana";
        em2.salary=110000;
        Names em3 = new Names();
        em3.name = "Mary";
        em3.salary=114000;
        System.out.println(em1.name);
        System.out.println(em2.name);
        System.out.println(em3.name);
        System.out.println(em1.salary);
        System.out.println(em2.salary);
        System.out.println(em3.salary);

    }
}