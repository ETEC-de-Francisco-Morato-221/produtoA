/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Arthur
 */
public class TesteProduto {
        public static void main (String []args) { 
        Produto produto = new Produto();
        
        produto.setCodigo (10);
        produto.setDescricao ("Chocolate");
        produto.setSetor ('M');
        produto.setPreco (10.00);
        produto.setImportado (true);
        
        produto.imprimirProduto();
        
        produto.calcularProduto();
            
    }
    
}
