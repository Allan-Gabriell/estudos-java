/*Fazer um programa para ler um número inteiro N e a altura de N pessoas.
Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        double[] vect = new double[n]; //Acabei de criar um vetor

        for(int i = 0; i < n; i++){
            vect[i] = leia.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }

        double media = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", media);

        leia.close();
    }
}
