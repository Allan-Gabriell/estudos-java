package GenericsSetMap;
/*
* Método que retorna um número inteiro representando um código gerado a partir das
* infomações do objeto
*
* Se o hashCode de dois objetos for diferentes, então os dois são diferentes
* Se o código de dois objetos for igual, muito provavelmente, os objetos são iguais, mas
* pode haver colisões devido número inteiros serem limitados a 32 bits
* */
public class hashCode {
    public static void main(String[] args){
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
