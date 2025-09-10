import java.util.Scanner;

public class Main {

    static class ContaBancaria {
        double saldo;

        ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        void sacar(double valor) {
            saldo = saldo - valor;
        }

        void depositar(double valor) {
            saldo = saldo + valor;
        }

    }

    public static void main(String[] args) {
        int comando;
        double valor;
        boolean repetirOperacao = true;
        boolean realizarOperacoes = true;

        ContaBancaria conta1 = new ContaBancaria(500);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo inicial: 500.0 reais");

        // Executa o código até que o usuário pare de querer realizar modificações
        while (realizarOperacoes) {
            // Solicita ao usuário um comando de depósito ou saque, até que o comando seja válido
            while (repetirOperacao) {
                System.out.print("Para sacar, digite '1'\nPara depositar, digite '2'\nComando: ");
                comando = scanner.nextInt();
                System.out.print("Digite o valor do saque/depósito, em reais: ");
                valor = scanner.nextDouble();
                if (comando == 1) {
                    if (valor > conta1.saldo) {
                        System.out.println("Saldo insuficiente para saque!");
                    } else {
                        conta1.sacar(valor);
                    }
                    repetirOperacao = false;
                }  else if (comando == 2) {
                    conta1.depositar(valor);
                    repetirOperacao = false;
                } else {
                    System.out.println("Comando inválido, tente novamente");
                }
            }

            System.out.println();
            System.out.println("Saldo em conta: " + conta1.saldo + " reais");
            System.out.println();

            // Pergunta se o usuário deseja realizar uma nova operação. Se não, encerra o programa
            System.out.println("Deseja realizar outra operação?\nSe sim, digite '1'\nSe não, digite '2'\nComando: ");
            comando = scanner.nextInt();
                if (comando == 1) {
                    System.out.println("Ótimo! Você irá realizar outra operação!");
                    repetirOperacao = true;
                }
                else if (comando == 2) {
                    realizarOperacoes = false;
                } else {
                    System.out.println("Comando inválido, outra operação será realizada.");
                    repetirOperacao = true;
                }
        }
        System.out.println();
        System.out.println("Saldo final: " + conta1.saldo);

        scanner.close();
    }
}