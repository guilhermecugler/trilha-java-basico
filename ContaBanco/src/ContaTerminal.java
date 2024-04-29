import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o Nome do Cliente!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo!");
        saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)+", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.";

        System.out.println(mensagem);
    }
}
