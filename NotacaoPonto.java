package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        
        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); //substituir uma palavra pela outra
        s = s.toUpperCase(); //todas as letras maiusucula
        s = s.concat("!!!!!");


        System.out.println(s);

        System.out.println("Leo" .toUpperCase());

        String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!!!!!");
        System.out.println(y);

        //tipos primitivos nao tem o operador "."
        int a = 3;
        System.out.println(a);
    }
    
}
