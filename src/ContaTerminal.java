import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe sua conta do banco digitando as informações.");
        System.out.println("Digite o número da sua agência: ");
        String agencia = sc.next();

        System.out.println("Usuário: ");
        int numero = sc.nextInt();

        String nome = "Túlio José Pragana Dantas do Nascimento";

        double saldo = 237.48;

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero,saldo);
    }
}