package Iphone.funcionalidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NavegadorInternet {

    public void NavegadorWeb() {
        System.out.println("Iniciando navegador de internet...");

        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int escolha = 0;

        while (!entradaValida) {
            try {
                System.out.println("Escolha uma opção: \n1 - Abrir YouTube\n2 - Abrir Chrome\n3 - Abrir Spotify\n4 - Abrir SoundCloud\n  Digite valores de 1 a 4: ");
                escolha = scanner.nextInt();

                // Usando SWITCH-CASE para gerenciar as escolhas
                switch (escolha) {
                    case 1:
                        System.out.println("Abrindo YouTube");
                        System.out.println("Iniciando vídeo do youtube.");
                        entradaValida = true; // Saída do loop
                        break;
                    case 2:
                        System.out.println("Abrindo Chrome");
                        System.out.println("Pagina do chrome iniciada");
                        entradaValida = true; // Saída do loop
                        break;
                    case 3:
                        System.out.println("Abrindo Spotify");
                        System.out.println("O programa foi iniciado corretamente");
                        entradaValida = true; // Saída do loop
                        break;
                    case 4: 
                        System.out.println("Abrindo SoundCloud");
                        System.out.println("O programa foi iniciado corretamente");
                        entradaValida = true;
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente.\n");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Valor inválido. Por favor, insira um número.\n");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        scanner.close(); // Fechando o scanner
    }
}
