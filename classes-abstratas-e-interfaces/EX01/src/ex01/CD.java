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
public class CD extends Produto {
    private int numeroFaixas;
    
    public CD(String nome, double preco, int numeroFaixas, int codigoBarras) {
        super(nome, preco, codigoBarras);
        
        this.numeroFaixas = numeroFaixas;
    }
    
    public int getNumeroFaixas() {
        return this.numeroFaixas;
    }
    
    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "; Preço: " + super.getPreco() + "; Númeor de faixas: " + this.getNumeroFaixas();
    }
}
