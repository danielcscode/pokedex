package pokedex.projetos.java.ti;

import pokedex.projetos.java.ti.pokemon.Pokemon;
import pokedex.projetos.java.ti.usuariocadastro.Usuario;

import java.util.Scanner;

public class Main {
    public static void menuInterativo() { // procedimento
        System.out.println(" ------------------------- ");
        System.out.println(" P O K E D É X - ver. Ruby ");
        System.out.println(" ------------------------- ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        Usuario nome = new Usuario();
        Pokemon pokemon = new Pokemon();

        menuInterativo();

        System.out.println(" Por favor insira seu nome:");
        nome.setNome(usuario.next());
        System.out.println("");
        System.out.println("Por favor insira sua senha:");
        nome.setSenha(usuario.next());
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("| ");
        }
        System.out.println("");

        nome.verificar();

        if (nome.verificar() == true) {
            System.out.println("");
            System.out.println("Olá " + nome.getNome() + "!");
            System.out.println("Seja Bem Vindo a sua POKÉDEX!");

            String escolhaMenu;
            do {
                menuInterativo();
                System.out.println("Digite a operação desejada:");
                System.out.println("[1] - LISTA DE POKEMONS FOGO");
                System.out.println("[2] - LISTA DE POKEMONS AGUA");
                System.out.println("[3] - LISTA DE POKEMONS ELETRICO");
                System.out.println("[4] - INFO TREINADOR");
                int escolha = usuario.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println(" ------------------------- ");
                        System.out.println(" P O K E M O N - F O G O ");
                        System.out.println(" ------------------------- ");
                        System.out.println("");
                        System.out.println("[1] - Torchic");
                        System.out.println("[2] - Slugma");
                        System.out.println("[3] - Vulpix");
                        int escolhaFogo = usuario.nextInt();

                        switch (escolhaFogo) {
                            case 1:
                                pokemon.torchic();
                                break;

                            case 2:
                                pokemon.slugma();
                                break;

                            case 3:
                                pokemon.vulpix();
                                break;
                        }
                        break;

                    case 2:
                        System.out.println(" ------------------------- ");
                        System.out.println(" P O K E M O N - A G U A ");
                        System.out.println(" ------------------------- ");
                        System.out.println("");
                        System.out.println("[1] - Mudkip");
                        System.out.println("[2] - Goldeen");
                        System.out.println("[3] - Magikarp");
                        int escolhaAgua = usuario.nextInt();

                        switch (escolhaAgua) {
                            case 1:
                                pokemon.mudkip();
                                break;

                            case 2:
                                pokemon.goldeen();
                                break;

                            case 3:
                                pokemon.magikarp();
                                break;
                        }
                        break;

                    case 3:
                        System.out.println(" ------------------------- ");
                        System.out.println(" P O K E M O N - A G U A ");
                        System.out.println(" ------------------------- ");
                        System.out.println("");
                        System.out.println("[1] - Pichu");
                        System.out.println("[2] - Electrike");
                        System.out.println("[3] - Magnemite");
                        int escolhaEletrico = usuario.nextInt();

                        switch (escolhaEletrico) {
                            case 1:
                                pokemon.pichu();
                                break;

                            case 2:
                                pokemon.electrike();
                                break;

                            case 3:
                                pokemon.magnemite();
                                break;
                        }
                        break;

                    case 4:
                        System.out.println(" -------------------------- ");
                        System.out.println(" I N F O  T R E I N A D O R ");
                        System.out.println(" -------------------------- ");
                        System.out.println("");
                        System.out.println("TRAINER CARD");
                        System.out.println("Nome:" + nome.getNome());
                        System.out.println("Dinheiro: P 59787");
                        System.out.println("Pokédex: 9");
                        System.out.println("Insignias");
                        System.out.println("[@] [#] [ ] [&] [§] [ ] [ ] [ ]");
                        break;
                }
                System.out.println("Deseja voltar para o menu? [S] - SIM / [N] - Não");
                escolhaMenu = usuario.next();
            } while (escolhaMenu.equals("S"));
            System.out.println("Desligando Pokédex!");
        } else {
            System.out.println("A C E S S O  N E G A D O ! ! !");
            System.out.println("Desligando Pokédex!");
        }
    }
}