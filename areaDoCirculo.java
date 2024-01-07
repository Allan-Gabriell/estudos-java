import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("informe o raio do circulo:"); 
        double raio = ler.nextDouble(); 
        double pi = 3.14159; 
        double area = pi * (Math.pow(raio, 2.0)); 
        System.out.printf("O valor da area e: %.4f%n", area); 
    }
}