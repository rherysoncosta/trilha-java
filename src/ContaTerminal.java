import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (
            
        //Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuario
        //Obter pela classe scanner os valores digitados no terminal
        //Exebir a mensagem final
                
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o seu nome!");
            String nome = scanner.next();

            System.out.println("Por favor, digite a sua agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o numero da conta!");
            int numero = scanner.nextInt();


            System.out.printf("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  " , conta " + numero + " e seu saldo já está disponivel para saque!");

        }
        
        
    }
}
