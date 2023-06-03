import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo ao Banco." );
    
    System.out.printf("Digite seu nome :" );
    String nome = scanner.next();

    System.out.print("Digite sua agencia :" );
    String agencia = scanner.next();

    System.out.printf("Qual Numero da sua conta :" );
    int conta = scanner.nextInt();

    System.out.printf("Qual valor em sua conta :R$ " );
    double saldo = scanner.nextDouble();

    System.out.println("Ola "+ nome +" ,obrigado por criar uma conta em nosso banco,sua agência é "+ agencia + " ,conta "+ conta + " e seu saldo R$ "+ saldo + " já esta disponivel para saque." );





        
    }


    
}
