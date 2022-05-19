package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;

import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;
import DTO.ProdutoDTO;

public class ProdutoService {
	
	private LoteRepository loteRep;
	private ProdutoRepository prodRep;
	private Gson gson = new Gson();
	
	public ProdutoService(LoteRepository loteRep, ProdutoRepository prodRep) {
		this.loteRep = loteRep;
		this.prodRep = prodRep;
	}
	
	public Collection<Produto> listarProdutos() {
		return this.prodRep.getAll();
	}
	
	public List<Produto> listarProdsLoteByName(String nome) {
		List<Produto> prods = getProdsWithLote();
		return getProdsByName(nome, prods);
	}

	public List<Produto> listarProdsByName(String nome) {
		return getProdsByName(nome, this.prodRep.getAll());
	}

	private List<Produto> getProdsByName(String nome, Collection<Produto> prods) {
		List<Produto> prodsResult = new ArrayList<Produto>();
		for (Produto produto : prods) {
			if(produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
				prodsResult.add(produto);
			}
		}	
		return(prodsResult);
	}
	
	private List<Produto> getProdsWithLote() {
		List<Produto> prods = new ArrayList<Produto>();
		for (Lote lote : this.loteRep.getAll()) {
			prods.add(lote.getProduto());
		}
		return(prods);
	}

	public String addProduto(String jsonData) {
		ProdutoDTO prodDTO= gson.fromJson(jsonData, ProdutoDTO.class);
		Produto produto = new Produto(prodDTO.getNome(), prodDTO.getFabricante(), prodDTO.getPreco());
		
		this.prodRep.addProduto(produto);
		
		return produto.getId();
	}
}
