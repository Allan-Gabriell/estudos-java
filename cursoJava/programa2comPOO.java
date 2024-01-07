/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade). Em seguida
    - Mostrar os dados do produto(nome, preço, quantidade e valor total no estoque);
    - Realizar um entrada no estoque e mostrar novamente os dados do produto;
    - Realizar uma saída no estoque e mostrar novamente os dados do produto;
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programa2comPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Price: ");
        double price = leia.nextDouble();
        //System.out.print("Quantity in stock: ");
        //int quantity = leia.nextInt();

        Product product = new Product(name, price);

        //product.setName("Computer"); - modificando o nome via um encapsulamento


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = leia.nextInt();
        product.addProducts(quantity); //passo a quantidade inserida pelo usuário como parâmentro para ser atualizado na função
        
        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = leia.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        leia.close();
    }
}