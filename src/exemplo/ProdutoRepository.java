package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
	private Map<String, Produto> catalogo;
	
	public ProdutoRepository() {
		this.catalogo = new HashMap<String, Produto>();
	}
	
	public void addProduto(Produto p) {
		this.catalogo.put(p.getId(), p);
	}
	
	public void editarProduto(Produto p) {
		this.addProduto(p);
	}
	
	public Produto getProduto(String id) {
		return this.catalogo.get(id);
	}
	
	public ArrayList<Produto> getAllProduto() {
		return (ArrayList<Produto>) this.catalogo.values();
	}
	
	public void removerProduto(String id) {
		this.catalogo.remove(id);
	}
}

