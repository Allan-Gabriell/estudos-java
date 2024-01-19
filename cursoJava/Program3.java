package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Color;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of shapes :");
        int n = leia.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Shape #" + i+1 + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = leia.next().charAt(0);
            System.out.print("Color (BLACK/ BLUE/ RED): ");
            Color color = Color.valueOf(leia.next());
            if(ch == 'r'){

            }
        }

        leia.close();
    }
}
