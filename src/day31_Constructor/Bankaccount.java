package day31_Constructor;

public class Bankaccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "Bankaccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balannce is :" +balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance+=amount;

    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("insuffitient balance");
            return;
        }

        if(amount<=0){
            System.out.println("Ammount can't be negative or zero");
            return;
        }
        balance-=amount;
    }
}
