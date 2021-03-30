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
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto media[] = new Produto[5];
        
        Livro l1 = new Livro("l1", 100.00, "Gabriel", 123);
        Livro l2 = new Livro("l2", 200.00, "Gabriel Souza", 123);
        Livro l3 = new Livro("l3", 300.00, "Itanu", 132);
        
        Livro l4 = new Livro("l1", 300.00, "Itanu", 999);
        
        CD cd1 = new CD("CD1", 10.00, 10, 321);
        DVD dvd1 = new DVD("dvd1", 30.00, 120, 231);
        
        media[0] = l1;
        media[1] = l2;
        media[2] = l3;
        media[3] = cd1;
        media[4] = dvd1;
        
        for (Produto item : media) {
            System.out.println(item.toString());
        }
        
        int resultadoBusca = buscaIndex(l4, media);
        
        if (resultadoBusca >= 0) {
            System.out.println("Objeto está na posição: " + resultadoBusca);
        } else {
            System.out.println("Objeto não foi encontrado");
        }
    }

    public static int buscaIndex(Produto procura, Produto[] lista) {
         int counter = 0;
        
        for (Produto item : lista) {
            if (item.equals(procura)) {
                return counter;
            }
            
            counter++;
        }
        
        return -1;
    }
}
