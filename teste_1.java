import java.util.Scanner;

public class teste_1 {
     public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            Double saldo = 567.8;

            System.out.println("Por favor, digite o número do Usuário: ");
            var usuario = scanner.nextInt();
            System.out.println("Por favor, digite o número da Agência: ");
            int agencia = scanner.nextInt();
             scanner.nextLine();
            System.out.println("Por favor, digite o seu nome: ");
            String nome = scanner.nextLine();
      
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. %n" + "Sua agência é %d, conta %d e seu saldo é R$%.2f. %n", nome, agencia, usuario,saldo);
        }
    
}
}
