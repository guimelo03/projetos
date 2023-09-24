import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Informe-nos o tipo de sua conta:");
        String tipoConta = ler.nextLine();
        System.out.println("Informe o valor de seu saldo:");
        double saldo = ler.nextDouble();

        System.out.println(" Nome: " + nome + " Tipo de conta: " + tipoConta + " Valor do saldo: " + saldo);
        System.out.println("Operações:\n1- Consultar Saldo\n2- Receber Transferência\n3- Transferir quantia\n4- Sair ");

        System.out.println("Digite a operação desejada:");
        int operacoes = ler.nextInt();

        while (operacoes != 4) {
            if (operacoes == 1) {
                System.out.println("O saldo atual da conta é: " + saldo);
                break;
            } else if (operacoes == 2) {
                System.out.println("Digite a quantia que irá receber: ");
                double deposito = ler.nextDouble();
                saldo += deposito;
                System.out.println("Dinheiro Recebido!" + "Dinheiro atual é de:" + saldo);
            } else if (operacoes == 3) {
                System.out.println("Digite o valor que será transferido: ");
                double envio = ler.nextDouble();
                if (saldo > envio) {
                    saldo -= envio;
                    System.out.println("Transferência concluída!\n\n Novo saldo de:" + saldo);
                } else {
                    System.out.println("Transferência não foi possível,saldo insuficiente");
                }
            } else if (operacoes != 4) {
                System.out.println("Opção invalida");
            }
            ler.close();
            System.out.println("Um bom dia e ótima noite!");
            System.exit(0);
        }
    }
}
