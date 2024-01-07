/*Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário(nome e salário líquido). Em seguida, aumentar
o salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetado
pela porcentagem) e mostrar novamente os dados do funcionário. 
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class programa3comPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.Name = leia.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = leia.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = leia.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        double percentage = leia.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);
    }
}
