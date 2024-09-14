package Iphone.funcionalidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReprodutorMusical {

    public void selecionarMusica() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Escolha uma opção: \n");
            System.out.println("1. Freedom");
            System.out.println("2. Garden");
            System.out.println("3. Anjuna");
            System.out.println("4. Universe Inside Me");
            System.out.println("5. We Are Together\n");
            System.out.println("Aguardando Resposta: ");

            try {
                escolha = scanner.nextInt();
                if (escolha == 1) {
                    System.out.println("Musica Selecionada: Ranji x Ghost Rider - Freedom");
                    System.out.println("Ouça no SoundCloud: https://soundcloud.com/ranji/ranji-ghost-rider-freedom-radio-edit?in=anders-kapila/sets/2022a1");
                    entradaValida = true;
                    
                } else if (escolha == 2) {
                    System.out.println("Musica Selecionada: Ghost Rider x Ranji ft. Stonefox - Garden");
                    System.out.println("Ouça no SoundCloud: https://soundcloud.com/f-nix-6/ghost-rider-x-ranji-ft-stonefox-garden-fonix-rework");
                    entradaValida = true;

                } else if (escolha == 3) {
                    System.out.println("Musica Selecionada: Liquid Soul & Zyce - Anjuna");
                    System.out.println("Ouça no SoundCloud: https://soundcloud.com/ibogarecords/liquid-soul-zyce-anjuna?in=shahad-alkahtani/sets/psy");
                    entradaValida = true;
                    
                } else if (escolha == 4) {
                    System.out.println("Musica Selecionada: Liquid Soul & Vini Vici - Universe Inside Me");
                    System.out.println("Ouça no SoundCloud: https://soundcloud.com/ibogarecords/liquid-soul-vini-vici");
                    entradaValida = true;

                } else if (escolha == 5) {
                    System.out.println("Musica Selecionada: Ghost Rider - We Are Together");
                    System.out.println("Ouça no SoundCloud: https://soundcloud.com/ghostrider_mag/ghost-rider-we-are-the-people-free-download");
                    entradaValida = true;
                } else {
                    System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 5.");
                }

            } catch (InputMismatchException exception) {
                System.err.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        scanner.close(); // Fechar o scanner após o uso
    }
    public void pausarMusica(){
        System.out.println("----------------------");
        System.out.println("||  MÚSICA PAUSADA  ||");
        System.out.println("----------------------");
    }
}
