package projetoManha;

public class Venda {
	private Produto produto;
	private int quantidade;
	private double valorTotal;
	private double soma;
	
	public Venda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = produto.getPreco() * quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public String toString() {
		return produto.getNome() + " - Quantidade: " + quantidade + " - Valor total: R$ " + valorTotal; 
	}
	
}
