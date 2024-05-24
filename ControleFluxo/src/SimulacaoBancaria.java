import java.util.Scanner;
import java.util.Locale;
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        double saldo = 0; 
        Boolean continuar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (continuar) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
              case 1:
                double valorDeposito = scanner.nextDouble();
                saldo = depositar(saldo, valorDeposito);
                break;
              case 2:
                double valorSaque = scanner.nextDouble();
                saldo = sacar(saldo, valorSaque);
                break;
              case 3:
                consultarSaldo(saldo);
                break;
              case 0:
                System.out.println("Programa encerrado.");
                continuar = false;
                break;
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
              default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        }
    }

    static double depositar(double saldo, double valorDeposito){
        saldo+= valorDeposito;
        consultarSaldo(saldo);
        return saldo;
    }

    static double sacar(double saldo, double valorSaque){
        if(valorSaque > saldo){
          System.out.println("Saldo insuficiente.");
        }else{
          saldo = saldo - valorSaque;
          consultarSaldo(saldo);
        }
        return saldo;
    }

    static double consultarSaldo(double saldo){
        System.out.println(String.format("Saldo atual: %.1f", saldo));
        return saldo;
    }
}