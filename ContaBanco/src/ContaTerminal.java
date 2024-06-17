import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite seu numero de conta: ");
        int num = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        String mensagemFinal = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + ", e seu saldo " + saldo + " ja esta disponivel para saque. ";
        System.out.println(mensagemFinal);
    }
}
