package cursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of shapes :");
        int n = leia.nextInt();

        List<Shape> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Shape #" + i+1 + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = leia.next().charAt(0);
            System.out.print("Color (BLACK/ BLUE/ RED): ");
            Color color = Color.valueOf(leia.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = leia.nextDouble();
                System.out.print("Height: ");
                double height = leia.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else{
                System.out.print("Radius: ");
                double radius = leia.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        leia.close();
    }
}
