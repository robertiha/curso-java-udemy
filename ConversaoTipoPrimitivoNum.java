package fundamentos;

public class ConversaoTipoPrimitivoNum {
    public static void main(String[] args) {
        
        double a = 1;  //implicita
        System.out.println(a);

        float b = (float) 1.1234566666666666666;  //conversão explicita (cast)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //conversao explicita (cast)
        System.out.println(d);

        double e = 1.5555;
        int f = (int) e;  //conversão explicita
        System.out.println(f);

        

    


    }
    
}
