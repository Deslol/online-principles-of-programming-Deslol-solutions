/* Question 1
 Make a BankAccount Class. This Class should provide a constructor, three mutators and three accessors of the type that a bank account might need.

 In the Week4LabSheet4 class (i.e. this class) create two different BankAccount instances from its main method (i.e. two BankAccount objects). Demonstrate the use of your mutators and accessors within that same main method.
*/

public class BankAccount {
    private int balance;

    public BankAccount(int money) {
        this.balance = money;
    }

    public int withdraw(int amount) {

    }

    public int topUp(int amount) {

    }

    public int bankrupt() {
        this.balance = 0;
        return this.balance;
    }
}
