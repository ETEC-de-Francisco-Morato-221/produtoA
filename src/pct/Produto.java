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
public class Produto {
    private int codigo;
    private String descricao;
    private char setor; // 'M' 'A' 'B' 'P'
    private double preco;
    private boolean importado;
    private double precoDesconto;
    private String importadoTXT;
    
    
    
    public void imprimirProduto()
    {
        System.out.println("Código: " + this.codigo);
        System.out.println("Dscrição: " + this.descricao);
        System.out.println("Setor: " + this.setor);
        System.out.println("Preco: " + this.preco);
        System.out.println("Importado?: " + this.importadoTXT);

    }
    
    
    public void setCodigo(int codigo)
    { 
        if(codigo > 0)
        {
            this.codigo = codigo;
        } else
        {
            System.out.println("Código digitado invalido");
        }
    }
    
        
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void setSetor (char setor) 
    {
        this.setor = setor;
    }
    
    public void setPreco (double preco) 
    {
        if (preco > 0) 
        {
            this.preco = preco;
        } else 
        {
            System.out.println("Valor digitado invalido");
        }
        
    }
    
    public void setImportado (boolean importado) 
    {
        if (importado == true) 
        {
            this.importadoTXT = "Sim";
        }
        else 
        {
            this.importadoTXT = "Não";
        }
    }
      
    public void calcularProduto()
    {
        precoDesconto = preco * 0.9;
        System.out.println("Valor com desconto: " + precoDesconto);

    }
    
    
    


        
        

        
    
    
}