import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {

    public static void main(String[] args) {

         //criando o objeto scanner
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Digite seu nome: ");
         String nome = scanner.next();

         System.out.println("Digite seu sobrenome: ");
         String sobrenome = scanner.next();

         System.out.println("Digite sua altura: ");
         double altura = scanner.nextDouble();

         System.out.println("Digite sua idade: ");
         int idade = scanner.nextInt();


         System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
         System.out.println("Tenho " + idade + " anos de idade, e minha altura é de " + altura + " metros.");


        

    }
    
}