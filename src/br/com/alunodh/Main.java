package br.com.alunodh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(123, "A Digital House", "Tairo", "01/01/2000", "123A", 5, 50.90f);
        Livro livro2 = new Livro(124, "A Digital Films", "Jessica", "02/01/2000", "121A", 6, 54.90f);

        List<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);

        Livraria livraria= new Livraria();
        livraria.cadastrarLivro(livro1);
        livraria.cadastrarLivro(livro2);

        Scanner scan = new Scanner(System.in);
        int escolha;
        int escolhaUm;
        int escolhaDois;
        System.out.println("Digite entre as opções 1, 2 ou 3. Sendo 1 para Cadastro de Livros, 2 para Consutar Livros e 3 para Efetuar venda. ");
        escolha = scan.nextInt();


        if (escolha == 1) {
            System.out.println("Digite o codigo do livro para cadastro: ");
            escolha=scan.nextInt();
            livraria.cadastrarLivro(livro1);
            System.out.println(livro1 +" Cadastrado!");
            System.exit(0);
        }

        if(escolha ==2){
            System.out.println("Digite o código do livro que deseja consultar: ");

            escolha=scan.nextInt();
            System.out.println(livraria.consultarLivro(escolha));

        }
        if(escolha==3){
            System.out.println("Informe o código do livro que foi vendido: ");
            escolha=scan.nextInt();
            livraria.efetuarVenda(escolha);

        }
    }
}
