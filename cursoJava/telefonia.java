/*Uma operadora de telefonia cobrar R$ 50.00 por um plano básico que 
 * dá direrito a 100 minutos de telefone. Cada minuto que excede a 
 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade
 * de minutos que uma pessoa consumiu, dái mostrar o valor a ser pago.
 */

package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class telefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe os minutos: ");
        int minutos = leia.nextInt();

        Double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta R$ %.2f%n", conta);


        leia.close();
    }
}
