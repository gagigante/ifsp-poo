/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class Livro extends Produto {
    private String autor;
    
    public Livro(String nome, double preco, String autor, int codigoBarras) {
        super(nome, preco, codigoBarras);
        
        this.autor = autor;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "; Preço: " + super.getPreco() + "; Autor: " + this.getAutor();
    }
}
