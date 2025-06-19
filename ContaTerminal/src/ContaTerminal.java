import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite sua Conta: ");
        int conta = sc.nextInt();
        System.out.println("Digit seu Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, seu saldo: %s  já está disponível para saque \n", nome, agencia, conta, saldo );
        }


    }
