public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

            numero++;

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        //forma normal
        String resultado = "";
            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";
        
        System.out.println(resultado);

        //forma com operador ternario
        int resultado2 = a == b ? 1 : 0;

        System.out.println(resultado2);

        String nomeUm = "KAIO";
        String nomeDois = "KAIO";

        // o 'equals' serve para comparar variáveis do tipo string
        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras");
        }
    }
}
