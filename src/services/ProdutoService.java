package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	LoteRepository loteRep;
	ProdutoRepository prodRep;
	
	public ProdutoService(LoteRepository loteRep, ProdutoRepository prodRep) {
		this.loteRep = loteRep;
		this.prodRep = prodRep;
	}
	
	public List<Produto> listarProdsLoteByName(String nome) {
		List<Produto> prods = getProdsWithLote();
		return getProdsByName(nome, prods);
	}

	public List<Produto> listarProdByName(String nome) {
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

	public void addProduto(Produto p) {
		this.prodRep.addProduto(p);
	}
}
