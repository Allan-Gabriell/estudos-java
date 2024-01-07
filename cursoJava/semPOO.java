/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y.
Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois
triângulos possui a maior área.
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class semPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com os lados do triangulo X");
        xA = leia.nextDouble();
        xB = leia.nextDouble();
        xC = leia.nextDouble();

        System.out.println("Entre com os lados do triangulo y");
        yA = leia.nextDouble();
        yB = leia.nextDouble();
        yC = leia.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX -xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Area do triangulo x = %.2f%n", areaX);
        System.out.printf("Area do triangulo Y = %.2f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior area e de X!");
        } else {
            System.out.println("Maior area e de Y!");
        }

        leia.close();
    }
}
