import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    int numeroConta;
    String numeroAgencia;
    String nomeCliente;
    double saldo;

    Scanner entrada = new Scanner(System.in);

    //Iniciando banco. Solicita entrada do número da conta;

    System.out.println("Olá, você está no DevBank! Por favor, digite o número da sua conta: ");

    numeroConta = entrada.nextInt();
    entrada.nextLine();

    //Solicita entrada do número da agência;

    System.out.println("Digite sua agência: ");

    numeroAgencia = entrada.nextLine();

    //Solicita entrada do nome;

    System.out.println("Digite o seu nome: ");

    nomeCliente = entrada.nextLine();

    //Solicita entrada do saldo;

    System.out.println("Digite o seu saldo: ");

    saldo = entrada.nextDouble();
    entrada.nextLine();

    //Exibindo mensagem final com a concatenação entre variáveis int, string e double com o texto;

    System.out.println("Olá " + nomeCliente + ", sua agência é " + numeroAgencia + ", sua conta é " + numeroConta
        + " e seu saldo é de R$" + saldo + " e já está disponível para saque.");

    // Fechando o objeto Scanner para liberar os recursos;

    entrada.close();

    }

}
