/*Fazer um programa para ler um número inteiro N e uma matriz de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
de valores negativos da matriz.
 */

package cursoJava;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();        
        int[][] mat = new int[n][n]; //instânciei na memória
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                mat[i][j] = leia.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for(int i = 0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int cont = 0;

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("Negative numbers: " + cont);

        leia.close();
    }
}