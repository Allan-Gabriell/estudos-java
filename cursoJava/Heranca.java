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
        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting

        Account2 acc1 = bacc; //uma conta empresarial é uma conta
        Account2 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // dowcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3; isso não é permitido por que um SavingsAccount não é uma BusinesAccount
       if(acc3 instanceof BusinessAccount){
        BusinessAccount acc5 = (BusinessAccount) acc3; // verifica se acc3 é instancia de businesaccount
        System.out.println("Loan!");
       }

       if(acc3 instanceof SavingsAccount){
        SavingsAccount acc5 = (SavingsAccount) acc3;
        acc5.updateBalance();
        System.out.println("Update!");
       }
    }
}
