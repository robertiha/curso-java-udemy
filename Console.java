package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.printf("megasena: %d %d %d %d %d %d %n",1, 2, 3, 4, 5, 6);

        System.out.printf("Nome: %s%n", "joão");

        Scanner entrada = new Scanner(System.in); //inserir info no terminal

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\n\nNome = " + nome + " " + sobrenome);
        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();

        



    }
    
}
