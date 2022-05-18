package DTO;

public class LoteDTO {
	
	private String idProduto;
	
	private int quantidade; 
	
	public LoteDTO(String idProduto, int quantidade) {
		
		this.idProduto = idProduto;
		this.quantidade = quantidade;
	}
	
	public String getIdProduto() {
		return idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
