package models;
import java.util.Date;
import java.util.UUID;

public class Lote {
	
	private String id;
	
	private Produto produto;
	
	private int quantidade; 
	
	private Date dataFabricacao;
	
	private Date dataValidade; 
	
	public Lote(Produto produto, int quantidade) {
		
		this.id = UUID.randomUUID().toString();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public String toString() {
		return "Lote ID: " + getId() + " - Produto: " + getProduto().getNome() + " - " + getQuantidade() + " itens";
	}
}
