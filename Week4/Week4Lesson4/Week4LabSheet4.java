
/*
 * Lab Sheet 4
 */

/* Question 1
 Make a BankAccount Class. This Class should provide a constructor, three mutators and three accessors of the type that a bank account might need.

 In the Week4LabSheet4 class (i.e. this class) create two different BankAccount instances from its main method (i.e. two BankAccount objects). Demonstrate the use of your mutators and accessors within that same main method.
*/

public class Week4LabSheet4 {
  public static void main(String[] args) {
      BankAccount myAccount = new BankAccount(2000, "Cyril");
      BankAccount alanAccount = new BankAccount(500000, "Alan");

      alanAccount.withdraw(300000);
      alanAccount.checkBalance();
      System.out.println();
      myAccount.topUp(300000);
      alanAccount.bankrupt();

      myAccount.checkBalance();
      System.out.println();
      alanAccount.checkBalance();
  }
}
