/*Crie um programa para ler um valor numérico qualquer, e daí mostar quanto
seria o valor de uma circunferência e do volume de uma esfera para um raio daquele
valor. Informar também o valor de PI com duas casas decimais.
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class MembrosEstaticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = leia.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        leia.close();

    }
}
