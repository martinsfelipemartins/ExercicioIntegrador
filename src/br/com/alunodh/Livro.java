package br.com.alunodh;

import java.util.List;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private String dataDeLancamento;
    private String codigoISBN;
    private int quantidadeDeEstoque;
    private float preco;

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", codigoISBN='" + codigoISBN + '\'' +
                ", quantidadeDeEstoque=" + quantidadeDeEstoque +
                ", preco=" + preco +
                '}';
    }

    public Livro(int codigo, String titulo, String autor, String dataDeLancamento, String codigoISBN, int quantidadeDeEstoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.dataDeLancamento = dataDeLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
