package br.com.vvcurso.main;
import java.util.Scanner;

import br.com.vvcurso.entidade.IPedido;
import br.com.vvcurso.entidade.PedidoCaudaLonga;
import br.com.vvcurso.entidade.PedidoFolhaTrabalho;

public class AloMundo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o codigo do seu pedido: ");
		int codigoDigitado = scanner.nextInt();
		
		PedidoCaudaLonga pedido = new PedidoCaudaLonga();
		/*
		 * CODIGO = 10
		 * enderecoEntrega = SAO CAETANO
		 * */
		pedido.setCodigo(codigoDigitado);
		pedido.emitirNF();
		
		PedidoFolhaTrabalho pedidoFT = new PedidoFolhaTrabalho();
		/*
		 * CODIGO = 11
		 * 
		 * */
		pedidoFT.setCodigo(11);
		pedidoFT.emitirCupomFiscal();
		
		System.out.println(pedido.getCodigo());
		
		pagarPedido(new PedidoFolhaTrabalho());
	}

    public static void pagarPedido(IPedido pedido) {
    	pedido.pagar();
    }
}
