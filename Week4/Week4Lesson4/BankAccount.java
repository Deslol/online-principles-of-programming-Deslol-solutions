/* Question 1
 Make a BankAccount Class. This Class should provide a constructor, three mutators and three accessors of the type that a bank account might need.

 In the Week4LabSheet4 class (i.e. this class) create two different BankAccount instances from its main method (i.e. two BankAccount objects). Demonstrate the use of your mutators and accessors within that same main method.
*/

public class BankAccount {
    private final String name;
    private int balance;

    public BankAccount(int money, String name) {
        this.balance = money;
        this.name = name;
    }

    public int withdraw(int amount) {
        if(amount > this.balance) return this.balance;
        return this.balance -= amount;
    }

    public int topUp(int amount) {
        return this.balance += amount;
    }

    public int bankrupt() {
        this.balance = 0;
        return this.balance;
    }

    public int checkBalance() {
        System.out.printf("The remaining balance on %s's account is %d",this.name, this.balance);
        return this.balance;
    }
}
