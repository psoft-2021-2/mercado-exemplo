package services;

import com.google.gson.Gson;

import DTO.LoteDTO;
import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;

public class LoteService {

	private LoteRepository loteRep;
	private ProdutoRepository produtoRep;
	private Gson gson = new Gson();
	
	public LoteService(LoteRepository loteRep, ProdutoRepository prodRep) {
		this.loteRep = loteRep;
		this.produtoRep = prodRep; 
	}
	
	public String addLote(String jsonData) {
		LoteDTO loteDTO = gson.fromJson(jsonData, LoteDTO.class);
		Produto prod = this.produtoRep.getProd(loteDTO.getIdProduto());
		
		Lote lote = new Lote(prod, loteDTO.getQuantidade());
		this.loteRep.addLote(lote);

		return lote.getId();
	}
}
