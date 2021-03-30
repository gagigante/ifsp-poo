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
public class DVD extends Produto {
    private int duracao;
    
    public DVD(String nome, double preco, int duracao, int codigoBarras) {
        super(nome, preco, codigoBarras);
        
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "; Preço: " + super.getPreco() + "; Duração: " + this.getDuracao();
    }
}
