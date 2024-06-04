
package aulalacos;

import java.util.Scanner;




public class AulaLacos {

    
    public static void main(String[] args) {
        
        System.out.println(" OI ");
        
        // imcremento de 1 em 1
        for( int i = 1 ; i <= 10 ; i++ ){
            System.out.println( i );
        }
        
        // imcremento de 2 em 2
        for( int i = 1 ; i <= 10 ; i += 2 ){
            System.out.println( i );
        }
        
        // decremento de 1 em 1
        for( int i = 20 ; i >= 11 ; i-- ){
            System.out.print( i  + " - ");
        }
        
        // Somar os números de 1 a 10
        
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            //soma = soma + i;
            soma += i;
        }
        System.out.println("\nA soma de 1 a 10 é: " + soma);
        
        
        // Somar os números pares de 1 a 100
        soma = 0;
        for (int i = 1; i <= 100; i++) {
            if( i % 2 == 0 ){
                soma += i;
            } 
        }
        System.out.println("A soma dos pares de 1 a 100 é: " + soma); 
        
        
        // Calcular o fatorial de 5, utilizando for
        int fatorial = 1;
        for (int i = 5; i > 1; i--) {
            //fatorial = fatorial * i;
            fatorial *= i;
        }
        System.out.println("O Fatorial de 5 é: " + fatorial ); 
        
        
        System.out.println( "---------------------------------" ); 
        
        Scanner ler = new Scanner( System.in );
        
        System.out.print("Digite o valor que você quer calcular o fatorial: ");
        int valor = ler.nextInt();
        
        fatorial = 1;
        for (int i = valor; i > 1; i--) {
            fatorial *= i;
        }
        System.out.println("O Fatorial de " + valor + " é: " + fatorial );
        
/******************************************************************************
6. Usando FOR, construa um algoritmo que o usuário informa 5 valores, ao final o 
algoritmo imprime o maior e o menor valor inserido e a média dos valores
*******************************************************************************/
        
        
    }
    
   
}
