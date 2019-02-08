package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero");
        num = input.nextInt();
        
        while(num < 100){
            num *= 3;
            System.out.println(num);
        } 
        
    }
    
}
