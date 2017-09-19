// Ex.4.18: CreditCalculator class
// determines whether any of several department-store customers has exceeded the credit limit on a charge account
import java.util.Scanner;

public class CreditCalculator {

   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

     int accNumber, balance, charges, credits, creditLimit, customer = 0;

      while (customer < 5){
      System.out.println("Enter Customer account number or -1 to quit: ");
      accNumber = input.nextInt();
      while (accNumber < 0){
         if (accNumber == -1)
            break;
         else
            System.out.println("Customer account number cannot be negative. Please enter a valid number or -1 to quit: ");
            accNumber = input.nextInt();}

       if (accNumber != -1)  {

         System.out.println("Enter balance at the beginning of the month or -1 to quit: ");
         balance = input.nextInt();
         while (balance < 0){
             if (balance == -1)
                break;
             else
                System.out.println("Balance cannot be negative. Please enter a valid number or -1 to quit: ");
                balance = input.nextInt();}

         if (balance != -1){

           System.out.println("Enter total of items charged this month or -1 to quit: ");
           charges = input.nextInt();
           while (charges < 0){
               if (charges == -1)
                  break;
               else
                  System.out.println("Total amount of items cannot be negative. Please enter a valid number or -1 to quit: ");
                  charges = input.nextInt();}

           if (charges != -1){

              System.out.println("Enter total of credits applied to the account this month or -1 to quit: ");
              credits = input.nextInt();
              while (credits < 0){
                  if (credits == -1)
                     break;
                  else
                     System.out.println("Total amount of credits cannot be negative. Please enter a valid number or -1 to quit: ");
                  credits = input.nextInt();}

              if (credits != -1){

                 System.out.println("Enter allowed credit limit or -1 to quit: ");
                 creditLimit = input.nextInt();
                 while (creditLimit < 0){
                   if (creditLimit == -1)
                    break;
                 else
                    System.out.println("Credit limit cannot be negative. Please enter a valid number or -1 to quit: ");
                 creditLimit = input.nextInt();}

                 if (creditLimit != -1){
                    int newBalance = balance + charges - credits;
                    System.out.println("The new balance: " + newBalance);
                    if (newBalance > creditLimit)
                       System.out.println("Credit limit exceeded");
                    ++customer;
                    if (customer < 5 ){
                       System.out.println();
                       System.out.println("Enter data for the next customer:");
                 }}
                 else customer = 5; // quit program if creditLimit = -1
                }
              else customer = 5; // quit program if credits = -1
         }
            else customer = 5; // quit program if charges = -1
         }
           else customer = 5; // quit program if balance = -1
         }
         else customer = 5; // quit program if accNumber = -1
   }
      System.out.println("Thank you for using Credit Limit Calculator!");
   }}
