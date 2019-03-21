package br.com.vvcurso.entidade;

public class PedidoFolhaTrabalho extends Pedido {
	public void emitirCupomFiscal() {
	}

	@Override
	public void cancelar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar() {
		System.out.println("Pagando pedido FT");

	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub

	}
}
