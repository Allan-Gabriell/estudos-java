

import java.util.Locale;

public class primeiroCodigo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // configuramos a localização do nosso programa
        double y = 10.56789;
        System.out.printf("%.2f%n", y);
        /*Printf = print formatado
         * %n =  quebra de linha
         * quando compilado o separador vai ser o do Brasil "," , para ser um "." temos que usar um locale
         */
        System.out.println("Hello World!");
    }
}
