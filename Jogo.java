//Reginaldo Marcos
//24/07/2022

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();
        int numeroaleatorio = random.nextInt(5);

        System.out.println("----------( Vamos Jogar -:) ----------");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Escolha a opção jogar [1] - Sair do jogo [2]");
        int escolha = entrada.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println();

        switch (escolha) {
            case 1:

                System.out.println("---------------:-) E isso aí (-:------------");
                System.out.println(" ----Escolha um número entre [1] e [5]------");
                int iniciarjogo = entrada.nextInt();
                System.out.println();

                if (iniciarjogo == numeroaleatorio) {
                    System.out.println(" ---------- (-: Parábens você acertou -:) ----------");
                    break;
                }

                else {

                    for (int cont = 0; cont <= 6; cont++) {

                        System.out.println("-:) Ops você não acertou -:)");
                        System.out.println(" ----Escolha um número entre [1] e [5]------");
                        int novoiniciarjogo = entrada.nextInt();

                        if (novoiniciarjogo == numeroaleatorio) {

                            System.out.println("---------- Parabéns você acertou ----------");
                            System.out.println("Número certo foi " + numeroaleatorio);
                            break;
                        }

                    }

                }

            case 2:

                System.out.println("Até a proxima partida :-) ");
                break;

            default:
                break;
        }
    }
}