import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        // terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    terminal.close();

        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem =  parametroDois - parametroUm;

        System.out.println("Contagem: "+contagem);

        for(int i=0; i < contagem; i++){
            System.out.println("Imprimindo o número "+(i+1));
        }
        
    }
}
