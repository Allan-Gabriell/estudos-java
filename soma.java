import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        int y;
        int soma;
        System.out.println("Por favor informe o primeiro valor:");
        x = ler.nextInt();
        System.out.println("Informe o segundo numero:");
        y = ler.nextInt();
        soma = x + y;
        System.out.println("Soma = " + soma);
    }
}
