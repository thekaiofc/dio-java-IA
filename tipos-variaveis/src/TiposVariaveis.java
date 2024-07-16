public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //java é FORTEMENTE TIPADA
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
 
        // números que representam MILHARES (casa dos 1000) não são representados com ponto
        double salarioMinimo = 2500;

        // váriaveis mudam, constantes não ==> e constantes são representadas com a palavra 'final' e nome com todas as letras maiúsculas
        int numero = 5;

        numero = 10;

        System.out.println(numero);
    }
}
