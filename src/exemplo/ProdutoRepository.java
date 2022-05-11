package exemplo;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

	private Map<String,Produto> catalogo = new HashMap<String,Produto>();
	
	public void addProduto(Produto p) {
		catalogo.put(p.getId(), p);
	}
	
	public void updateProduto(String nome, String newNome, String newFabricante) {
		Produto p = this.getProduto(nome);
		
		p.setNome(newNome);
		p.setFabricante(newFabricante);
	
	}
	
	public void removeProduto(String nome) {
		catalogo.remove(this.getProduto(nome).getId());
	}
	
	public Produto getProduto(String nome) {
		for(Produto p : catalogo.values()){
			if(p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;	
	}
	
	public void listarCatalogo() {
		System.out.println(catalogo.values()); 
	}
	
}
