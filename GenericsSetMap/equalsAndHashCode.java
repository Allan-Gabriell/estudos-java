package GenericsSetMap;

import entities.Client;

public class equalsAndHashCode {
    public static void main(String[] args){
        Client c1 =  new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //dá falso por que são dois obj em lugares diferentes na memória
    }
}
