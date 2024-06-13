import entities.Bank;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Bank userAccount;

      System.out.print("Enter account number: ");
      int accountNumber = sc.nextInt();
      System.out.print("Enter account holder: ");
      sc.nextLine();
      String accountHolder = sc.nextLine();
      System.out.print("Is there an initial deposit? (y/n): ");
      char hasInitialDeposit = sc.next().charAt(0);

      if(hasInitialDeposit == 'y') {
         System.out.print("Enter initial deposit value: ");
         double initialDeposit = sc.nextDouble();

         userAccount = new Bank(accountNumber, accountHolder, initialDeposit);
      } else {
         userAccount = new Bank(accountNumber, accountHolder);
      }

      System.out.println();
      System.out.println("Account data:");
      System.out.print(userAccount);

      System.out.println();
      System.out.print("Enter a deposit value: ");
      double depositValue = sc.nextDouble();
      userAccount.deposit(depositValue);
      System.out.println("Updated account data:");
      System.out.println(userAccount);


      System.out.print("Enter a withdraw value: ");
      double withdrawValue = sc.nextDouble();
      userAccount.withdraw(withdrawValue);
      System.out.println("Updated account data:");
      System.out.println(userAccount);
      sc.close();
   }
}
