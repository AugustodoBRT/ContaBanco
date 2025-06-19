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

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + ", seu saldo: " + saldo + "  já está disponível para saque");
        }
    }
