import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       double saldo = 237.48;
 Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero:");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("ola " +
        nome +", obrigado por criar uma conta em nosso banco, sua agencia eh " +
        agencia + ", conta " +
        numero + " e o seu saldo " +
        saldo + " ja esta disponivel para o saque ");
        
    }

    


    
}
