import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo inicial");
        double saldoInicial = scanner.nextDouble();

        System.out.println("-------------------");

        System.out.println("\nDados do cliente: ");

        String tipoConta = "Corrente";

        System.out.println("Nome: " + nome);
        System.out.println(tipoConta);
        System.out.println("Saldo inicial: " + saldoInicial);

        System.out.println("\n------------------");

        int opcao = 0 ;
        while (opcao !=4 ) {

            System.out.println(" \nSISTEMA ");
            System.out.println("-----------------");
            System.out.println("1 - Consulte seu saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - trasferir valor");
            System.out.println("4 - sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é " + saldoInicial);
                    break;
                    case 2:
                        System.out.println(" Qual o valor que deseja trasferir ? ");
                        double valorTransefrido = scanner.nextDouble();

                        if (valorTransefrido > saldoInicial) {
                            System.out.println("impossivel trasferir, voce e pobre arrume mais dinheiro.");
                        } else {
                            saldoInicial -= valorTransefrido;
                            System.out.println("seu novo saldo é de: " + saldoInicial);
                        }
                        break;
                        case 3:
                            System.out.println("Valor recebido: ");
                            double valorRecebido = scanner.nextDouble();
                            saldoInicial += valorRecebido;
                            System.out.println("seu saldo agora é de: " + saldoInicial);
                            break;
                            case 4:
                                System.out.println("Saindo....");
                                break;
                                default:
                                    System.out.println("Opção invalída!!!!\n tente novamente...");

            }

        }



    }


}





