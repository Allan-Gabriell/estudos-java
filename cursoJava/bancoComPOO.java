package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class bancoComPOO {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int number = leia.nextInt();
        System.out.print("Enter account holder: ");
        leia.nextLine();
        String holder = leia.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char reponse = leia.next().charAt(0); //Dessa forma eu leio somente um caracter
        if(reponse == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = leia.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.err.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = leia.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.err.println(account);
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = leia.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.err.println(account);

        leia.close();
    }
}
