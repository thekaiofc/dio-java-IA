package edu.kaio.primeirasemana;
public class MinhaClasse {
    
    public static void main (String [] argas){
       String primeiroNome = "Kaio";
       String segundoNome = "Henrique";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
