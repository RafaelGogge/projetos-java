import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite seu nome completo: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número de sua agência!");
            String agencia = scanner.nextLine();

            System.out.println("Agora, digite o número de sua conta: ");
            int numero = scanner.nextInt();

            double saldo = 1500.75;

            System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
            
            ));
        }
    }
}
