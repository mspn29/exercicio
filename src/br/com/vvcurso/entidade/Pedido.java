package br.com.vvcurso.entidade;

public abstract class Pedido implements IPedido {
  protected int codigo;
  
  public int getCodigo() {
	  return codigo;
  }
  
  public void setCodigo(int novoCodigo) {
	  codigo = novoCodigo;
  }
  
  public void pagar() {
	  System.out.println("Estou pagando de forma generica");
  }
}
