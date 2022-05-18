package models;
import java.util.UUID;

public class Produto {
	
	private String id;
	
	private String nome; 
	
	private String fabricante;
	
	private double preco;

	public Produto(String nome, String fabricante, double preco) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
		
	public String getId() {
		return id;
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
	
	public String toString() {
		return "Produto: " + getNome() + " - Fabricante: " + getFabricante();
	}
}
