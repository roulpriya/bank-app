package bankapp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while(sc.hasNext()) {
            String command = sc.next();
            switch (command) {
                case "create-account":
                    String name = sc.next();
                    String phoneNumber = sc.next();
                    bank.createAccount(name, phoneNumber);
                    break;

                case "deposit":
                    bank.deposit(sc.nextLong(), sc.nextDouble());
                    break;

                case "withdraw":
                    bank.withdraw(sc.nextLong(), sc.nextDouble());
                    break;

                case "account-info":
                    bank.accountInfo(sc.nextLong());
                    break;

                case "transfer":
                    bank.transfer(sc.nextLong(), sc.nextLong(), sc.nextDouble());
                    break;

                default:
                    System.out.println("Invalid Command");
                    sc.nextLine();

            }
        }

    }
}
