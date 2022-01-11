package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {
        Bankaccount account1= new Bankaccount();
        account1.setInfo("Ana Break",1223334455);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();
        System.out.println("_____________________________________");
        Bankaccount account2= new Bankaccount();
        account2.setInfo("Hulya  Keles", 1223345554);
        account2.deposit(100000);
        account2.checkBalance();


    }
}
