import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        
        scanner.close();

        System.out.println("Olá " + nome + " " + sobrenome + ", você tem " + idade + " anos e " + altura + "cm de altura");

        } catch (InputMismatchException e) {
            System.out.println("Os campos 'Idade' e 'Altura' devem ser numéricos");
        }
    }
}
