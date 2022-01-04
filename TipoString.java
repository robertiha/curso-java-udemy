package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("olá pessoal".charAt(2)); //imprime o cacartere selecionado

        String s = "Boa tarde"; //string é um objeto IMUTAVEL
        System.out.println(s.concat("!!!!!"));
        System.out.println(s.startsWith("Boa")); //verdadeiro pq começa com B maiusculo
        System.out.println(s.startsWith("boa")); //falso pq tem b minúsculo
        System.out.println(s.toLowerCase().startsWith("boa")); //ignora maiuscula
        System.out.println(s.length()); 
        System.out.println(s.endsWith("tarde"));
        System.out.println((s.equalsIgnoreCase("boa tarde")));

        var nome = "Kauan";
        var sobrenome = "Tavares";
        var idade = 25;
        var salario = 12345.98;

        System.out.println("Nome: " + nome + "\nsobrenome: " + sobrenome); // \n quebra linha

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        // %s = string %d = valores inteiros %f = valores pontos flutiantes
        


        
    }
    
}
