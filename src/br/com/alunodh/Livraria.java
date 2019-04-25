package br.com.alunodh;


import java.util.ArrayList;
import java.util.List;

public class Livraria {
    // Livro livro = new Livro(124, "A lua", "Luis", "01/01/19991", "8912798", 45);
    List<Livro> listaDaLivraria = new ArrayList<>();
    Livro listaDeLivro;


    public void cadastrarLivro(Livro livro) {

        listaDaLivraria.add(livro);


    }

    public int consultarLivro(int novoCodigo) {
       boolean achou=false;
       for (Livro listinha : listaDaLivraria) {
            if (listinha.getCodigo() == novoCodigo) {
             achou = true;
                System.out.println(listinha);

            } else {
                System.out.println("Livro não encontrado.");

            }

        }
        return novoCodigo;
    }


    public void efetuarVenda(int novoCodigo) {
        for (Livro livrinho : listaDaLivraria) {
            if (livrinho.getCodigo() == novoCodigo) {
                listaDaLivraria.remove(livrinho);
                System.out.println("Livro de codigo: " + novoCodigo + " foi vendido. ");
                System.out.println("Seu estoque agora é: " + (livrinho.getQuantidadeDeEstoque() - 1));
            } else {
                if (livrinho.getQuantidadeDeEstoque() <= 0) {
                    System.out.println("Estoque Esgotado!");
                }

            }
        }

    }


}


