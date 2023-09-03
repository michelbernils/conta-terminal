import java.util.Scanner;

public class ContaTerminal {
    Scanner scanner = new Scanner(System.in);

    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;

    public void criaConta() {
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o numero da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consuma a quebra de linha pendente
        System.out.print("Por favor, digite a sua agencia: ");
        agencia = scanner.nextLine();
        System.out.print("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f e já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);
    }
}
