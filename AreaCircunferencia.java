package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio =  3.4; //double = numeros reais
        final double PI = 3.14159; //final = variável não mutavel

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2."); 


    }
    
}
