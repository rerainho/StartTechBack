import java.util.Scanner;

public class SextaClasse {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Conte-me seu nome:");
        String nome = dados.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = dados.nextInt();

        System.out.println("Qual o seu peso? ");
        double peso = dados.nextDouble();

        System.out.println("Qual a sua altura? ");
        double altura = dados.nextDouble();

        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua idade é: " + idade);
        System.out.println("O seu peso é: " + peso);
        System.out.println("A sua altura é: " + altura);

    }
}
