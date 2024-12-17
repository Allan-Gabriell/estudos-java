package cursoJava;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class texto4 {
    public static void main(String[] args){
        String[] lines = new String[] {"Good Morning", "Good afternoon", "Good Night"};

        String path = "/home/allan/Área de Trabalho/novo_texto.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
