import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// CRIANDO O SCANNER
        ContaTerminal conta = new ContaTerminal(); // CRIANDO O OBJETO DA CLASSE CONTA TERMINAL


        // PASSANDO OS DADOS DO USUARIO
        System.out.println("Por favor, insira o numero de sua conta: ");
        conta.numero = scanner.nextInt();
        System.out.println("Por favor, insira o numero de sua agencia: ");
        conta.agencia = scanner.next();
        System.out.println("Por favor, insira seu nome: ");
        conta.nomeCliente = scanner.next();
        System.out.println("Por favor, insira o valor de saldo: ");
        conta.saldo = scanner.nextDouble(); // ATENÇÃO AO COLOCAR O VALOR DO SALDO, POIS PRECISA SER COM VIRGULA(,)

        // IMPRIMINDO OS DADOS DO CLIENTE
        System.out.println("Cliente: " + " " + conta.nomeCliente);
        System.out.println("Agência: " + " " + conta.agencia);
        System.out.println("Conta: " + " " + conta.numero);
        System.out.println("Saldo: " + " " + conta.saldo);

    }
}