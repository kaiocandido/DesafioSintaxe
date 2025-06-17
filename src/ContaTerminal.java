import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("==============\n");
        System.out.printf("Seja Bem-Vindo(a)\n");
        System.out.printf("==============\n");
        System.out.printf("Qual seu nome: ");
        String nameClient = scanner.next();
        System.out.printf("Qual o numero da conta: ");
        int numberCount = scanner.nextInt();
        System.out.printf("Qual a agencia da conta: ");
        String numberAg = scanner.next();
        System.out.printf("Qual o saldo da conta: ");
        double balance = scanner.nextDouble();
        System.out.printf("==============\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque\n", nameClient, numberCount, numberAg, balance);
        System.out.printf("==============\n");






    }
}
