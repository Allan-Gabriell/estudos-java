package cursoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch{
    public static void main(String[] args) {

        method1();
        
        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }

    public static void method2(){
        System.out.println("*** METHOD2 START ***");
        Scanner leia = new Scanner(System.in);
    
        try{
            String[] vect = leia.nextLine().split(" ");
            int position = leia.nextInt();
            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        } catch(InputMismatchException e){
            System.out.println("Invalid position!");
            e.printStackTrace(); //Inprime o rastreamento do Stack
            leia.next();
        }

        System.out.println("*** METHOD2 END ***");
    
        leia.close();
    }
}
