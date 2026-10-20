class bankAccount {
      int accountNumber;
      String holderName;
      int currentBalance;
      int interestRate;

     void display() {
 
      System.out.println("AccountNumber: " + accountNumber);
      System.out.println("HolderName: " + holderName);
      System.out.println("CurrentBalance: " + currentBalance);
      System.out.println("InterestRate: " + interestRate);
      }
}
class TestbankAccount {
      public static void main(String [] args) {
    
      bankAccount b = new bankAccount();

      b.accountNumber = 6040651;
      b.holderName = "AmolPawar";
      b.currentBalance = 830;
      b.interestRate = 3;

      b.display();

     }
}