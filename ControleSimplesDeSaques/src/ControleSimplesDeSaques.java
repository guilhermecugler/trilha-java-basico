import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        
        for(int i=1; i > 0; i++){
            double valorSaque = scanner.nextDouble();
            if(valorSaque == 0){
                break;
            }else if(valorSaque <= limiteDiario){
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: "+limiteDiario);
            }else{
                System.out.println("Limite diario de saque atingido.");
                break;
            }
        }
        System.out.println("Transacoes encerradas.");

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}