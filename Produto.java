package projetoManha;

public class Produto {
	  private int id;
	    private String nome;
	    private double preco;
	    private int estoque;

	    public Produto(int id, String nome, double preco, int estoque) {
	        this.id = id;
	        this.nome = nome;
	        this.preco = preco;
	        this.estoque = estoque;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public int getEstoque() {
	        return estoque;
	    }

	    public void setEstoque(int estoque) {
	        this.estoque = estoque;
	    }

	    public void reduzirEstoque(int quantidade) {
	        if (estoque >= quantidade) {
	            this.estoque -= quantidade;
	        } else {
	            throw new IllegalArgumentException("Estoque insuficiente.");
	        }
	    }
	}
