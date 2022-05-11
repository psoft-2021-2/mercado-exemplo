package exemplo;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
	
	private Map<String,Produto> catalogo = new HashMap<String, Produto>();
	
	public String addProduto(Produto p){
		catalogo.put(p.getId(), p);
		return p.getId();
	}
	
	public Produto updateProduto(String nome) {
		Produto p = this.getProduto(nome);
		return p;
	}

	private Produto getProduto(String nome) {
		Produto retornaProduto = null;
		for(Produto p : catalogo.values()) {
			if (p.getNome().equals(nome)) {
				retornaProduto = p;
			}
		}
		return retornaProduto;
	}
}
