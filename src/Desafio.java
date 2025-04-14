import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Gabriel Dias";
        String conta = "Corrente";
        double saldo = 15000;
        int opcao = 0;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        Scanner leitura = new Scanner(System.in);

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;



        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual valor deseja transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldo){
                    System.out.println("O saldo não é suficiente para essa transação.");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo agora é de: " + saldo);
                }
            } else if (opcao ==3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu novo saldo é de: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida!");

            }

        }
    }
}
