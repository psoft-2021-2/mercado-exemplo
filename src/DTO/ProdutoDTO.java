package DTO;

public class ProdutoDTO {
	
	private String nome; 
	
	private String fabricante;
	
	private double preco;

	public ProdutoDTO(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public double getPreco() {
		return preco;
	}
}