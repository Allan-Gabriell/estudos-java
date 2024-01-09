package cursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List1 {
    public static void main(String[] args) {
        
        List <String> list = new ArrayList<>(); //lista de Strings já estanciada

        list.add("Maria"); //estou fazendo adições a minha lista
        list.add("Bob");
        list.add("Alex");
        list.add("Mariana");
        list.add("Barbara");
        list.add("Ana");

        list.add(2, "Marco"); //coloquei o Marco na posição do Alex sem comprometer a lista

        System.out.println(list.size()); //Ver o número de elementos da lista
        
        list.remove("Mariana"); //Remover um elemento da lista

        //Remover da lista todo mundo com um predicado 
        //exemplo todo mundo com a letra B
        list.removeIf(x -> x.charAt(0) == 'M');

        //encontrar a posição de um elemento
        // Quando não encontra ele retorna o -1
        System.out.println("Index of bob: " + list.indexOf("Bob"));
        
        for(String x : list){
            System.out.println(x);
        }

        System.out.println();

        //criando uma lista filtrando apenas as pessoas que começam com A
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        //como encontrar um elemento da lista que atenda a um certo predicado
        System.out.println();
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        //caso não exista o elemento ele me retorna nulo
        System.out.println();
        String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name1);

    }
}