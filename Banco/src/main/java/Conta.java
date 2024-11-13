
 import java.util.*;


 public class Conta {
        int numero_conta;
        String titular_conta;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        public Conta(String nome_titular,double saldo_inicial){

            this.titular_conta = nome_titular;
            this.saldo = saldo_inicial;

            Random gerador_numero = new Random();
            numero_conta = gerador_numero.nextInt(1000); // gerador randomico de numeros

        }

     public void VerSaldo() {
         System.out.println("O número da conta é: " + numero_conta);
         System.out.println("O nome do titular é: " + titular_conta);
         System.out.println("O saldo da conta é: " + saldo);

     }

     public void Saque(double valor_saque) {
            if (saldo >= valor_saque) {
                saldo = saldo - valor_saque;
            System.out.println(" Seu saldo atual é de : " + saldo);
                }else {
                System.out.println(" Seu saldo é insuficiente! ");
            }
     }

     public void Deposito(double valor_deposito) {
        if (valor_deposito <= 0) {
            System.out.println(" Depósito inválido, valor menos que 0!");
        }else {
            saldo += valor_deposito; // saldo = saldo + valor_deposito
            System.out.println(" Seu saldo agora é de: " + saldo);
        }
     }

     public void Iniciar() {
         int opcao;
         do {
             Exibir_menu();
             opcao = entrada.nextInt();
             Escolher_funcao(opcao);
         } while (opcao != 4);

     }

     public void Exibir_menu() {
         System.out.println("Bem-vindo ao banco Rainhore");
         System.out.println("Escolha a molher opção:");
         System.out.println("1 - Ver o saldo");
         System.out.println("2 - Sacar");
         System.out.println("3 - Depositar");
         System.out.println("4 - Finalizar");
     }

 }

    public void Escolher_funcao(int opcao) {

     double saque;
     double deposito;

     switch (opcao) {
         case 1:
             VerSaldo();
             break;
         case 2:
             System.out.println("Digite o valor a ser sacado:");
             saque = entrada.nextDouble();
             Saque(saque);
             break;
         case 3:
             System.out.println("Digite o valor a ser depositado:");
             deposito = entrada.nextDouble();
             Deposito(deposito);
             break;
         case 4:
             System.out.println("Operação finalizada!");
             break;

         default:
             System.out.println("Opção inválida!");

     }
    }

}
