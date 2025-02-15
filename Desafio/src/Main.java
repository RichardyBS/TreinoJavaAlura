import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldoRichardy;

        System.out.println("Olá, Richardy! Me diz qual é o seu saldo atual:");
        saldoRichardy = leitor.nextDouble();

        while (true) {
            System.out.println("\nDigite o número para escolher uma opção:");
            System.out.println("1: Consultar Saldo");
            System.out.println("2: Receber Valor");
            System.out.println("3: Transferir Valor");
            System.out.println("4: Sair");

            System.out.println("\s\sDigite a Opcao: ");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual: R$ " + saldoRichardy);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double valorRecebido = leitor.nextDouble();
                    saldoRichardy += valorRecebido;
                    System.out.println("Valor recebido! Novo saldo: R$ " + saldoRichardy);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir:");
                    double valorTransferir = leitor.nextDouble();
                    if (valorTransferir > saldoRichardy) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldoRichardy -= valorTransferir;
                        System.out.println("Transferência realizada! Novo saldo: R$ " + saldoRichardy);
                    }
                    break;

                case 4:
                    System.out.println("Até logo!");
                    leitor.close();  // Fechar o Scanner para evitar vazamento de recursos
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
