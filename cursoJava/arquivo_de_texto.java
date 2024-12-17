package cursoJava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class arquivo_de_texto {

    public static void main(String[] args) {
        File file = new File("cursoJava/arquivoTexto");

        Scanner sc = null;
        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
