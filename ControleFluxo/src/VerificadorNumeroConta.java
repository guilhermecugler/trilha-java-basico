import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 

        try {
            String numeroConta = scanner.next();

            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido."); 
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
            } finally {
                scanner.close();
            }
        }

    private static void verificarNumeroConta(String numeroConta) { 
      
      if(numeroConta.length() != 8){
        throw new IllegalArgumentException();
      }
            
        }

    public class ParametrosInvalidosException extends Exception{


    }
        
    }
    
