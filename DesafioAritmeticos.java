package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        //int a = 3 * 4 - 10;
        // int b = (int) Math.pow(a, 3); //potenciação 
        //System.out.println(b);
        
        //primeira conta 

        int conta1 = 6 * (3 + 2);
        int elevado1 = (int) Math.pow(conta1, 2);
        int resultConta1 = elevado1 / (3 * 2);
        System.out.println(resultConta1);  //correto até aqui

        //segunda conta

        int cont2 = (1 - 5) * (2 -7);
        int divCont2 = cont2 / 2;
        int resultConta2 = (int) Math.pow(divCont2, 2);
        System.out.println(resultConta2);

        //subtrair (150 - 100) ^ 3
        //dividir por 10 ^ 3

        int resultado1e2 = resultConta1 - resultConta2;
        System.out.println(resultado1e2);
        int elevadoA3 = (int) Math.pow(resultado1e2, 3);
        System.out.println(elevadoA3);
        int divPor10aoCubo = (int) Math.pow(10, 3);
        System.out.println(divPor10aoCubo);
        System.out.println(elevadoA3 / divPor10aoCubo); //resultado 125 CORRETO!!!


    }
    
}
