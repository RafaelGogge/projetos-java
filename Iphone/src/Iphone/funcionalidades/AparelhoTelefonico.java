package Iphone.funcionalidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AparelhoTelefonico {

    public void iniciarChamada() {
        System.out.println("Voce está recebendo uma chamada telefonica");
        System.out.println("Digite 1 para atender a ligação ou 2 para recusa-la: ");
    }

    public void atenderChamada() {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                escolha = scanner.nextInt();
                if (escolha == 1) {
                    System.out.println("Chamada atendida!");
                    entradaValida = true;

                } else if (escolha == 2) {
                    System.out.println("\nChamada recusada!");
                    entradaValida = true;
                    correioDeVoz();

                } else
                    System.err.println("Opção inválida! Digite 1 para atender ou 2 para recusar.");
            } catch (InputMismatchException exception) {
                System.err.println("Entrada inválida! Por favor, digite um número inteiro: (1 ou 2)");
                scanner.next();
            }
        }
        scanner.close();
    }

    public void correioDeVoz() {
        System.out.println("\nSua chamada não foi atendida, iniciando correio de voz...");
        System.out.println("\nPor favor, deixe sua mensagem após o sinal.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-----------------DEIXE SUA MENSAGEM--------------------\n");

        String mensagem = scanner.nextLine();
        System.out.println("\n-----------------MENSAGEM REGISTRADA--------------------\n");
        System.out.println(mensagem);
        scanner.close();
    }

}
