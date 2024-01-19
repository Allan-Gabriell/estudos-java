package cursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;
import entities.OutSourcedEmployee;

public class Polimorfismo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee2> list = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int n = leia.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + i+1 + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Hours: ");
            int hours = leia.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = leia.nextDouble();
            leia.nextLine();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = leia.nextDouble();
                Employee2 emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee2 emp = new Employee2(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee2 emp : list){
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
        }


        leia.close();
    }
}
