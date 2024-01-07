//Este programa em java calcula o pesso de uma pessoa na lua considerando que na lua sua gravidade é 17% a gravidade da terra
// ADOTAREI A GRAVIDADE NA TERRA COMO 10M/S²
import java.text.DecimalFormat;
import java.util.Scanner;
public class gravidadeLuaTerra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //crio a estrutura scanner que vai permitir a leitura de dados do usuário
        DecimalFormat df = new DecimalFormat("#.##"); // Aqui eu crio uma estrutura que posso chamar para limitar meus numeros double a 2 casas pós vírgula

        int gravidadeTerra = 10;
        double gravidadeLua = 0.17 * gravidadeTerra; // 17/100 = 17%
        System.out.println("Bem vindo ao nosso sistema de calculo de massa na lua: ");
        System.out.println("Por favor informe sua massa: ");
        int massaTerra = scanner.nextInt();

        double pesoLua = massaTerra * gravidadeLua;

        System.out.println("A sua massa na lua e de: " + df.format(pesoLua) + " N!");
    }
}