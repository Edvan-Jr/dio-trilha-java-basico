import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("\nBem-vindo ao JAVA BANK!\n\n");
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Com quantos reais deseja abrir a sua conta? ");
        double saldo = scanner.nextDouble();
        String valorFormatado = currencyFormat.format(saldo);

        scanner.close();

        System.out.print("\n" + nomeCliente + ", obrigado por criar uma conta em nosso banco!\nA sua agência é " + agencia + ", conta " + numero + ", e o seu saldo de " + valorFormatado + " já está disponível para saque.");
    }
}
