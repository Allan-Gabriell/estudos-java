package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class TryCatch{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        try{
            String[] vect = leia.nextLine().split(" ");
            int position = leia.nextInt();
            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }

        System.out.println("End of program");

        leia.close();
    }
}