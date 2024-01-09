/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
Depois mostrar na tela a altura média das pessoas, e mostrar também a procentagem de 
pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serao inseridas? ");
        int n = leia.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++){
            System.err.println("Dados da pessoa " + (i+1) + " : ");
            System.out.print("Nome: ");
            leia.nextLine();
            nome[i] = leia.nextLine();
            System.out.print("Idade: ");
            idade[i] = leia.nextInt();
            System.out.print("Altura: ");
            altura[i] = leia.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += altura[i];
        }

        double mediaAlturas = sum / n;
        System.out.printf("Altura media: %.2f%n", mediaAlturas);

        int cont = 0;
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                cont++;
            }
        }

        double porcentagem = cont * 100.0 / n;

        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagem);

        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        leia.close();
    }
}
