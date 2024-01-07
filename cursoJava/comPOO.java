package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class comPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Triangle x, y;
        //agora preciso instanciar e criar o objeto
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os lados do triangulo X");
        x.a = leia.nextDouble();
        x.b = leia.nextDouble();
        x.c = leia.nextDouble();

        System.out.println("Entre com os lados do triangulo y");
        y.a = leia.nextDouble();
        y.b = leia.nextDouble();
        y.c = leia.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

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