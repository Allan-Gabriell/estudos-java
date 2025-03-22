/*Suponha um negócio de banco que possui uma conta comum e uma conta para
empresas, sendo que a conta para empresas possui todos membros da conta comum,
mais um limite de empréstimo e uma operação de realizar empréstimo.
 */

package cursoJava;

import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca {
    public static void main(String[] args) {

        //Upcasting

        Account2 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // dowcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3; isso não é permitido por que um SavingsAccount não é uma BusinesAccount
       if(acc3 instanceof BusinessAccount){
        System.out.println("Loan!");
       }

       if(acc3 instanceof SavingsAccount){
        SavingsAccount acc5 = (SavingsAccount) acc3;
        acc5.updateBalance();
        System.out.println("Update!");
       }

       // --------------------------------------

       Account2 acc6 = new Account2(1006, "Allan", 1000.0);
       acc6.withDraw(200.0);
       System.out.println(acc6.getBalance());
       Account2 acc7 = new SavingsAccount(1007, "Armando", 1000.0, 0.01);
       acc7.withDraw(200.0);
       System.out.println(acc7.getBalance());
       Account2 acc8 = new BusinessAccount(1008, "Jonas", 1000.0, 500.0);
       acc8.withDraw(200.0);
       System.out.println(acc8.getBalance());
    }
}
