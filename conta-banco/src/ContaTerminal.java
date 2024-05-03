import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt(); // converto para inteiro

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
