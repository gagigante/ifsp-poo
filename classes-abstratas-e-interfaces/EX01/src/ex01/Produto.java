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
public abstract class Produto implements Comparable {
    private String nome;
    private double preco;
    private int codigoBarras;
    
    public Produto(String nome, double preco, int codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigoBarras() {
        return this.codigoBarras;
    }
    
    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public boolean equals(Produto x) {
        if (this.getCodigoBarras() == x.getCodigoBarras()) {
            return true;
        }
        
        return false;
    }
     
    public abstract String toString();
    
    @Override
    public boolean comparaNome(Produto x) {
        if (this.getNome() == x.getNome()) {
            return true;
        }
        
        return false;
    };
}
