import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao banco DevBank!");

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta que deseja criar: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, DevBank! sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldoInicial + " já está disponível para você!");
    }
}
