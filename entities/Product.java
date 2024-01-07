package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){ //Acabo de criar um construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){ // Acabo de deixar esse construtor em sobrecarga
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
        //Quando eu uso o "this" eu estou acabando com a ambiguidade e  referenciando o meu objeto
        //e não o parâmetro da minha classe;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        //Como minha classe product também é um object eu estou sobrepondo a função toString que já
        //por padrão no object e assim eu posso criar minha versão do toString
        return name 
                + ", $ " 
                + String.format("%.2f", price)
                + ", "
                + quantity 
                + " units, Total: $ " 
                + String.format("%.2f", totalValueInStock());
    }
}