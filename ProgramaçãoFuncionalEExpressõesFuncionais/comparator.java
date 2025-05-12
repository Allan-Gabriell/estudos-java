package ProgramaçãoFuncionalEExpressõesFuncionais;

import java.util.List;

import ProgramaçãoFuncionalEExpressõesFuncionais.object.Product;

import java.util.ArrayList;

/*
 * Suponha uma classe Product com os atributos name e price.
 * Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
 * Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação muda, precisaremos alterar a classe Product.
 * Podemos então usar o default method "sort" da interface List:
 * default void sort(Comparator<? super E> c)
 */
public class comparator {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for(Product p : list) {
            System.out.println(p);
        }
    }
}
