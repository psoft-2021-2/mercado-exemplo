package facades;

import repositories.LoteRepository;
import repositories.ProdutoRepository;
import services.LoteService;
import services.ProdutoService;

import java.util.Collection;

import models.Produto; 

public class Facade {
	
	// Repositórios
	private ProdutoRepository produtoRep;
	private LoteRepository loteRep;
	
	// Serviços
	private ProdutoService produtoService; 
	private LoteService loteService;
	
	
	public Facade() {
		this.produtoRep = new ProdutoRepository();
		this.loteRep = new LoteRepository();
		this.produtoService = new ProdutoService(loteRep, produtoRep);
		this.loteService = new LoteService(loteRep, produtoRep);
	}
	
	public Collection<Produto> listarProdutos() {
		return this.produtoService.listarProdutos();
	}
	
	public Collection<Produto> findProdutosByName(String key, boolean withLote) {
		if(withLote) {
			return this.produtoService.listarProdsLoteByName(key);
		}
		return this.produtoService.listarProdsByName(key);	 	
	}
	
	public Collection<Produto> findProdutosByName(String key) {
		return this.findProdutosByName(key, false);
	}

	public String criarProduto(String data) {
		return this.produtoService.addProduto(data);
	}

	public String criarLote(String data) {
		return this.loteService.addLote(data);
	}
}
