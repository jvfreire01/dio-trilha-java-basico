import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
    String numeroAgencia;
    String nomeCliente;
    double saldo;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Olá, você está no DevBank! Por favor, digite o número da sua conta: ");

    numeroConta = entrada.nextInt();
    entrada.nextLine();

    System.out.println("Digite sua agência: ");

    numeroAgencia = entrada.nextLine();

    System.out.println("Digite o seu nome: ");

    nomeCliente = entrada.nextLine();

    System.out.println("Digite o seu saldo: ");

    saldo = entrada.nextDouble();
    entrada.nextLine();

    System.out.println("Olá " + nomeCliente + ", sua agência é " + numeroAgencia + ", sua conta é " + numeroConta
        + " e seu saldo é de R$" + saldo + " e já está disponível para saque.");

    entrada.close();

    }

}
