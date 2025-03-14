package publicabiblioteca.sistema.padrao;

import publicabiblioteca.sistema.dominio.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Livro livroDracula = new Livro("Dracula");
        livroDracula.setAnoLancamentoLivro(1998);
        livroDracula.setSinopseLivro("Vampiro pohaaa");
        livroDracula.setNomeAutor("Claudio");

        Livro livroVerity = new Livro("Verity");
        livroVerity.setAnoLancamentoLivro(2019);
        livroVerity.setSinopseLivro("Sinistro pra poha a mulher la fingindo que ta paralisada");

        ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
        listaDeLivros.add(livroDracula);
        listaDeLivros.add(livroVerity);

        for (Livro livro : listaDeLivros) {
            System.out.println("Titulo: "+livro.getNomeLivro());
            System.out.println("Autor: "+livro.getNomeAutor());
            System.out.println("Sinopse: "+livro.getSinopseLivro());
            System.out.println("Ano de Lançamento: "+livro.getAnoLancamentoLivro()+"\n");
        }

        while (true) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Lista de livros");
            System.out.println("3. Sair");
            System.out.print("\nDigite a opção: ");
            if (scan.hasNextInt()){
                int escolha = scan.nextInt();
                scan.nextLine();
                if (escolha == 1){
                    System.out.print("Digite o nome do livro: ");
                    String criarNovoLivro = scan.nextLine();
                    Livro novoLivro = new Livro(criarNovoLivro); //construtor
                    System.out.print("Digite o nome do Autor: ");
                    novoLivro.setNomeAutor(scan.nextLine());
                    System.out.print("Digite o ano de lançamento do livro: ");
                    novoLivro.setAnoLancamentoLivro(scan.nextInt());
                    scan.nextLine();
                    System.out.print("Escreva a sinopse do livro: ");
                    novoLivro.setSinopseLivro(scan.nextLine());
                    System.out.println("\n"+novoLivro.getNomeLivro()+"foi adicionado a lista!");

                    listaDeLivros.add(novoLivro);
                } else if (escolha == 2) {
                    for (Livro livro : listaDeLivros) {
                        System.out.println("Titulo: "+livro.getNomeLivro());
                        System.out.println("Autor: "+livro.getNomeAutor());
                        System.out.println("Sinopse: "+livro.getSinopseLivro());
                        System.out.println("Ano de Lançamento: "+livro.getAnoLancamentoLivro()+"\n");
                    }
                } else if (escolha == 3) {
                    break;
                }
            } else {
                System.out.println("Digite a opção certa!");
            }
        }

    }


}
