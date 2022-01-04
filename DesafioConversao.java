package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o salário 1: R$");
        String salario1 = entrada.nextLine().replace(",", ".");

        System.out.print("\nDigite o salário 2: R$");
        String salario2 = entrada.nextLine().replace(",", ".");

        System.out.print("\nDigite o salário 3: R$");
        String salario3 = entrada.nextLine().replace(",", ".");


        double num1 = Double.parseDouble(salario1);
        double num2 = Double.parseDouble(salario2);
        double num3 = Double.parseDouble(salario3);

        double soma = num1 + num2 + num3;
        System.out.println("A média salarial é: R$" + soma / 3);


        entrada.close();
    
    //desafio: criar um scanner e inserir 3 strings de salário
    //converter uma string em um valor numérico
    //calcular a média
    //flexibilidade de separar as casas decimais em vírgula(,) ou (.)
    //usar scanner Next ou NextLine
    }




}
