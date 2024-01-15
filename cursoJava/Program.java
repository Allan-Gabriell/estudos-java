package cursoJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = leia.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = leia.nextLine();
        System.out.print("Level: ");
        String workerlevel = leia.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = leia.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerlevel), baseSalary, new Departament(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = leia.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Enter contract number #" + 1+i + " data: ");
            System.out.print("Date(DD/MM/YYYY): ");
            Date contractDate = sdf.parse(leia.next());
            System.out.println("");
            System.out.print("Value per hour");
            double valuePerHour = leia.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = leia.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = leia.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        leia.close();
    }
}
