package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double Salary;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentagem){
        GrossSalary += (GrossSalary * percentagem) / 100;
    }

    public String toString(){
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
