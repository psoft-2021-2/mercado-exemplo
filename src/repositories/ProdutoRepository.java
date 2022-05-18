package repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import models.Produto;

public class ProdutoRepository {
	
	private Map<String, Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<String, Produto>();
	}

	public Collection<Produto> getAll() {
		return produtos.values();
	}
	
	public Produto getProd(String id) {
		return this.produtos.get(id);
	}
	
	public void delProd(String id) {
		this.produtos.remove(id);
	}
	
	public void editProd(Produto prod) {
		this.produtos.replace(prod.getId(), prod);
	}
	
	public String addProduto(Produto prod) {
		this.produtos.put(prod.getId(), prod);
		return(prod.getId());
	}
}
