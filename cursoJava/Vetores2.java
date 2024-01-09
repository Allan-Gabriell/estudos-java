/*Faça um programa para ler um número inteiro N e os dados (nome e preço) de N produtos.
Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        Product2[] vect = new Product2[n];

        for(int i = 0; i < vect.length; i++){
            leia.nextLine();
            String name = leia.nextLine();
            double price = leia.nextDouble();
            vect[i] = new Product2(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice(); //para mim pegar só o preço
        }

        double media = sum/vect.length;

        System.err.printf("AVERAGE PRICE: %.2f%n", media);

        leia.close();
    }
}
